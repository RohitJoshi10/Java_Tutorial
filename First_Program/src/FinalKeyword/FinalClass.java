package FinalKeyword;

public class FinalClass {
    public static void main(String[] args) {
        Son obj = new Son();
        obj.print();
        obj.display();
    }
}

//final class Father{
//    void display(){
//        System.out.println("This is father class");
//    }
//}

class Father{
    void display(){
        System.out.println("This is father class");
    }
}

class Son extends Father{
    void print(){
        System.out.println("This is son class");
    }
}


// A final class cannot be subclassed.
// This is useful when you want to create a class that should not be extended, ensuring its implementation remains unchanged.