package Java8Features.LambdaExpression_And_Functional_Interface;


interface P{
     default void sayHello(){
         System.out.println("Hello");
    }
}

class C implements P{
    public void sayHello(){
        System.out.println("Child says Hello");
    }
}

public class MyClass {
    public static void main(String[] args) {
//        C c = new C();
//        c.sayHello(); // O/p: Child say Hello

//        P c = new C();
//        c.sayHello(); // O/p: Child say Hello

    }
}
