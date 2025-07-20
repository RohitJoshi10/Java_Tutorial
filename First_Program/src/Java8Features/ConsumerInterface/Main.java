package Java8Features.ConsumerInterface;

import java.util.Arrays;
import java.util.List;
import java.util.function.Consumer;

public class Main {
    public static void main(String[] args) {
        Consumer<String> consumer = s -> System.out.println(s);
        consumer.accept("Rohit");

        Consumer<List<Integer>> listConsumer1 = li -> {
          for(Integer i : li){
              System.out.println(i + 100);
          }
        };

        listConsumer1.accept(Arrays.asList(1,2,3,4));

        Consumer<List<Integer>> listConsumer2 =li -> {
            for(Integer i : li){
                System.out.println(i);
            }
        };

        listConsumer2.andThen(listConsumer1).accept(Arrays.asList(1,2,3,4));
    }
}
/*
This: listConsumer2.andThen(listConsumer1).accept(Arrays.asList(1,2,3,4));
is same as the below one:

Consumer<List<Integer>> listConsumer = listConsumer2.andThen(listConsumer1);
listConsumer.accept(Arrays.asList(1,2,3,4));

*/