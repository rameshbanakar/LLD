import java.util.concurrent.*;

class MyThread extends Thread{

    public void run() {
        System.out.println(Thread.currentThread().getName());
        System.out.println("Hello world");
    }
}

class MyRunnable implements Runnable{

    @Override
    public void run() {
        System.out.println(Thread.currentThread().getName());
        System.out.println("Hello world");
    }
}

class MyCallable implements Callable<Object> {

    @Override
    public Object call() {
        return 10;
    }
}


public class Main{
    public static void main(String[] args) throws InterruptedException, ExecutionException {
//        System.out.println(Thread.currentThread().getName());
//        Thread t=new Thread(new MyThread());
//        t.start();

//        Runnable run=new MyRunnable();
//        Thread th=new Thread(run);
//        th.start();

        ExecutorService executorService= Executors.newCachedThreadPool();
//        Runnable run=new MyRunnable();
//        for(int i=0;i<1000;i++){
//            executorService.execute(run);
//        }


        Callable<?> cl=new MyCallable();
        Future<?> future=executorService.submit(cl);
        Object val=future.get();
        System.out.println(val);
        executorService.shutdown();

        int cores=Runtime.getRuntime().availableProcessors();
        System.out.println(cores);


    }
}