package Java8Features.LambdaExpression_And_Functional_Interface;

import java.util.*;

public class UsingLambdaExpressionInComparator {
    public static void main(String[] args) {

        // Example-1
        List<Integer> list = new ArrayList<>();
        list.add(120);
        list.add(10);
        list.add(30);
        list.add(60);
        list.add(50);
//        Collections.sort(list, new ComparatorImp());
        Collections.sort(list, (a,b) -> b-a);
        System.out.println(list);



        // Example-2
        Set<Integer> s = new TreeSet<>();
        s.add(22);
        s.add(1);
        s.add(13);
        System.out.println("Before Manual Sorting: " + s);
        Set<Integer> ss = new TreeSet<>((a,b) -> b-a); // TreeSet k constructor mai hum ek comparator bhi de skte hai.
        ss.add(22);
        ss.add(1);
        ss.add(13);
        System.out.println("After manual sorting desc: " + ss);


        // Example-3
        Map<Integer, String> m = new TreeMap<>();
        m.put(2, "z");
        m.put(3, "f");
        m.put(1, "y");
        System.out.println("Before manual sorting: " + m);

        Map<Integer, String> mm = new TreeMap<>((a,b)->b-a);
        mm.put(2, "z");
        mm.put(3, "f");
        mm.put(1, "y");
        System.out.println("After manual sorting desc: " + mm);


        // Example-5
        Student s1 = new Student(2, "Preeti");
        Student s2 = new Student(3, "Sachin");
        Student s3 = new Student(33, "Ankur");
        List<Student> stu = new ArrayList<Student>();
        stu.add(s1);
        stu.add(s2);
        stu.add(s3);
        // Collections.sort(stu); // Here we can't just give like this as this is a custom object so we need to define a comparator by ourself.
        Collections.sort(stu, (a,b) -> b.id-a.id);
        System.out.println(stu);
    }
}

class Student{
    public Integer id;
    public String name;
    public Student(Integer id, String name){
        this.id = id;
        this.name = name;
    }
    public String toString(){
        return this.id + ": " + this.name;
    }
}

// Comparator ek funcational interface and iske pass ek method h compare naam ka jo 2 obj leta hai.
