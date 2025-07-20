package oopsPackage.learnPackage;
import oopsPackage.learnEncapsulation.MainInEncapsulation;

import java.util.*;
public class MainClass {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Teacher obj = new Teacher();
        obj.teachingClass = 12;
        // obj.id = 123; This can't be access as it is private

        obj.degree = "PHD";
        MainInEncapsulation.printHello();
    }
}

// A Package is simply a container that groups related types (java classes, interfaces, enumerations and annotations).
// Java has an import statement that allows you to import an entire package, or use only certain classes and interfaces defined in the package.

// import java.util.Date // import only Date class
// import java.io*; // import everything inside java.io package '*' se sara content import ho jayega

// In java, the import statement is written directly after the package statement(if it exist) and before the class definition.
// package package.name
// import package.ClassName; // only import a class