package Multithreading_In_Java.JavaCountDownLatch;

import java.util.concurrent.*;

// Problem if not use CountDownLatch
public class JavaCountDownLatch {
    public static void main(String[] args) throws ExecutionException, InterruptedException {
        ExecutorService executorService = Executors.newFixedThreadPool(3);
        Future<String> future1 = executorService.submit(new DependentService());
        Future<String> future2 = executorService.submit(new DependentService());
        Future<String> future3 = executorService.submit(new DependentService());

        future1.get();
        future2.get();
        future3.get();

        System.out.println("All dependent services finished. Starting main service...");
        executorService.shutdown();

    }
}


// Iss class mai wo likhenge jo hume thread se krwani h so either implements callable or runnable.
class DependentService implements Callable<String>{
    @Override
    public String call() throws Exception{
        System.out.println(Thread.currentThread().getName() + " service started.");
        Thread.sleep(2000);
        return "ok";
    }

}