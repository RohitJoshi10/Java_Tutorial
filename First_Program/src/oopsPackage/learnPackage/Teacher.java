package oopsPackage.learnPackage;

public class Teacher {
    public int teachingClass;
    private int id;
    String degree; // package private or default
    protected int studentCount;

    public static void main(String[] args) {
        Teacher obj = new Teacher();
        obj.id = 24801;
    }
}
