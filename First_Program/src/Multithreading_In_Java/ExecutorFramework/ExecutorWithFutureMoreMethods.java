package Multithreading_In_Java.ExecutorFramework;

import java.util.concurrent.*;

public class ExecutorWithFutureMoreMethods {
    public static void main(String[] args) {
        ExecutorService executorService = Executors.newSingleThreadExecutor();
        Future<Integer> future = executorService.submit(() -> {
            try{
                Thread.sleep(2000);
            }catch (InterruptedException e){
                System.out.println("Exception occured: " + e);
            }
            return 42;
        });

        Integer i = null;
        try{

            i = future.get(1, TimeUnit.SECONDS);
            System.out.println(future.isDone());
            System.out.println(i);
        } catch (InterruptedException | ExecutionException | TimeoutException e){
            System.out.println("Exception occured: " + e);
        }
    }
}
