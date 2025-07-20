package Multithreading_In_Java.ThreadCommunication;

class SharedResource{
    private int data;
    private boolean hasData;

    public synchronized void produce(int value){
        // Jab data buffer mai already produced hai toh aur kyu produced krna hai.
        while (hasData){
            try{
                wait();
            } catch (InterruptedException e){
                Thread.currentThread().interrupt();
            }
        }

        data = value;
        hasData = true;
        System.out.println("Produced: " + value);
        notify(); // Dusre thread ko bata do
    }

    public synchronized int consume(){
        // Consume tab krega jab data hoga and agar data nhi h toh usko wait krna padega.
        while(!hasData){
            try{
                wait();
            }catch (InterruptedException e){
                Thread.currentThread().interrupt();
            }
        }

        // Agr data hai toh consume krao by returning it.
        hasData = false;
        System.out.println("Consumed: " + data);
        notify();
        return data;
    }
}

class Producer implements Runnable{
    private SharedResource resource;

    public Producer(SharedResource resource){
        this.resource = resource;
    }

    @Override
    public void run(){
        for (int i=0; i<10; i++){
            resource.produce(i);
        }
    }
}


class Consumer implements Runnable{
    private SharedResource resource;

    public Consumer(SharedResource resource){
        this.resource = resource;
    }

    @Override
    public void run(){
        for (int i=0; i<10; i++){
            int value = resource.consume();
        }
    }
}

public class ThreadCommunication {
    public static void main(String[] args) {
        SharedResource resource = new SharedResource();
        Thread producerThread = new Thread(new Producer(resource)); // Thread k ander producer ka object dena tha jo directly de dia idhr he.
        Thread consumerThread = new Thread(new Consumer(resource));

        producerThread.start();
        consumerThread.start();
    }
}
