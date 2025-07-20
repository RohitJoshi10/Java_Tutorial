package ClassesAndObject;

public class ClassAndObject {
    public static void main(String[] args) {
        Dog d1 = new Dog(); // Object creation
        d1.name = "Tommy";
        d1.bark();

        Dog d2 = new Dog();
        d2.name = "Mili";
        d2.walk();

        Complex num1 = new Complex();
        num1.a = 2;
        num1.b = 3;
        num1.print();
    }
}


// In java the main class will be public only and the rest of the classes should not be public.

class Dog{
    String name;
    int age;
    String color;

    void walk(){
        System.out.println(name+" is walking");
    }

    void bark(){
        System.out.println(name+" is barking");
    }
}

class Complex{
    int a, b;
    void print(){
        System.out.println(a+"+"+b+"i");
    }
}

// Always start class name with capital letter followed by camel casing.
// Classes is not allocated memory when it is defined. An object is allocated memory when it is created.
// Waise class hoti h memory mai allocat but wo stack ya heap mai ni hoti wo hoti hai meta space jo ki classes ka meta data(properties and behaviour ) store krne k kaam aati hai.
// Meta space mai ek class sirf ek he baar load hoti hai wo bhi tab jab apka program load hota hai memory mai. And jab wo program memory se nikal jata hai toh wo de-allocated ho jati hai.

// All objects are declared in heap memory.

