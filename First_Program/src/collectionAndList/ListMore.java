package collectionAndList;
import java.util.*;

public class ListMore {
    public static void main(String[] args) {
        List<String> fruits = new ArrayList<>();

        fruits.add("kiwi");
        fruits.add("Papaya");
        fruits.add("Mango");
        fruits.add("Apple");

        // Iterating in a list
        System.out.println("USING simple FOR Loop");
        for(int i=0; i<fruits.size(); i++)
        {
            System.out.println("Fruit is: " + fruits.get(i));
        }

        System.out.println("USING FOR Each Loop");
        for(String fruit : fruits)
        {
            System.out.println("Fruit is: " + fruit);
        }

        System.out.println("USING Iterator");
        Iterator<String> fruit = fruits.iterator();
        // Ye collection se aya hai
        while (fruit.hasNext()){
            // Initially ye first element pe hota hai then usko print krta and then move to next element.
            System.out.println("Iterator: " + fruit.next());
        }

        // Ye list interface se aya hai
        Iterator<String> fruit1 = fruits.listIterator();

        List<String> smallList = fruits.subList(1,3);
        System.out.println(smallList);
    }
}
