package ComparableAndComparator;
import java.util.*;
class MyCustomDogComparator implements Comparator<Animal>{
    @Override
    public int compare(Animal o1, Animal o2){
        // return o1.weight - o2.weight;
        return Integer.compare(o1.weight, o2.weight); // Integer ek wrapper class hai and uske ander ye compare method hai upper wale way mai ye falut hai ki jab hum -ve numbers se deal krte hai toh kai baar interger overflow ho jata hai like MIN_VALUE - (-5) will become +ve
    }
}

public class LearnComparableAndComparator {
    public static void main(String[] args) {
        Animal a1 = new Animal(4, "Leo", 10);
        Animal a2 = new Animal(2, "Bruno", 4);
        Animal a3 = new Animal(1, "Maxo", 6);
        Animal a4 = new Animal(3, "Don", 3);
        Animal a5 = new Animal(3, "xon", 3);

        List<Animal> dogs = new ArrayList<>();
        dogs.add(a1);
        dogs.add(a2);
        dogs.add(a3);
        dogs.add(a4);
        dogs.add(a5);

        System.out.println(dogs);

        // Collections.sort(dogs); // This is collections class has a static method sort

        // Iski help se fayda ye hota hai ki muje animal class mai baar baar chnage krne koi jaroorat ni h jiske base pe krna h sort usk liye customClass likh dunga
//        Collections.sort(dogs, new MyCustomDogComparator()); // sort based on weight
//        Collections.sort(dogs, new Comparator<Animal>() { // Anomynous Class Comparator is a functional interface
//            @Override
//            public int compare(Animal o1, Animal o2) {
//                return o1.name.compareTo(o2.name);
//            }
//        });




        // Using Lambda expression
//        Collections.sort(dogs, (o1, o2) -> o1.name.compareTo(o2.name));
//        Collections.sort(dogs, (o1, o2) -> {
//            return o1.name.compareTo(o2.name);
//        });


        // Collections.sort(dogs, Comparator.comparing(Animal::getAge)); // Ye jo comparing method hai ye ek comparator retrun krta hai getAge k basis pe
        Collections.sort(dogs, Comparator.comparing(Animal::getAge).thenComparing(Animal::getName)); // Ye jo comparing method hai ye ek comparator retrun krta hai getAge k basis pe


        System.out.println(dogs);
    }
}
