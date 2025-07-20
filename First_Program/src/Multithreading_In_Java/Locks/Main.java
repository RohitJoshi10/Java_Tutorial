package Multithreading_In_Java.Locks;

public class Main {
    public static void main(String[] args) {
        BankAccount sbi = new BankAccount();

        // Runnable Interface object bana lia h humne seprate class na bana k on the go uska implemnetation class bana lia h. Humne seprate class na bana k ek anonymous class bana lia h
        Runnable task = new Runnable() {
            @Override
            public void run() {
                try {
                    sbi.withdraw(50);
                } catch (InterruptedException e) {
                    throw new RuntimeException(e);
                }
            }
        };

        Thread t1 = new Thread(task, "Thread 1");
        Thread t2 = new Thread(task, "Thread 2");
        t1.start();
        t2.start();

    }
}
