package Polymorphism;


import java.util.Objects;
import java.util.SortedMap;

class Car{
    String model;
    int year;

    public Car(String model, int year) {
        this.model = model;
        this.year = year;
    }

     // Overriding the toString Method
//    @Override
//    public String toString(){
//        return "Car ka model "+model+" and year is "+year;
//    }

    // Oeverriding equals method
//    public boolean equals(Object obj){
//        Car that = (Car)obj;
//        if(this.model.equals(that.model) && this.year == that.year) return true;
//        else return false;
//    }

    // Overriding hashCode method
//    @Override
//    public int hashCode() {
//        int initialNumber = 31;
//        initialNumber += year;
//        initialNumber += model.hashCode();
//        return initialNumber;
//    }

    // Intilejee ka khud ka code
    @Override
    public String toString() {
        return "Car{" +
                "model='" + model + '\'' +
                ", year=" + year +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Car car = (Car) o;
        return year == car.year && Objects.equals(model, car.model);
    }

    @Override
    public int hashCode() {
        return Objects.hash(model, year);
    }
}


public class LearnObjectClass {
    public static void main(String[] args) {
        Car obj = new Car("Honda", 2022);
        System.out.println(obj); // It by default convert the object into toString form we don't have to write it explicitly as Ojbect class alrady contains this method.
        // System.out.println(obj.toString());

        Car obj2 = new Car("Honda", 2022);
        System.out.println(obj2);

        // Checking if two objects are equal or not.
        System.out.println(obj.equals(obj2));

        // hash Code
        System.out.println(obj.hashCode());
        System.out.println(obj2.hashCode());
    }
}

/*
Java Object Class
Object class is present in java.lang package. Every class in Java is directly or indirectly derived from the Object class.
If a class does not extend any other class then it is direct child class of Object and if extends another class then it is indirectly derived. Therefore the Object class methods are available to all Java classes.
Hence Object class acts as a root of the inheritance hierarchy in any Java Program.

Equals method check if two object are equal or not. We use equals() method with with non-primitive data type and == with primitive Data type.

NOTE: hashCode and equals contract is that if two object hashcode are equal then their equals will be true.
*/