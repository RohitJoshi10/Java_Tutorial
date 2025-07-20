package LearnFunctionalInterfaces;

public class LearnFunctionalInterface {

    public static void main(String[] args) {
//        MyClass obj = new MyClass() {
//            @Override
//            public void hello() {
//
//            }
//        };

        // Lambda expression works on functional interface so the above code can be written as
        MyClass obj2 = () -> {
            System.out.println("Hello there...");
        };
        obj2.hello();
    }
}

@FunctionalInterface
interface MyClass{
    void hello();
}


/*
Functional Interfaces
An Interface that contains exactly one abstract method is known as a functional Interface.
Functional Interface introduced in Java 8 allow us to use a lambda expression to initiate the interface's method and avoid using lengthy codes for the anonymous class implementation.

@FunctionalInterface
interface Sample{
    // abstract method
    int calculated(int val);
}
*/