package Multithreading_In_Java.JavaCyclicBarrier;

import java.text.spi.BreakIteratorProvider;
import java.util.concurrent.BrokenBarrierException;
import java.util.concurrent.CyclicBarrier;

public class ExampleOfCyclicBarrier {
    public static void main(String[] args) {
        int numberOfSubSystems = 4;

        // Hume CyclicBarrier k constructor mai he dal dere h ki iss run ko tab chalana jab saare threads chl jaye. it is a barrier action.
        CyclicBarrier barrier = new CyclicBarrier(numberOfSubSystems, new Runnable() {
            @Override
            public void run() {
                System.out.println("All subsystems are up and running. System startup completed.");
            }
        });

        Thread webServerThread = new Thread(new Subsystem("Web Server",2000,barrier));
        Thread databaseThread = new Thread(new Subsystem("Database",4000,barrier));
        Thread cacheThread = new Thread(new Subsystem("Cache",3000,barrier));
        Thread messagingServiceThread = new Thread(new Subsystem("Messaging Service",3500,barrier));

        webServerThread.start();
        databaseThread.start();
        cacheThread.start();
        messagingServiceThread.start();
    }
}

class Subsystem implements Runnable{
    private String name;
    private int initializationTime;
    private CyclicBarrier barrier;

    public Subsystem(String name, int initializationTime, CyclicBarrier barrier){
        this.name = name;
        this.initializationTime = initializationTime;
        this.barrier = barrier;
    }

    @Override
    public void run(){
        try{
            System.out.println(name + " initialization started");
            Thread.sleep(initializationTime); // Simulate the time to initialize
            System.out.println(name + " initialization complete");
            barrier.await();
        } catch (InterruptedException | BrokenBarrierException e){
            e.printStackTrace();
        }
    }
}