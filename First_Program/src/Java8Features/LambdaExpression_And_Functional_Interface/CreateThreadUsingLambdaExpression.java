package Java8Features.LambdaExpression_And_Functional_Interface;

public class CreateThreadUsingLambdaExpression implements Runnable{
    @Override
    public void run(){
        for(int i=1; i<=10; i++){
            System.out.println("Number: " + i);
        }
    }

}
