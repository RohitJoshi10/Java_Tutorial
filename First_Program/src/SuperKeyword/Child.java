package SuperKeyword;

import MethodOverriding.Car;

public class Child extends Parent {
    String color;

    Child(){
        // Accessing the immediate parent constructor using super.
//        super(); // This will call the default constructor of the parent
        super(3); // Agr mai ye use ni krta toh by default parent ka default constructor call hota
        System.out.println("Child constructor is called...");
    }

    void start(){
        Scooter scooterObj = new Scooter();
        scooterObj.braking(this);
        // Accessing the immediate parent method using super
        super.start(); // Gives the immediate (just above it) parent of the child.
        System.out.println(this.model+" Child started running");
    }
    public static void main(String[] args) {
        Child c = new Child();
        c.model = "Nano";
        System.out.println(c.wheelCount);
        c.wheelCount = 4;
        c.color = "Red";
        c.start();
        System.out.println(c.wheelCount);
    }
}

class Scooter{
    void braking(Child car){
        System.out.println(car.model+" is braking");
    }
}

// Super Keyword In Java
// super is a special keyword in java that is used to refer to the instance of the immediate parent class.
// Uses of super keyword in Java
// 1. It is used to refer to an instance variable of the immediate parent
// 2. It is used to invoke a method of the immediate parent class.
// 3. It is used to invoke a constructor of immediate parent class.

// Super is not a physical this it is just a mechanism but this is a physical thing.