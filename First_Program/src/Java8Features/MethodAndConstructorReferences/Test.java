package Java8Features.MethodAndConstructorReferences;

import java.util.*;
import java.util.stream.Collectors;

public class Test {
    public static void print(String s){
        System.out.println(s);
    }
    public void display(String s){
        System.out.println(s);
    }

    public static void main(String[] args) {
        // Method Reference
        List<String> students = Arrays.asList("Rohit", "Sharad", "Rahul", "Sachin");
        students.forEach(student -> System.out.println(student)); // This student -> System.out.println(student) is a lambda expression and we know that we can replace lambda expression by method reference.

        // When method is static
        students.forEach(Test::print); // :: this is method reference operator in java 8

        // When method is not static
        Test t = new Test();
        students.forEach(t::display);

        // Constructor Reference
        List<String> names = Arrays.asList("Shreya", "Shruti", "Niharika");
        List<Student> collect1 = names.stream().map(name -> new Student(name)).collect(Collectors.toList()); // Idhr mai har ek naam pe ek naya student create krra hu and fir usko ek list mai daal dera hu.
        List<Student> collect2 = names.stream().map(Student::new).collect(Collectors.toList()); // Replace lambda expression with constructor references

    }
}
