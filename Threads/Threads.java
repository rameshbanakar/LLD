
package Threads;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

class myThread extends Thread{
    public void run(){

        System.out.println("Hello world "+Thread.currentThread().getName());
    }
}

class MyRunnable implements Runnable{
     String name;
     MyRunnable(String name){
         this.name=name;

     }
    @Override
    public void run() {
        printing(this.name);
    }

    public static void printing(String name){
        System.out.println(name+" hello "+Thread.currentThread().getName());
    }
}
public class Threads{
    public static void main(String[] args) {
        System.out.println("Hello");
//
//        myThread my=new myThread();
//        myThread my1=new myThread();
//        myThread my2=new myThread();
//        myThread my3=new myThread();
//
//
//        my.start();
//        my1.start();
//        my2.start();
//        my3.start();


        ExecutorService executorService= Executors.newFixedThreadPool(5);
        for(int i=0;i<100;i++){
            MyRunnable my= new MyRunnable("Ramesh");
            executorService.execute(my);
        }


    }
}