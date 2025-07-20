package Inheritance;

public class Inheritance {
    public static void main(String[] args) {
        // Creating a object of child class i.e. Car
        Car childObj = new Car();
        childObj.wheelCount = 4;
        childObj.start();
        System.out.println(childObj.wheelCount);
        childObj.engine();

        // Parent class object creation i.e. Vehicle
        Vehicle parObj = new Vehicle();
        parObj.start();
    }
}

class Vehicle{
    int wheelCount;

    void start(){
        System.out.println("Vehicle is Started");
    }
}

class Car extends Vehicle{
    void engine(){
        System.out.println("Car engine started");
    }
}


// Inheritance is used to create a new class from an existing class.
// The new class that is created is known as subclass (child or derived class)
// and the existing class from where the child class is derived is know as superclass (parent or base class)

// Types of Inheritance in Java
// 1. Single Inheritance: A class inherits from only one parent class.
// 2. Multilevel Inheritance: A class inherits from a parent class, which in turn inherits from another parent class, creating a chain of inheritance.
// 3. Hierarchical Inheritance: Multiple classes inherit from a single parent class.
// 4. Multiple Inheritance(Through Interfaces): Means Single child class inherit from multiple parent classes.
//    Java doesn't support multiple inheritance of classes directly, but it can be achieved using interfaces.
//    A class can implement multiple interfaces, inheriting methods from all of them.
// NOTE:- Java disallows multiple inheritance and ambiguity associated with it, particularly the "Diamond Problem", where a class inherits from two classes that have a common ancestor,
//        leading to conflicts in the inheritance of methods.
// 5. Hybrid Inheritance: A combination of two or more of the above inheritance types.

// Sabhi class object class k ander hoti hai.