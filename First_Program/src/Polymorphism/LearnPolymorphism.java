package Polymorphism;

class Data1{
    int data;

    public void printData(){
        System.out.println("Parent function called " + data);
    }

    public void printData(int n){
        for(int i=0; i<n; i++){
            System.out.println(data);
        }
    }
}

class ChildData extends Data1{
    // This is runtime polymorphism (Method overriding)
    @Override
    public void printData(){
        System.out.println("Overriden Child function called " + data);
    }
}

public class LearnPolymorphism {
    public static void main(String[] args) {
        Data1 d = new ChildData(); // ChildData is a Data
        d.printData(); // Run time Polymorphism aka method overriding
        d.printData(5); // Compile time Polymorphism aka method overloading
    }
}


/*
Java Polymorphism
Polymorphism allows us to perform a single action in different ways. In other words, polymorphism allows you to define one interface and have multiple implementations.
The word "poly" means many and "morphs" means forms, So it means many forms.
There are two types of Polymorphism
1. Compile-time Polymorphism
2. Runtime Polymorphism
*/