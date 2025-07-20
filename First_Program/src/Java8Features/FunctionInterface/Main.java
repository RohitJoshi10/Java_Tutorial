package Java8Features.FunctionInterface;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.function.Function;

public class Main {
    public static void main(String[] args) {
        Function<String, Integer> function1 = x -> x.length();
        System.out.println(function1.apply("Rohit"));

        Function<String, String> function2 = s -> s.substring(0,3);
        System.out.println(function2.apply("Rohit"));

        Function<List<Student>, List<Student>> studentWithVipAsPrefix = li -> {
            List<Student> result  = new ArrayList<>();
            for(Student s : li){
               if(function2.apply(s.getName()).equalsIgnoreCase("vip")){
                   result.add(s);
               }
            }
            return result;
        };

        Student s1 = new Student(2, "Vipul");
        Student s2 = new Student(2, "Vipulav");
        Student s3 = new Student(2, "Arnav");
        List<Student> students = Arrays.asList(s1,s2,s3);
        List<Student> filteredStudents = studentWithVipAsPrefix.apply(students);
        System.out.println(filteredStudents);

    }

    private static class Student{
        private int id;
        private String name;

        public int getId() {
            return id;
        }

        public void setId(int id) {
            this.id = id;
        }

        public String getName() {
            return name;
        }

        public void setName(String name) {
            this.name = name;
        }

        public Student(int id, String name) {
            this.id = id;
            this.name = name;
        }

        @Override
        public String toString() {
            return "Student{" +
                    "id=" + id +
                    ", name='" + name + '\'' +
                    '}';
        }
    }
}
