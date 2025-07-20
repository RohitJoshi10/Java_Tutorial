package Java8Features.Streams;

import java.util.Arrays;
import java.util.stream.IntStream;

public class Test {
    public static void main(String[] args) {
        // Imperative approach
        int[] array = {1,2,3,4,5};
        int sum = 0;
        for(int i=0; i<array.length; i++){
            if(array[i] % 2 == 0){
                sum += array[i];
            }
        }

        System.out.println(sum);


        // Declaritive appraoch: stream
        int array2[] = {1,2,3,4,5};
        int sum2 = Arrays.stream(array2).filter(ele -> ele % 2 == 0).sum();
        System.out.println(sum2);
    }
}
