package Generics;

public class GenericsInJava {
    public static void main(String[] args) {
        Dog<String, String> d1 = new Dog<>("123", "Mili");
        Dog<String, Integer> d2 = new Dog<>("321", 13);

        Dog<Integer, String> d3 = new Dog<>(12, "Raxcy");
        System.out.println(d3.getId());
    }
}

class Dog<E, V>{
    E id;
    V name;
    public Dog(E id, V name){
        this.id = id;
        this.name = name;
    }

    E getId(){
        return id;
    }
}






/*
Generics:- Generics mean parameterized types. Using Generics, it is possible to create classes that work with different data types. An entity such as class, interface, or method that operates on a parameterized type is a generic entity.

// Create a generic class
class GenericsClass<T>{

// variable of T type
private T data;

public GenericClass(T data){
  this.data = data;
}

// method that return T type variable
public T getData(){
  return this.data;
 }
}
*/