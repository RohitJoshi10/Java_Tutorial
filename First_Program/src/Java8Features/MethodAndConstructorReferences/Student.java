package Java8Features.MethodAndConstructorReferences;

public class Student {
    private String name;

    public String getName(){
        return name;
    }

    public void setName(String name){
        this.name = name;
    }

    public Student(String name){
        this.name = name;
    }
}
