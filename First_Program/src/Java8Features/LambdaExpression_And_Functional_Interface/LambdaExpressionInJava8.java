package Java8Features.LambdaExpression_And_Functional_Interface;

public class LambdaExpressionInJava8 {
    public static void main(String[] args) {
//        Employee emp = new EmployeeImpl();
//        System.out.println(emp.getName());

        // Using Lambda Expression: Functional interface act as type of lambda expression.
        // Lambda expression mai hum implementation uss method ki jo functional interface mai h.
//        Employee emp = () -> {
//            return "Software Engineer";
//        };

        Employee emp = () -> "Software Engineer";

        System.out.println(emp.getName());

    }
}
