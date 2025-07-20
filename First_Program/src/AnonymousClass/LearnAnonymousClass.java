package AnonymousClass;

public class LearnAnonymousClass {

//    class InnnerClass extends OuterClass{
//
//    }

    // Anonymous class and it's object created and this class can only be used once.
    // 1. A superclass that an anonymous class extends.
    OuterClass obj = new OuterClass(){
        void sing(){

        }

        @Override
        public void outerMethod() {
            super.outerMethod();
        }
    };

    // 2. An interface that an anonymous class implements.
    SuperInterface obj2 =  new SuperInterface(){
        @Override
        public void interfaceMethod(){

        }
    };
}

class OuterClass{
    public  void outerMethod(){

    }
}

interface SuperInterface{
    void interfaceMethod();
}

/*
In Java, a class can contain another class known as nested class. It's possible to create a nested class without giving any name.
A nested class that doesn't have any name is known as an anonymous class.
Anonymous classes usually extend subclasses or implement interfaces.
Here, Type can be
1. A superclass that an anonymous class extends.
2. An interface that an anonymous class implements.
*/