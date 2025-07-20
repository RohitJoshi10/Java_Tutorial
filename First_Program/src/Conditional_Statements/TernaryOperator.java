package Conditional_Statements;
import java.util.Scanner;

public class TernaryOperator{
    public static void main(String[] agrs){
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the value of x: ");
        int x = sc.nextInt();

        System.out.println("Enter the value of y: ");
        int y = sc.nextInt();

        boolean ans =  (x > y) ? true : false;

        System.out.println(ans);
    }
}
