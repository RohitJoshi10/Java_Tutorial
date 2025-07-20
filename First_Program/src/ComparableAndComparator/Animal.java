package ComparableAndComparator;
import java.util.*;

public class Animal implements  Comparable<Animal>{
    int age;
    String name;
    int weight;

    public int getAge() {
        return age;
    }

    public String getName() {
        return name;
    }

    public int getWeight() {
        return weight;
    }

    Animal(int age, String name, int weight)
    {
        this.age = age;
        this.name = name;
        this.weight = weight;
    }

    @Override
    public String toString() {
        return "Animal{" +
                "age=" + age +
                ", name='" + name + '\'' +
                ", weight=" + weight +
                '}' + "\n";
    }

    // this is the current object and specified obj hai jo iske ander pass hua hai i.e. o
    @Override
    public int compareTo(Animal o) {

        // Agr do ki age barabar hai toh name k basis pe sort krlo.
        if (this.age == o.age)
        {
            return this.name.compareTo(o.name);
        }

        return this.age - o.age; // It will result in either +ve, -ve or zero
    }

    public static void main(String[] args) {

    }
}
