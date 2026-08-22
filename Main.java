import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

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

public class Main{
    public static void main(String[] args) {
//        System.out.println(Thread.currentThread().getName());
//        Thread t=new Thread(new MyThread());
//        t.start();

//        Runnable run=new MyRunnable();
//        Thread th=new Thread(run);
//        th.start();

        ExecutorService executorService= Executors.newCachedThreadPool();
        Runnable run=new MyRunnable();
        for(int i=0;i<1000;i++){
            executorService.execute(run);
        }
        executorService.shutdown();








    }
}