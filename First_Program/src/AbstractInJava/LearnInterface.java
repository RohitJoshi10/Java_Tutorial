package AbstractInJava;

public class LearnInterface {
     // Animal a1 = new Animal(); // This can't be done
     public static void main(String[] args) {
         Monkey monkey = new Monkey();
         monkey.eats();
         monkey.walks();
         System.out.println(Animal.legs);
     }

}

interface Animal{
//    public abstract void eats(){
//
//    }

    void eats();

     // public static final int legs = 4;
    int legs = 4; // Ye by default public static final he hai.

    default void bark(){
        System.out.println("Animal is barking");
    }
}

interface Pet{
    void walk();
}

class  Monkey implements Animal{
    @Override
    public void eats(){
        System.out.println("Monkey is eating");
    }

    public void walks(){
        System.out.println("Dog is walking");
    }
}




/*
Java Interfaces
An interface is a fully abstract class. It includes a group of abstract methods (methods without a body).
We use the interface keyword to create an interface in java.
Like abstract classes, we cannot create objects of interfaces.
To use an interface, other classes must implement it. We use the implements keyword to implement an interface.

NOTE: We can implement multiple interface from a single class but we can't do that in case of abstraction.

Advantage of Java Interfaces
1. Similar to abstract classes, interfaces help us to achieve abstraction in Java.
2. Interfaces are also used to achieve multiple inheritance in Java.
3. All the methods inside an interface are implicitly public and all fields are implicitly public static final.
4. You can also create default methods in interface.
*/