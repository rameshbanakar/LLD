package Synchronization;

import java.util.concurrent.Callable;
import java.util.concurrent.locks.Lock;

public class Adder implements Callable<Void> {
    Value value;
    private Lock lock;
    Adder(Value value, Lock lock){
        this.value=value;
        this.lock=lock;
    }

    @Override
    public synchronized Void call() throws Exception {
//        this.lock.lock();
            for (int i = 0; i < 100; i++) {
                synchronized (value){
                    System.out.println("adding");
                    this.value.x += 1;
                }

            }

//        this.lock.unlock();
        return null;
    }
}
