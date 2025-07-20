package Conditional_Statements;
import java.util.Scanner;

public class IfElse{
    public static void main(String[] args){

        Scanner sc = new Scanner(System.in);

        System.out.println("Enter your age: ");
        int age  = sc.nextInt();

        if(age >= 18 && age <= 120)
        {
            System.out.println("You are right fit to vote.");
        }
        else if(age < 18 && age >= 1)
        {
            System.out.println("You are underage to vote.");
        }
        else if(age < 1 || age > 120 && age <= 125)
        {
            System.out.println("You are too young or too old");
        }
        else {
            System.out.println("You entered a wrong choice !");
        }
    }
}
