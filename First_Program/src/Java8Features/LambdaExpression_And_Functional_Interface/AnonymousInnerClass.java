package Java8Features.LambdaExpression_And_Functional_Interface;

import java.sql.SQLOutput;

public class AnonymousInnerClass {
    public static void main(String[] args) {
//        AnonymousInterfaceEmployee employee = new AnonymousInterfaceImplEmployee();
//        System.out.println(employee.getSalary());

        // We know this interface is not a functional interface so we can't use lambda expression here.
        // But still we don't need the implementation class we can still make our code consice like this.
        // AnonymousInterfaceEmployee employee = new AnonymousInterfaceEmployee(); Ye nhi likh skta kyuki interface ka obj nhi bana skte hai hum.
        AnonymousInterfaceEmployee employee = new AnonymousInterfaceEmployee() {
            @Override
            public String getSalary() {
                return "50LPA";
            }

            @Override
            public String getDesignation() {
                return "SSE";
            }
        };

        System.out.println(employee.getSalary());
    }
}
