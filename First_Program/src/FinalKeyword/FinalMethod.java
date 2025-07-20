package FinalKeyword;

public class FinalMethod {
    public static void main(String[] args) {
        Child childObj = new Child();
        childObj.display();
    }
}

class Parent{
    void display(){
        System.out.println("This is parent class");
    }

//    final  void display(){
//        System.out.println("This is parent class");
//    }
}

class Child extends Parent{
    void display(){
        System.out.println("This is child display function");
    }
}

// A final method cannot be overridden by subclasses.
// This is useful when you want to prevent modification of a method's behavior in derived classes.