package collectionAndList;
import java.util.*;

public class LearnLists {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        List<Integer> list = new ArrayList<>();

        list.add(10);
        list.add(20);
        list.add(30);

        System.out.println(list);
        System.out.println(list.size());
        System.out.println(list.contains(20));

        list.remove(1); // Passing index
        list.remove(Integer.valueOf(10)); // Passing obj
        System.out.println(list);

        List<Integer> list2 = new ArrayList<>();
        list2.add(1);
        list2.add(2);
        list2.add(3);

        list.addAll(list2);
        System.out.println(list);
        System.out.println(list2);

//        list.removeAll(list2); // list1 - [30]
//        System.out.println(list);
//        System.out.println(list2);

        list.retainAll(list2); // list2 - [1,2,3]
        System.out.println(list);
        System.out.println(list2);

//        list.clear();
//        System.out.println(list); // remove all element from the list

        Object a[] = list.toArray();
        for(Object e : a){
            Integer temp = (Integer) e;
            System.out.println(temp);
        }

        System.out.println("Here comes list-3 Here we have methods that are present in List Interface but not in collection interface");
        List<Integer> list3 = new ArrayList<>();
        list3.add(10);
        list3.add(20);
        list3.add(1);

        System.out.println(list3);
        System.out.println(list3.get(0)); // 10

        list3.set(0,11);
        System.out.println(list3);

        list3.add(2,1000);
        System.out.println(list3);

        list3.remove(1);
        System.out.println(list3);

        list3.add(1);
        System.out.println(list3);

        System.out.println(list3.indexOf(1)); // move from left to right and return the first element index.
        System.out.println(list3.indexOf(300));
        System.out.println(list3.lastIndexOf(1)); // move from right to left and return the first element index.



    }
}
