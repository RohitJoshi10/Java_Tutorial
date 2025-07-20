package Multithreading_In_Java.ExecutorFramework;

import java.util.Arrays;
import java.util.List;
import java.util.concurrent.*;

public class ExecutorServiceMethodInvokeAny {
    public static void main(String[] args) throws InterruptedException {
        ExecutorService executorService = Executors.newFixedThreadPool(2);

        Callable<Integer> callable1 = () -> {
            Thread.sleep(1000);
            System.out.println("Task 1");
            return 1;
        };

        Callable<Integer> callable2 = () -> {
            Thread.sleep(1000);
            System.out.println("Task 2");
            return 2;
        };

        Callable<Integer> callable3 = () -> {
            Thread.sleep(1000);
            System.out.println("Task 3");
            return 3;
        };

        List<Callable<Integer>> list = Arrays.asList(callable1, callable2, callable3);

        try {
            Integer i = executorService.invokeAny(list); // Ye future nhi deta hai
            System.out.println(i);
        }catch (InterruptedException e){
            throw new RuntimeException(e);
        } catch (ExecutionException e) {
            throw new RuntimeException(e);
        }

        executorService.shutdown();
        System.out.println("Hello World");
    }
}
