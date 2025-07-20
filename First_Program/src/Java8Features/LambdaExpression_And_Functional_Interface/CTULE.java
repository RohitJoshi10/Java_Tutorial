package Java8Features.LambdaExpression_And_Functional_Interface;

public class CTULE {
    public static void main(String[] args) {
//        CreateThreadUsingLambdaExpression obj = new CreateThreadUsingLambdaExpression();
//        Thread thread = new Thread(obj); // Iske constructor mai pass krte hai runnable ki implementation class ka obj.
//        thread.run();

        // Using Lmbda Expression
        Runnable runnable = () -> {
            for(int i=1; i<=10; i++)
            {
                System.out.println("Numberr: " + i);
            }
        };

        Thread thread = new Thread(runnable);
        thread.start();
    }
}
