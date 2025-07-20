package Operators;
import  java.util.Scanner;

public class UserInput {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter your age: ");
        int age = sc.nextInt();
        System.out.println("Your age is "+age);

        System.out.println("Enter the first number: ");
        long firstNumber = sc.nextLong();
        System.out.println("Enter the second number");
        long secondNumber = sc.nextLong();
        long result = firstNumber + secondNumber;
        System.out.println("The addition of first and second number is: "+result);

        float floatResult = (float) (firstNumber + secondNumber);
        System.out.println("The result in floating point is: "+floatResult);



//        System.out.println("Enter your Place: ");
//        String s1 = sc.nextLine();
//        System.out.println(s1);

        System.out.println("Enter your name: ");
        String s = sc.next();
        System.out.println(s);

        sc.close();

    }
}
