package MethodOverloading;

public class MethodOverloading {
    public static void main(String[] args){
        Greet obj = new Greet();
        obj.greetings();
        obj.greetings("Rohit");
        obj.greetings("Rohit", "Joshi");
        obj.greetings(9);
    }
}


class Greet{
    void greetings(){
        System.out.println("Hello Good Morning😁");
    }

    void greetings(String name){
        System.out.println("Hello "+name+" Good Morning😊");
    }

    void greetings(String firstName, String lastName){
        System.out.println("Hello "+firstName+" "+lastName+" Good Morning😊");
    }

    void greetings(int time){
        System.out.println("Hello Good Morning😁 "+time+" bje gye hai⏱️");
    }
}

// Method Overloading:
// 1. Two or more methods can have the same name inside the same class
// if they accept different arguments.
// 2. It can be achieved by either:
//    (a) Changing the number of arguments
//    (b) Changing the data type of arguments
// 3. It is not method overloading if we only change the return type of methods.
//    There must be differences in the number of parameters.