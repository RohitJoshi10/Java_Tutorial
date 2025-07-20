package Functions;
import java.util.Scanner;

public class Function{
    public static int findAvg(int num1, int num2)
    {
        return (num1+num2)/2;
    }
    public static void main(String []args){
        Scanner sc = new Scanner(System.in);

        int num1, num2;
        System.out.println("Enter first number: ");
        num1 = sc.nextInt();

        System.out.println("Enter second number: ");
        num2 = sc.nextInt();

        System.out.println("Average of first and second number is: " + findAvg(num1, num2));
        System.out.println("Sum of first and second number is: " + findSum(num1, num2));
        System.out.println("Maximum of both number is: " + findMax(num1, num2));
    }

    public static int findSum(int num1, int num2)
    {
        return num1+num2;
    }

    static int findMax(int num1, int num2)
    {
        if(num1 > num2) return  num1;
        else if (num2 > num1) return num2;
        else return -1;
    }

}

//Here's a breakdown of the keywords in public static void main:
//public: This access modifier makes the main method accessible from anywhere, including other classes and packages.
//static: This keyword makes the main method a class-level method, allowing it to be called without creating an object of the class.
//void: This return type indicates that the main method does not return any value.
//main: This is the name of the method, and it's the entry point for the Java program.
//      (String[] args): This parameter allows you to pass command-line arguments to your program.

// static method k ander se sirf static method he call hota hai so agr kisi method ko hum
// main method (which is static) se call karate hai toh usse static banna hota hai.