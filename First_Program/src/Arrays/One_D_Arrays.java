package Arrays;

import java.util.Scanner;

public class One_D_Arrays {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the number of students: ");
        int n = sc.nextInt();

        int[] students = new int[n];
        // int students[] = new int[n];

        System.out.println("Enter the marks of the students: ");
        for (int i = 0; i < n; i++) {
            students[i] = sc.nextInt();
        }

        // Add 10 to each marks of the students
        System.out.println("Add 10 marks to each students previous marks");

        System.out.println("Final Marks of all students: ");

        int index = 1;
        for (int student : students) {
            System.out.println("Marks of Student-" + index + " : " + (student + 10));
            index++;
        }

        System.out.println("Length of Student array: " + students.length);;
    }
}

// pakage name start with small case
// int arr[] OR int[] arr;
// In java we need to tell what is my size of array
// int arr = new int[20];

// int age[]; declaration
// age = new int[5]; allocation
// OR int age[] = new int[5];

// If you know the elements of the array you can initialize it also at the time of declaration onlu
// int marks[] = {78, 56, 98, 99, 100};