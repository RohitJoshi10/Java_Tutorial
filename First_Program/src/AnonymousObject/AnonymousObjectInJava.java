package AnonymousObject;

class A{
    public A()
    {
        System.out.println("Object Created");
    }
    public void show(){
        System.out.println("In A show");
    }
}
public class AnonymousObjectInJava {
    public static void main(String[] args) {
        // A obj = new A();
        // obj.show();
        new A().show(); // Anonymous object
        new A().show(); // A object is being created.
    }
}

// new A(); This is anonymous object, and we can't use this obj once again.
