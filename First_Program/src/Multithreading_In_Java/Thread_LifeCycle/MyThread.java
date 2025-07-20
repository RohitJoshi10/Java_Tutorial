package Multithreading_In_Java.Thread_LifeCycle;

public class MyThread extends Thread{
    @Override
    public void run() {
        System.out.println("RUNNING");
        try{
            Thread.sleep(5000);
        } catch (InterruptedException e){
            System.out.println(e);
        }
    }

    public static void main(String[] args) throws InterruptedException {
        MyThread t1 = new MyThread();
        System.out.println(t1.getState());
        t1.start();
        System.out.println(t1.getState());

        Thread.sleep(100); // Main method ko 100 mili_sec k liye sleep kara dia so that the OS/JVM start executing the run method. Jab wo sleep krra hai tab uski state ko bola ja raha hai timed waiting
        System.out.println(t1.getState());
        t1.join(); // Caller of this statement is main(Main thrad wait for t1 thread to get finished): Jispe aap call krre ho usko finish hone ka intezaar krra hai main thread.
        System.out.println(t1.getState());


    }
}


// Here state is an enum
// State = [NEW, RUNNABLE, BLOCKED, WAITING, TIMED_WAITING, TERMINATED]
// Here we don't get running state
// Runnable ko he running bola jata hai ...ya toh thread run hora hai ya fir wo ready to run hai