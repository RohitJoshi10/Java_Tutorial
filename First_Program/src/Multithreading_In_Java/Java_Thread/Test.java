package Multithreading_In_Java.Java_Thread;

public class Test {
    public static void main(String[] args) {

        // For Thread Class
        World t1 = new World(); // NEW
        t1.start(); // RUNNABLE


        System.out.println(Thread.currentThread().getName());

        // Runnable Interface
//        World_Runnable worldRunnable = new World_Runnable();
//        Thread t1 = new Thread(worldRunnable);
//        t1.start();

        for(; ; ){
            System.out.println("Hello");
        }

    }
}


// To create thread in java, you can either extend the Thread class or implements the runnable interface.
