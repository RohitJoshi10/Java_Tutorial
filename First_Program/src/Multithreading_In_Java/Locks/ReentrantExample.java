package Multithreading_In_Java.Locks;

import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

public class ReentrantExample {
    private final Lock lock = new ReentrantLock();

    public void outerMethod(){
        lock.lock(); //  lock.lockInterruptibly();
        try{
            System.out.println("Outer Method");
            innerMethod();
        } finally {
            lock.unlock();
        }
    }

    public void innerMethod(){
        lock.lock(); // Iska matlb ye h ki jo lock phele se he lga hua h usko mai firse lock krne ki try krra hu and ye toh gadbad h. Matlab mai apne ke lock ka intezzar krra hu ki ye kb khtm hoga and ye he h deadlock. Outer method inner pe depend krra h and outer inner pe depend krra h.
        try{
            System.out.println("Inner Method");
        } finally {
            lock.unlock();
        }
    }

    public static void main(String[] args) {
        ReentrantExample example = new ReentrantExample();
        example.outerMethod();
    }
}

// Reentrant lock  jab hum use krte h toh ek count maintain kia jata h ki lock kitni baar acquire kia gya h.
// Each lock call must be paired with unlock call.
