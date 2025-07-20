package Multithreading_In_Java.JavaCyclicBarrier;

import java.util.concurrent.*;

public class CyclicBarrierInJava {
    public static void main(String[] args) throws ExecutionException, InterruptedException {
        int numberOfService = 3;
        ExecutorService executorService = Executors.newFixedThreadPool(numberOfService);
        CyclicBarrier barrier = new CyclicBarrier(numberOfService);
        executorService.submit(new OurDependentService(barrier));
        executorService.submit(new OurDependentService(barrier));
        executorService.submit(new OurDependentService(barrier));
        System.out.println("Main");
        executorService.shutdown();
    }
}


class OurDependentService implements Callable<String>{
    private final CyclicBarrier barrier;
    public OurDependentService(CyclicBarrier barrier){
        this.barrier = barrier;
    }

    @Override
    public String call() throws Exception{
        System.out.println(Thread.currentThread().getName() + " service started");
        Thread.sleep(6000);
        System.out.println(Thread.currentThread().getName() + " is waiting at the barrier");
        barrier.await(); // All threads wait here till all threads come here.
        return "OK";
    }
}