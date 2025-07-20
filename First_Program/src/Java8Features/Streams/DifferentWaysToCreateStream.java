package Java8Features.Streams;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Stream;

public class DifferentWaysToCreateStream {
    public static void main(String[] args) {
        // Different ways to create a stream
        List<String> list = Arrays.asList("apple", "banana", "cherry");
        Stream<String> myStream = list.stream();

        String[] array = {"apple", "banana", "cherry"};
        Stream<String> myStream2 = Arrays.stream(array);

        Stream<Integer> integerStream = Stream.of(1,2,3);

        Stream<Integer> limit = Stream.iterate(0, n -> n+1).limit(100);

        Stream<Integer> limit1 = Stream.generate(() -> (int)Math.random()*100).limit(5); // generate take supplier
    }
}
