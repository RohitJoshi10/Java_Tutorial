package Multithreading_In_Java.Java_Thread;

public class World extends Thread{
    @Override
    public void run() {
        for(; ; ){
            System.out.println(Thread.currentThread().getName());
        }
    }
}
