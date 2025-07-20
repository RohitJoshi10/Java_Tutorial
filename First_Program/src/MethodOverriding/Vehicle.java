package MethodOverriding;

public class Vehicle {

    int wheelCount;
    String model;

    void start(){
        System.out.println(this);
        System.out.println(this.model+" Vehicle is Started");
    }
}
