package Loops;
import java.util.Scanner;
public class Loops {
    public static void main(String[] args){

        // For Loop
        System.out.println("Enter a number whose table you want: ");
        Scanner sc = new Scanner(System.in);
        int number = sc.nextInt();

        System.out.println("The table of "+ number+ " from 1-10 is: ");
        for(int i=1; i<=10; i++)
        {
            System.out.println(number + " * " + i + " = " + number*i);
        }


        // While Loop
        System.out.println("Enter a number to get natural number: ");
        int value = sc.nextInt();
        int i=1;
        while(i<= value)
        {
            System.out.println(i);;
            i++;
        }


        // do-while loop
        System.out.println("Enter a number to get natural number: ");
        int value1 = sc.nextInt();
        int j=1;
        do{
            System.out.println(j);
            j++;
        }while(j<=value1);
        System.out.println();

        // Nested Loop
        for(int p=1; p<=10; p++)
        {
            System.out.println("Table of " + p);
            for(int q=0; q<=10; q++) {
                System.out.println(p + " * " + q + " = " + p * q);
            }
            System.out.println();
        }

        // ForEach loop used to loop through arrays
        int nums [] = {1,2,3,4,5,6,7,8,9,10};
        for(int num  : nums)
        {
            System.out.println(num);
        }

        String [] names = {"Rohit", "Sachin", "Yogi", "Sharad", "Rahul", "Harsh", "Yatin"};
        for(String name : names){
            System.out.println(name);
        }
    }

}