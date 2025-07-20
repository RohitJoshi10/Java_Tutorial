package Polymorphism;

class Data{
    int data;
}

public class LearnMemoryManagement {
    public static void main(String[] args) {
        Integer a = 5;
        Data obj = new Data();
        obj.data = 5;
        changeValue(a, obj);
        System.out.println(a);
        System.out.println(obj.data);
    }

    static void changeValue(int a, Data obj){
        a = 10;
        obj.data = 100;
    }
}


/*
Java Heap Memory
Java Heap space is used by java runtime to allocate memory to Objects and JRE classes.
Whenever we create an object, It's always created in the Heap space.
Any object created in the heap space has global access and can bee referenced from anywhere of the application.

Java Stack Memory
Java Stack Memory contains method-specific values that are short-lived and references to other objects in the heap that is getting referred form the method.
Whenever a method is invoked, a new block is created in the stack memory for the method to hold local primitive values and reference to other objects in the method.
As soon as the method ends, the block becomes unused and becomes available for the next method. Stack memory size is very less compared to Heap Memory.
*/