package Java8Features.FunctionInterface;

import java.util.function.Function;

public class FunctionChaining {
    public static void main(String[] args) {
        Function<String, String> function1 = s -> s.toUpperCase();
        Function<String, String> function2 = s -> s.substring(0,3);

        Function<String, String> stringStringFunction = function1.andThen(function2);
        System.out.println(stringStringFunction.apply("Rohit"));

        Function<Integer, Integer> function3 = x -> 2*x;
        Function<Integer, Integer> function4 = x -> x*x*x;

        System.out.println(function3.andThen(function4).apply(2)); // S-1
        System.out.println(function4.andThen(function3).apply(2)); // S-2

        System.out.println(function3.compose(function4).apply(2)); // S-3

        // Here S-2 and S-3 both do same work, In compose firstly f-4 will be done then f-3
        // Identity ek static method hai so isko interface k naam se call krenge

        Function<String, String> identityFunction = Function.identity();
        System.out.println(identityFunction.apply("Rohit")); // Jo aap input mai doge wahi output mai ayega. And ye object leta hai so kuch bhi de do string , Integer etc.
    }
}
