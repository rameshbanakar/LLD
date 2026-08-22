package Seamaphores;

import java.util.concurrent.Semaphore;

public class Producer implements Runnable{
    private Store store;
    private Semaphore producerSemaphore;
    private Semaphore consumerSemaphore;

    Producer(Store store,Semaphore producerSemaphore,Semaphore consumerSemaphore){
        this.store=store;
        this.producerSemaphore=producerSemaphore;
        this.consumerSemaphore=consumerSemaphore;
    }

    @Override
    public void run() {
        while(true){
            try {
                producerSemaphore.acquire();
                if(store.getItems().size()<Store.getMaxSize()){
                    System.out.println("Produced Item+ "+store.getItems().size());
                    store.add(new Object());
                }
                consumerSemaphore.release();
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
        }


    }
}
