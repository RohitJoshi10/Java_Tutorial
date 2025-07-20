package Java8Features.Streams;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class StreamOperations {
    public static void main(String[] args) {
        List<Integer> list = Arrays.asList(10,1,2,3,4,4,2,5,6,7,9,8);
        List<Integer> filteredList = list.stream().filter(n -> n%2 == 0).collect(Collectors.toList());
        System.out.println("Filtered List: " + filteredList);

        List<Integer> mapedList = filteredList.stream().map(n -> n*10).collect(Collectors.toList());
        System.out.println("MapedList: " + mapedList);

        List<Integer> distictedList = mapedList.stream().distinct().collect(Collectors.toList());
        System.out.println("DistinctedList: " + distictedList);

        List<Integer> sortedList = distictedList.stream().sorted().collect(Collectors.toList());
        System.out.println("SortedList: " + sortedList);

        // Applying comparator: default is ascending order: (a,b) -> (a-b)
        List<Integer> sortedListInDes = distictedList.stream().sorted((a,b) -> (b-a)).collect(Collectors.toList());
        System.out.println("SortedList in Descending Order: " + sortedListInDes);

        List<Integer> result = list.stream()
                .filter(x -> x % 2 == 0)
                .map(x -> x*10)
                .distinct()
                .sorted((a,b)->(b-a))
                .limit(4) // From starting how many elements you want
                .skip(1) // From starting how many elements you want to skip
                .collect(Collectors.toList());
        System.out.println(result);

        List<Integer> collect = Stream.iterate(0, x->x+1)
                .limit(10)
                .skip(1)
                .peek(x -> System.out.println(x)) // Agar apko kuch operation perform krna hai
                .collect(Collectors.toList());
        System.out.println(collect);

        Integer integer = Stream.iterate(0, x -> x+1).limit(5).max((a,b) -> (b-a)).get();
        System.out.println(integer); // In max Des order mai sort kro cheeze and jo last mai ayega wo max hoga. max optional return krta hai so that's why we give get to take out the value present in the optional.

        Long count = Stream.iterate(0, x -> x+1).limit(5).count();
        System.out.println(count);

        List<Integer> list1 = Arrays.asList(1,2,3,4);
        list1.parallelStream(); // parallelStream work same as stream it's just that. ParallelStream work divide our large list into chunks and ye thread iss chunk pe kaam krega and ye thread uss chunk pe.


    }
}
