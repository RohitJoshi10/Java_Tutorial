package LearnInnerClass;

public class LearnInnerClass {
    // Non-static class
    class Toy{
        int price;
    }

    static class Playstation{
        int price;
    }

    public static void main(String[] args) {
        // When you want to access any non-static thing in the static function then you need to create an object.
        // Toy toy = new Toy(); Not allowed
        LearnInnerClass obj = new LearnInnerClass();
        Toy toy = obj.new Toy();
        toy.price = 45;

        // Using static inner class
        Playstation playstation = new LearnInnerClass.Playstation();
    }
}

/*
Inner Class: This is used to make code more readable and provide better encapsulation.

A non-static nested class is a class within another class. It has access to members of the enclosing class(outer class).
It is commonly known as inner class.
Since the inner class exists within the outer class, you must instantiate the outer class first, in order to instantiate the inner class.

Unlike inner class, a static nested class cannot access the member variable of the outer class. It is because the static nested class doesn't require you to create an instance of the outer class.
*/

