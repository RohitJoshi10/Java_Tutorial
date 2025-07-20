package MethodOverriding;

public class Car extends  Vehicle{
    String color;
    void start(){
        System.out.println(this);
        System.out.println(this.model+" started🚙");
    }
    public static void main(String[] args) {
        Car obj = new Car();
        obj.wheelCount = 4;
        obj.model = "Range-Rover🏎️";
        obj.color = "Black";
        obj.start();
    }
}


// Method Overriding
// If a subclass provides the specific implementation of the method that has been declared by one of it's parent class, it is known as method overriding.
// It is also known as Run time polymorphism. Hence, we can achieve Polymorphism in Java with the help of inheritance.
// Method overloading is called as compile time polymorphism.