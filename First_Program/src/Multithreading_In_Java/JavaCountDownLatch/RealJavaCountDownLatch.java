package Multithreading_In_Java.JavaCountDownLatch;


import java.util.concurrent.*;

//public class RealJavaCountDownLatch {
//    public static void main(String[] args) throws ExecutionException, InterruptedException {
//
//        // With executor Service
//        int numberOfService = 3; // Kitne kaam karane hai
//        ExecutorService executorService = Executors.newFixedThreadPool(numberOfService);
//        CountDownLatch latch = new CountDownLatch(numberOfService); // Used when we want to wait for the completion of more than one thread.
//        executorService.submit(new MyDependentService(latch));
//        executorService.submit(new MyDependentService(latch));
//        executorService.submit(new MyDependentService(latch));
//        latch.await(); // When countdown becomes 0 then main method will start.
//        System.out.println("Main");
//        executorService.shutdown();
//    }
//}
//
//class MyDependentService implements Callable<String> {
//
//    private final CountDownLatch latch; // Ye assign sirf ussi se hoga jo aap constructor mai send kroge.
//
//    public MyDependentService(CountDownLatch latch){
//        this.latch = latch;
//    }
//
//    @Override
//    public String call() throws Exception{
//        try{
//            System.out.println(Thread.currentThread().getName() + " service started.");
//            Thread.sleep(2000);
//        }finally {
//            latch.countDown();
//        }
//        return "ok";
//    }
//
//}




public class RealJavaCountDownLatch {
    public static void main(String[] args) throws ExecutionException, InterruptedException {

        // Without executor Service
        int numberOfService = 3; // Kitne kaam karane hai
        CountDownLatch latch = new CountDownLatch(numberOfService);
        for(int i=0; i<numberOfService; i++)
        {
            new Thread(new MyDependentService(latch)).start();
        }
        latch.await(5, TimeUnit.SECONDS);
        System.out.println("Main");
    }
}

class MyDependentService implements Runnable{

    private final CountDownLatch latch; // Ye assign sirf ussi se hoga jo aap constructor mai send kroge.

    public MyDependentService(CountDownLatch latch){
        this.latch = latch;
    }

    @Override
    public void run(){
        try{
            Thread.sleep(6000);
            System.out.println(Thread.currentThread().getName() + " service started.");
        }catch (InterruptedException e){
            throw new RuntimeException(e);
        } finally {
            latch.countDown();
        }
    }

}