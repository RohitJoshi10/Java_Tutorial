package Java8Features.LambdaExpression_And_Functional_Interface;

// Functional Interface
@FunctionalInterface
interface Hello {
    void sayHello();
}

public class Lambda_Expression_In_Java8 {
    public static void main(String[] args) {
        // Lambda Expression implementing the sayHello() method
        Hello h = () -> {
            System.out.println("Hello Ladies....🏌️‍♂️");
        };

        // Call the method
        h.sayHello();
    }
}


/*
It is an anonymous function: Not having any name, return type and modifier.
To make any function into a lambda expression just: remove modifier, return type, methodname and add a arrow.

Properties of a Lambda Expression
1. If body has just one statement then we can remove curly brackets.
2. Use type inference, compiler guess the situation or control means remove parameter type form the arguments.
3. No return keyword.
4. If only one param remove small brackets.
*/