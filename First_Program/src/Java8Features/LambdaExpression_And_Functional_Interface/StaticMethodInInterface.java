package Java8Features.LambdaExpression_And_Functional_Interface;

interface A{
    static void sayHello(){
        System.out.println("Hello I am Static");
    }
}
public class StaticMethodInInterface implements A{
    public static void main(String[] args) {
        StaticMethodInInterface obj = new StaticMethodInInterface();
//        obj.sayHello();
//        StaticMethodInInterface.sayHello();

        // There is only one way to call the static method of a interface and that is by the name of the interface
        A.sayHello();
    }

    // Ye meai override nhi krra hu mai toh apna he ek method likh raha hu.
    static void sayHello(){
        System.out.println("Hello I am Main");
    }
}


// Implementation class is not able to see the static method present inside a interface.