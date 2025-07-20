package Multithreading_In_Java.Locks;

import java.util.concurrent.TimeUnit;
import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

public class BankAccount {
    private int balance = 100;

    private final Lock lock = new ReentrantLock(); // It is a  class which implements Lock. You can also make it final so that nobody can change it.

    public   void withdraw(int amount) throws InterruptedException {
        System.out.println(Thread.currentThread().getName() + " attempting to withdraw " + amount);
        try{
            if(lock.tryLock(1000, TimeUnit.MILLISECONDS)){
                if(balance >= amount){
                    try{
                        System.out.println(Thread.currentThread().getName() + " proceeding with withdrawal " + amount);
                        Thread.sleep(3000);
                        balance -= amount;
                        System.out.println(Thread.currentThread().getName() + " completed withdrawal. Remaning Balance: " + balance);
                    } catch (Exception e){
                        Thread.currentThread().interrupt();
                    } finally {
                        lock.unlock(); // We are doing unlock in finally because finally block mai hum resources ko release krte h.
                    }
                }else{
                    System.out.println(Thread.currentThread().getName() + " insufficient balance " + amount);
                }
            }else{
                System.out.println(Thread.currentThread().getName() + " could not acquire the lock we will try again later. ");
            }
        } catch (Exception e){
            Thread.currentThread().interrupt(); // We are restoring the state of the thread if it is lost in any case logging it can't simply help's that's why it is s good practice to use this also sot that you can restore the lost state of the thread.
        }


   }
}


// Phele lock wait ni krra tha agr available hai toh return true else false isliye try catch ki jarrot ni thi.
// But ab lock wait krega utne millisec and tab return krega  true ya false...yaha pe wait hora tha toh interruption error aa skta h jab koi dusra thread usko acqurie krne ki kosis kre islye catch block lagaya h.

