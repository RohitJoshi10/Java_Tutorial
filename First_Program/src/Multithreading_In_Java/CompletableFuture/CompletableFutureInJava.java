package Multithreading_In_Java.CompletableFuture;

import java.util.concurrent.CompletableFuture;
import java.util.concurrent.ExecutionException;

// Example-1
public class CompletableFutureInJava {
    public static void main(String[] args) {
        // Ye Demon thread hai by default
        CompletableFuture<String> completableFuture = CompletableFuture.supplyAsync(() -> {
            try {
                Thread.sleep(5000);
                System.out.println("Worker");
            } catch (Exception e) {

            }
            return "Ok";
        });

        String s = null;
        try{
            s = completableFuture.get();
        } catch (InterruptedException e){
            throw new RuntimeException(e);
        } catch (ExecutionException e){
            throw new RuntimeException(e);
        }
        System.out.println(s);
        System.out.println("Main");
    }
}


// Example-2
//public class CompletableFutureInJava {
//    public static void main(String[] args) {
//        // Ye Demon thread hai by default
//        CompletableFuture<String> f1 = CompletableFuture.supplyAsync(() -> {
//            try {
//                Thread.sleep(5000);
//                System.out.println("Worker");
//            } catch (Exception e) {
//
//            }
//            return "Ok";
//        });
//
//
//        CompletableFuture<String> f2 = CompletableFuture.supplyAsync(() -> {
//            try {
//                Thread.sleep(5000);
//                System.out.println("Worker");
//            } catch (Exception e) {
//
//            }
//            return "Ok";
//        });
//
//        CompletableFuture<Void> f = CompletableFuture.allOf(f1, f2);
//        f.join();
//        System.out.println("Main");
//
//    }
//}
