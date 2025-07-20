package Multithreading_In_Java.ExecutorFramework;

import java.util.concurrent.*;

public class ExecutorWithFuture {
    public static void main(String[] args) throws ExecutionException, InterruptedException {
        ExecutorService executorService = Executors.newSingleThreadExecutor();
        Callable<String> callable = () -> "Hello"; // Jab kuch return krna h toh use callable else use runnable
        Future<?> future = executorService.submit(callable);
        System.out.println(future.get()); // Wait get wala krega
        if(future.isDone()) {
            System.out.println("Task is done !");
        }
        executorService.shutdown();
    }
}
