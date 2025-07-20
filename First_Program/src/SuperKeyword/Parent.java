package SuperKeyword;

public class Parent {
    int wheelCount;
    String model;

    Parent(){
        System.out.println("Parent Constructor is called...");
    }

    Parent(int wheelCount){
        this.wheelCount = wheelCount;
        System.out.println("Creating Parent Nano with Wheels");
    }

    void start(){
        System.out.println(this.model+" Parent started running");
    }
}
