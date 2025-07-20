package oopsPackage.learnPackage;

public class Person {
    public static int count = 0;
    public static int numberOfObjects = 0;

    private int age;
    private String name;
    boolean canBeChanged = true;

    public Person(){
        numberOfObjects++;
    }

    public void setAge(int age){
        if(canBeChanged) this.age = age; // age ko hum toh access kr skte hai but agr kisi aur ko accesse krna hai toh hum ek setter funciton banate hai and usko public kr dete hai.
    }

    public  int getAge(){
        return age;
    }
    public static void main(String[] args) {

    }
}


// Access Modifiers
// In java, access modifiers are used to set the accessibility(visibility) of
// classes, interfaces, variables, methods, constructor, data members, and the setter method.

// 4 Types of Access Modifiers we have
// 1. Default:
// 2. Private:
// 3. Protected:
// 4. Public:

// Jab hum kuch use ni krte usko default bolte and iska dusra naam hai...package private means ki ye cheez package k ander toh available  hai but uske bahar availabe nhi hai.

/*
Static Keyword: If we want to access class memebers without creating an instance of the class, we need to declare the class member static.
Static variables can be accessed by calling the class name of the class.
There is no need an instance of the class for accessing the static variables because static variables are the class variables and are shared among all the class instances.
*/

/*
Static Variables:
1. Only a single copy of the static variable is created and shared among all the instances of the class.
2. Because it is a class-level variable, memory allocation of such variables only happens once when the class is loaded in the memory.
3. If an object modifies the value of a static variable, the change is reflected across all objects.
4. Static variables can be used in any type of method: static or non-static.
5. Non-static variables cannot be used inside static methods. It will throw a compile time error.
*/


/*
Static Methods:
1. The static members and method belong to the class rather than the instance of the class. When the implementation of the
particular method is not dependent on the instance variables and instance method, In this case, we can make that method to be static.
2. They are accessed by the name of the class.
3. The keywords such as this and super are not used in the body of the static method.
4. The modification of the static field value is not allowed.
*/

// NOTE: main method run hone se phle he static block run hota hai...mtlb program mai sabse phle static block run hoga agr wo hai toh.