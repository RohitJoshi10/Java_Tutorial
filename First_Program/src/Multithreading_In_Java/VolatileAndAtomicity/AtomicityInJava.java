package Multithreading_In_Java.VolatileAndAtomicity;


// This code should give the value of counter as 2000 but it is not giving we can  resolve this issue  by adding synchronized keyword.
//public class AtomicityInJava {
//    private int counter = 0;
////    public synchronized void increment(){
////        counter++;
////    }
//public synchronized void increment(){
//    counter++;
//}
//
//    public int getCounter(){
//        return counter;
//    }
//
//    public static void main(String[] args) throws InterruptedException {
//        AtomicityInJava ac = new AtomicityInJava();
//        Thread t1 = new Thread(() -> {
//           for(int i=0; i<1000; i++){
//               ac.increment();
//           }
//        });
//        Thread t2 = new Thread(() -> {
//           for(int i=0; i<1000; i++){
//               ac.increment();
//           }
//        });
//
//        t1.start();
//        t2.start();
//        t1.join();
//        t2.join();
//        System.out.println(ac.getCounter());
//    }
//}


import java.util.concurrent.atomic.AtomicInteger;

// But we can use Atomicity to resolve this issue as it is thread safe
public class AtomicityInJava {
    private AtomicInteger counter = new AtomicInteger(0);

    public synchronized void increment(){
        counter.getAndIncrement();
    }

    public int getCounter(){
        return counter.get();
    }

    public static void main(String[] args) throws InterruptedException {
        AtomicityInJava ac = new AtomicityInJava();
        Thread t1 = new Thread(() -> {
            for(int i=0; i<1000; i++){
                ac.increment();
            }
        });
        Thread t2 = new Thread(() -> {
            for(int i=0; i<1000; i++){
                ac.increment();
            }
        });

        t1.start();
        t2.start();
        t1.join();
        t2.join();
        System.out.println(ac.getCounter());
    }
}
