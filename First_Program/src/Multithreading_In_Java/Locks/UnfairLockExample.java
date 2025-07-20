package Multithreading_In_Java.Locks;

import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

public class UnfairLockExample {
    private final Lock unfairLock = new ReentrantLock(true);

    public void accessResource(){
        unfairLock.lock();
        try{
            System.out.println(Thread.currentThread().getName() + " acquired the lock.");
            Thread.sleep(1000);
        } catch (InterruptedException e){
            Thread.currentThread().interrupt();
        } finally {
            System.out.println(Thread.currentThread().getName() + " released the lock.");
            unfairLock.unlock();
        }
    }

    public static void main(String[] args) {
        UnfairLockExample example = new UnfairLockExample();
        Runnable task = new Runnable() {
            @Override
            public void run() {
                example.accessResource();
            }
        };

        Thread t1 = new Thread(task, "Thread 1");
        Thread t2 = new Thread(task, "Thread 2");
        Thread t3 = new Thread(task, "Thread 3");
        Thread t4 = new Thread(task, "Thread 4");
        Thread t5 = new Thread(task, "Thread 5");
        Thread t6 = new Thread(task, "Thread 6");
        Thread t7 = new Thread(task, "Thread 7");
        Thread t8 = new Thread(task, "Thread 8");
        Thread t9 = new Thread(task, "Thread 9");
        Thread t10 = new Thread(task, "Thread 10");

        t1.start();
        t2.start();
        t3.start();
        t4.start();
        t5.start();
        t6.start();
        t7.start();
        t8.start();
        t9.start();
        t10.start();
    }
}
