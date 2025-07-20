package Multithreading_In_Java.Locks;

import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReadWriteLock;
import java.util.concurrent.locks.ReentrantReadWriteLock;

public class ReadWriteCounter {
    private int count = 0;
    private final ReadWriteLock lock = new ReentrantReadWriteLock();
    private final Lock readLock = lock.readLock();
    private final Lock writeLock = lock.writeLock();

    private void increment(){
        writeLock.lock();
        try{
            count++;
        }finally {
            writeLock.unlock();
        }
    }

    // Agr simple lock hota toh dusre thread ko wait krna padte iske khtm hone ka tabhi wo read kr  pata but isme multiple thread read kr skte h.
    public int getCount(){
        readLock.lock();
        try{
            return count;
        }finally {
            readLock.unlock();
        }
    }

    public static void main(String[] args) throws InterruptedException {
        ReadWriteCounter counter = new ReadWriteCounter();


        // Ye wo kaam krre hai jo thread se karana h hume
        Runnable readTask = new Runnable() {
            @Override
            public void run() {
                 for(int i=0; i<10; i++){
                     System.out.println(Thread.currentThread().getName() + " read " + counter.getCount());
                 }
            }
        };

        // Ye wo kaam krre hai jo thread se karana h hume
        Runnable writeTask = new Runnable() {
            @Override
            public void run() {
                 for(int i=0; i<10; i++){
                     counter.increment();
                     System.out.println(Thread.currentThread().getName() + " incremented");
                 }
            }
        };

        Thread writerThread = new Thread(writeTask);
        Thread readerThread1 = new Thread(readTask);
        Thread readerThread2 = new Thread(readTask);

        writerThread.start();
        readerThread1.start();
        readerThread2.start();

        writerThread.join();
        readerThread1.join();
        readerThread2.join();

        System.out.println("Final count: " + counter.getCount());
    }
}


// Jo bhi hume kaaam karna hota h toh wo krne k liye hum ek class bante hai jo ki implement krri hoti h runnable interface ko
// And yaha pe do class banayi h humne jo ki anonymous class h readTaks and writeTask.