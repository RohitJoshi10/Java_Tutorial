package Java8Features.BiPredicate_BiFunction_and_BiConsumer;

import java.util.function.*;

public class Main {
    public static void main(String[] args) {
        // BiPredicate
        // This is good for only one argument what if i have to pass 2 arguments that's why BiPredicate comes.
        Predicate<Integer> predicate = x -> x % 2 == 0;
        BiPredicate<Integer, Integer> biPredicate1 = (x,y) -> x % 2 == 0 && y % 2 == 0;
        BiPredicate<String, Integer> biPredicate2 = (str, len) -> str.length() == len;
        System.out.println(predicate.test(10));
        System.out.println(biPredicate1.test(2,5));
        System.out.println(biPredicate2.test("Rohit",5));


        // BiFunction
        Function<String, Integer> function = str -> str.length();
        System.out.println(function.apply("Rohit"));
        BiFunction<String,String, Integer> biFunction1 = (str1, str2) -> str1.length() + str2.length();
        System.out.println(biFunction1.apply("Rohit", "Joshi"));

        // BiConsumer
        Consumer<Integer> consumer = (x) -> {
            System.out.println(x);
        };
        consumer.accept(28);

        BiConsumer<Integer, Integer> biConsumer = (x,y) -> {
            System.out.println(x+y);
        };
        biConsumer.accept(4,3);


        // Supplier: Supplier ek he value return krta hai islye BiSupplier Jaisa kuch ni hota hai.
        Supplier<Integer> supplier = () -> 1;
        supplier.get();








    }
}
