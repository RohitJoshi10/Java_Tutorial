package ConstructorsInJava;

public class ConstructorInJava {
    public static void main(String[] args) {
        Complex num1 = new Complex(); // Complex() this is an default constructor.
        Complex num2 = new Complex(4,9);
        Complex num3 = new Complex(5);
        num1.print();
        num2.print();
        num3.print();
    }
}

class  Complex{
    int a, b;

    // Creating constructor
    public Complex(){
        a = 2;
        b = 3;
        System.out.println("I am default constructor");
    }

    public Complex(int real , int imaginary){
        a = real;
        b = imaginary;
    }

    public Complex(int real){
        a = real;
        b = 10;
    }
    void print(){
        System.out.println(a+" + "+b+"i");
    }
}


// 1. Constructors are invoked implicitly when you instantiate objects.
// 2. The 2 rules for creating constructor are:
//    (a) The name of the constructor should be the same as the class.
//    (b) A java constructor must not have a return type.
// 3. If a class doesn't have a constructor, the java compiler automatically creates
//    default constructor during run-time. The default constructor initializes instance
//    variables with default values.
// 4. Default Constructor: A constructor that is automatically created by the java compiler if it is not explicitly defined.
// 5. A constructor cannot be abstract or static or final.
// 6. A constructor can be overloaded but can not be overridden.