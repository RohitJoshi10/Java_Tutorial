package Generics;

public class GenericsMethodsInJava {
    public static void main(String[] args) {
        printData("Hello");
        printData(110);

        GenericsMethodsInJava obj = new GenericsMethodsInJava();
        obj.doubleData("112");
        obj.doubleData(80);

        CustomClass custom = new CustomClass();
        obj.doubleData(custom);
    }

    static <E> void printData(E data){
        System.out.println(data);
    }

    <E> void doubleData(E data){
        // data = 2*data; This will give us error to solve this we will be using bounded generic
        System.out.println(data);

    }
}

class CustomClass{

}


/*
Java Generics Method:
We can also create generic method without creating a generic class.
Similar to the generics class, we can also create a method that can be used with any types of data. Such a Method is known as Generics Method.
public<T> void genericMethod(T data){...}

Here, the type parameter <T> is inserted after the modifier public and before the return type void.
We can call the generics method by placing the actual type <String> and <Integer> inside the bracket before the method name.
demo.<String>genericMethod("Java Programming");
demo.<Integer>genericMethod(25);

Bounded Generic Types:
In general, the type parameter can accept any data types (except primitive types).
However, if we want to use generics for some specific types (such as accept data of number types) only,
them we can use bounded types.
In the case of bound types, we use the extends keyword.
Here, GenericClass is created with bounded type. This means GenericClass can only work with data types that are children of Number (Integer, Double, and so on).

class GenericsClass <T extends Number> {
 public void display(){
   System.out.println("This is a bounded type generics class");
 }
}

*/