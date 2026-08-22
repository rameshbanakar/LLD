package Seamaphores;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Semaphore;

public class Client {
    public static void main(String[] args) {
        Store store=new Store(5);

        Semaphore producerSemaphore=new Semaphore(5);
        Semaphore consumerSemaphore=new Semaphore(0);

        ExecutorService ex= Executors.newCachedThreadPool();

        for(int i=0;i<6;i++){
            Producer p=new Producer(store,producerSemaphore,consumerSemaphore);
            ex.execute(p);
        }
        for(int i=0;i<2;i++){
            Consumer c=new Consumer(store,producerSemaphore,consumerSemaphore);
            ex.execute(c);
        }
        ex.shutdown();
    }
}
