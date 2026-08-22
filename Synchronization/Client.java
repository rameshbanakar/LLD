package Synchronization;

import java.util.concurrent.*;
import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

class Value{
    int x;
    Value(int x){
        this.x=x;
    }
}
public class Client {
    public static void main(String[] args) throws ExecutionException, InterruptedException {
       Value value=new Value(0);

        Lock lock= new ReentrantLock();

        ExecutorService ex= Executors.newCachedThreadPool();

        Callable<?> adder=new Adder(value,lock);
        Callable<?> sub=new Subtractor(value,lock);

        Future<?>  future=ex.submit(adder);

        Future<?> future1=ex.submit(sub);
        future1.get();
        future.get();
        ex.shutdown();

        System.out.println(value.x);

    }
}
