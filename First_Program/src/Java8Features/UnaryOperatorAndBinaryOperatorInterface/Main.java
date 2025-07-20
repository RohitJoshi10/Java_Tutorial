package Java8Features.UnaryOperatorAndBinaryOperatorInterface;

import java.util.function.BiFunction;
import java.util.function.BinaryOperator;
import java.util.function.Function;
import java.util.function.UnaryOperator;

public class Main {
    public static void main(String[] args) {
        Function<Integer, Integer> function1 = x -> x * x;
        Function<String, String> function3 = str -> str.toLowerCase();

        // Agr Function k ander jo input ka type hota hai wahi output ka type hota hai toh hum use krenge unary operator
        UnaryOperator<Integer> unaryOperator1 = x -> x * x; // Yaha pe In/Op dono Integer hai.
        System.out.println(unaryOperator1.apply(5));

        UnaryOperator<String> unaryOperator2 = str -> str.toUpperCase();
        System.out.println(unaryOperator2.apply("Rohit"));

        // Agr BiFunction k ander jo input ka type hota hai wahi output ka type hota hai toh hum use krenge binary operator
        BiFunction<String, String, String> biFunction = (str1, str2) -> str1 + str2;
        BinaryOperator<String> binaryOperator = (str1, str2) -> str1 + str2;
        System.out.println(binaryOperator.apply("Rohit", "Joshi"));
    }
}
