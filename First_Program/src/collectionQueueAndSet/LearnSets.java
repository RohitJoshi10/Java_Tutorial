package collectionQueueAndSet;
import java.util.*;

class  Student{
    int rollNo;
    String name;

    public Student(int rollNo, String name) {
        this.rollNo = rollNo;
        this.name = name;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Student student = (Student) o;
        return rollNo == student.rollNo;
    }

    @Override
    public int hashCode() {
        return Objects.hashCode(rollNo);
    }

    @Override
    public String toString() {
        return "Student{" +
                "rollNo=" + rollNo +
                ", name='" + name + '\'' +
                '}';
    }
}

public class LearnSets {

    enum Color{
        RED, GREEN, BLUE
    }

    public static void main(String[] args) {
        Set<Integer> set = new HashSet<>(); // It does not follows insertion order. Does not support duplicate. TC: O(1)
        // Set<Integer> set = new LinkedHashSet<>(); // It does follows insertion order and internally works as linkedlist. Does not support duplicate. TC: O(N)
        // Set<Integer> set = new TreeSet<>(); // It stores elements in sorted order and internally works as BST. Does not support duplicate. TC: O(logN)

        set.add(10);
        set.add(50);
        set.add(90);
        set.add(30);
        set.add(20);

        System.out.println(set);

        set.remove(10);
        System.out.println(set);

        System.out.println(set.contains(10));

        Set<Student> st = new HashSet<>();

        // Here it prints all 3 but i am considering that agar roll no same hai toh student bhi same hai i not considering the name of the student.
        // So, use equalsHashcode method. Jis Jis k hashcode barabar hai (here i.e rollNo) unkno mai same consider karunga.
        st.add(new Student(1, "Rohit"));
        st.add(new Student(1, "Rohit"));
        st.add(new Student(1, "Rohit"));
        System.out.println(st);

        Student s1 = new Student(1, "Anuj");
        Student s2 = new Student(1, "Rohit");

        System.out.println(s1.equals(s2));

        System.out.println(Color.RED);
        EnumSet<Color> enumSet = EnumSet.allOf(Color.class); // Jitni bhi cheeze hai iss enum class i.e. Color mai unka ek set ban jayega.
        System.out.println(enumSet);
    }
}
