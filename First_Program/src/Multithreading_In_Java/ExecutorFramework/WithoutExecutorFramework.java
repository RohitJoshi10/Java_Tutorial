package Multithreading_In_Java.ExecutorFramework;

public class WithoutExecutorFramework {
    public static void main(String[] args) throws InterruptedException {
        long startTime = System.currentTimeMillis(); // Ye deta h mili sec 1 jan 1970 se lekar ab tak jitna time beet gya hai.
        Thread[] threads = new Thread[9];
        for(int i=1; i<10; i++){
            int finalI = i;
             threads[i-1] = new Thread(
                    () -> {
                        long result = factorial(finalI);
                        System.out.println(factorial(result));
                    }
            );

            threads[i-1].start();
        }

        // Waiting for All threads to finish their execution
        for(Thread thread : threads){
            try{
                thread.join();
            } catch (InterruptedException e){
                Thread.currentThread().interrupt();
            }
        }

        System.out.println("Total time: " + (System.currentTimeMillis() - startTime));
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

