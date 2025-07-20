package WrapperClasses;

public class WrapperClasses {
    public static void main(String[] args) {
        // Integer obj1 = new Integer(12); // Can also use this but this is deprecated nowdays.
        Integer obj2 = Integer.valueOf(12); // Mostly recommended
        Integer obj3 = 12; // Autoboxing
        int age = obj3; // unboxing
        Integer obj4 = Integer.valueOf("12"); // Will convert this string into an integer.

        System.out.println(obj4*4);

        Boolean myBoolean1 = Boolean.valueOf(false);
        Boolean myBoolean2 = Boolean.valueOf("true"); // Will convert this string "true" into a boolean value
    }
}


/*
A Wrapper class in Java is a class whose object wraps or contains primitive data types.
When we create an object to a wrapper class, it contains a field and in this field, we can store primitive data types.

Primitive Data Types:- char, bytes, short, int, long, float, double, boolean
Wrapper Class:- Character, Bytes, Short, Integer, Long, Float, Double, Boolean

Need of a Wrapper Classes
1. The classes in java.util package handles only objects and hence wrapper classes help in this case also.
2. Data structures in the Collection framework, such as ArrayList and Vector, store only objects (reference types) and not primitive types.
3. An object is needed to support synchronization in multithreading.

Autoboxing:- The automatic conversion of primitive types to the object of their corresponding wrapper classes is know as autoboxing.
For example- conversion of int to Integer, long to Long, double to Double, etc.

Unboxing:- It is just the reverse of autoboxing. Automatically converting an object of a wrapper class to its corresponding primitive type is known as unboxing.
For example: Conversion of Integer to int, Long to long, Double to double, etc.
*/