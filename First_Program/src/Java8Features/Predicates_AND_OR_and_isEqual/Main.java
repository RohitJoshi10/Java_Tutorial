package Java8Features.Predicates_AND_OR_and_isEqual;

import java.util.Arrays;
import java.util.List;
import java.util.Objects;
import java.util.function.Predicate;

public class Main {
    public static void main(String[] args) {

        Predicate<Integer> salaryGreaterThanOneLac = salary -> salary > 100000;
        System.out.println(salaryGreaterThanOneLac.test(50000));

        Predicate<Integer> isEven = x -> x%2 == 0;
        Predicate<String> startsWithLetterV = x -> x.toLowerCase().charAt(0) == 'v';
        System.out.println(startsWithLetterV.test("Virat"));

        // Default and Static Method in Predicate
        Predicate<String> endsWithLetterT = x -> x.toLowerCase().charAt(x.length()-1) == 't';
        Predicate<String> and = startsWithLetterV.and(endsWithLetterT);
        Predicate<String> or = startsWithLetterV.or(endsWithLetterT);
        System.out.println(and.test("Virat"));
        System.out.println(or.test("get"));
        System.out.println(startsWithLetterV.negate().test("virat"));

        Student s1 = new Student("Ram", 1);
        Student s2 = new Student("Shyam", 2);
        Predicate<Student> studentPredicate = x -> x.getId() > 1;
        System.out.println(studentPredicate.test(s2));

        Predicate<Object> predicate = Predicate.isEqual("Virat");
        System.out.println(predicate.test("virat"));
        System.out.println(predicate.test("Virat"));
    }

    private static class Student{
        String name;
        int id;

        public String getName() {
            return name;
        }

        public void setName(String name) {
            this.name = name;
        }

        public int getId() {
            return id;
        }

        public void setId(int id) {
            this.id = id;
        }

        public Student(String name, int id) {
            this.name = name;
            this.id = id;
        }
    }
}



/*

        Predicate<Integer> salaryGreaterThanOneLac = (salary) -> {
            return  salary > 100000;
        };

int salary = 90;
if(predicate.test(salary)){
}


        List<Integer> numbers = Arrays.asList(1,2,3,4,5,6,7,8,9,10);
        // Java 8 way
        numbers.stream().filter(n -> n%2 == 0).mapToInt(n -> n).sum();

        // Old Way
        int sum2 = 0;
        for(int num : numbers){
            if(num % 2 == 0){
                sum2 += num;
            }
        }
*/