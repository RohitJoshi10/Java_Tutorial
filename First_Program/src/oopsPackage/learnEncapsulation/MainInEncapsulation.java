package oopsPackage.learnEncapsulation;

import oopsPackage.learnPackage.Person;

public class MainInEncapsulation {
    static {
        System.out.println("I am a static block");
    }
    public static  void printHello(){
        System.out.println("hello");
        // printHi(); not allowed
    }
    public void printHi(){
        System.out.println("Hi");
        printHello(); // Static variables can be used in any type of method: static or non-static.
    }
    public static void main(String[] args) {
        Person p1 = new Person();
        // p1.age = 23; You can't set age like this as it is priavte so use setter function which is public
        p1.setAge(23);
        // System.out.println(p1.age); You can't directly get the age use getter function
        System.out.println(p1.getAge());

        Person.count = 50; // p1.count = 50; count is static only single copy it's created and shared to all mem bers

        Person p2 = new Person();
        System.out.println(Person.count); // System.out.println(p2.count);

        printHello(); // or MainInEncapsulation.printHello();

        System.out.println(Person.numberOfObjects); // 2 objects created

    }

    static {
        System.out.println("I am a static block-2");
    }
}

// Using Person class here

// Static method se static he call hota hai...but non static se static and non-static dono call ho jate hai.