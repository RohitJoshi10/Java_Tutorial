package Multithreading_In_Java.LambdaExpression;

public class LambdaExpression {
    public static void main(String[] args) {
        // Ek implementation class na create krke humne ek anonymous class create kr di h.
        Runnable runnable = () -> System.out.println("Hello");
        Thread t1 = new Thread(runnable);
        t1.start();
    }
}


/*
// Ek implementation class na create krke humne ek anonymous class create kr di h.
        Runnable runnable = new Runnable() {
            @Override
            public void run() {
                System.out.println("Hello");
            }
        };

// The above thing can be replaced with lambda expression
       Runnable runnable = () -> System.out.println("Hello");

*/