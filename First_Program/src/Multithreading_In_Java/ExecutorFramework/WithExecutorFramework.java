package Multithreading_In_Java.ExecutorFramework;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.TimeUnit;

public class WithExecutorFramework {
    public static void main(String[] args) throws InterruptedException {
        ExecutorService executor =  Executors.newFixedThreadPool(3);
        for(int i=1; i<10; i++) {
            int finalI = i;
            executor.submit(() -> {
                long result = factorial(finalI);
                // System.out.println(Thread.currentThread().getName() + " is executing task and result is: " + result );
                System.out.println(result);
            });
        }

        executor.shutdown(); // We need to manually shutdown it. Iske baad k naye task submit krna band kr deta h means iske baad  jo likha h wo submit ni hoga. Pura shutdown hone se phele ye previously submitted task ko pura hone ka wait krega.
    }

    // Function for finding the factorial of a number
    private static long factorial(long n){
        try{
            Thread.sleep(1000);
        } catch (InterruptedException e){
            throw new RuntimeException(e);
        }
        long result = 1;
        for(int i=1; i<=n; i++){
            result *= i;
        }
        return result;
    }
}

