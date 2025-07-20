package AbstractInJava;

public class LearnAbstract {
    public static void main(String[] args) {
        // Vehicle v1 = new Vehicle(); // Abstract class obj can't be created
        Car c1 = new Car();
        c1.acceletrate();
        c1.breaks(2);
        c1.honks();
    }
}

abstract class Vehicle{
    abstract void acceletrate(); // You give only declaration of abstract method
    abstract int breaks(int wheels);
    void honks(){
        System.out.println("Vechicle honks");
    }
}

class Car extends Vehicle{
    // You can give annotations it's not necessary
    void acceletrate() {
        System.out.println("Car is accelerating");
    }

    @Override
    int breaks(int wheels) {
        System.out.println("Car breaks are pushed");
        return  wheels;
    }
}


/*
Java Abstract Class
The abstract class in Java cannot be instantiated (We cannot create objects of abstract classes). We use the abstract keyword to declare an abstract class.
1. An abstract class can have both the regular methods ans abstract methods.
2. A method that doesn't have its body is known as an abstract method.
3. Though abstract classes cannot be instantiated, we can create subclasses from it. We can then access members of the abstract class using the object of the subclass.
4. If the abstract class includes any abstract method, then all the child classes inherited from the abstract superclass must provide the implementation the abstract method.


Java Abstraction
Abstraction is an important concept of object-oriented programming that allows us to hide unnecessary details and only show the needed information.
This allows us to manage complexity by omitting or hiding details with a simpler higher-level idea.

Java Interfaces
An interface is a fully abstract class. It includes a group of abstract methods (methods without a body).
We use the interface keyword to create an interface in java.
Like abstract classes, we cannot create objects of interfaces.
To use an interface, other classes must implement it. We use the implements keyword to implement an interface.
*/