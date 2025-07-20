package Multithreading_In_Java.Thread_Methods;

public class My_setDaemon extends Thread{
    @Override
    public void run(){
        while (true){
            System.out.println("Hello world");
        }
    }

    public static void main(String[] args) {
        My_setDaemon t1 = new My_setDaemon(); // This is a user thread in which we perform our business work.
        t1.setDaemon(true); // Isse hua ye ki t1 ab ek deamon thread ban gya jaise he main thread compelete hoga ye bnd ho jayega even though we have given infinite loop
        t1.start();
        System.out.println("Main done");
    }
}

// Daemon Thread: Ye wo thread hote hai jo background mai chlte hai. Jaise ki java k ande garbage collector.
// But JVM will not wait for deamon thread
// Deamon thread will get terminated automatically when user thread has performed it's execution.