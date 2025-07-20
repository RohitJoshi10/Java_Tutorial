package oopsPackage.Package2;
import oopsPackage.learnPackage.Teacher;

public class MainPackage2 extends Teacher  {
    public static void main(String[] args) {
        Teacher obj = new Teacher();
        // obj.id = 123;
        obj.teachingClass = 4;

        // obj.degree = "PHD";

        MainPackage2 mainInPackage2 = new MainPackage2();
        mainInPackage2.studentCount = 100; // accessible protected memeber.
    }
}


// Agr teacher class same package k ander hai and ussi mai hora toh import ni krna.
// But agr dusre package mai usse krre hai hum teacher ko like here then you need to import it.

// Agr child class kisi dusre package k ander he kyu na bana ho agr parent ki koi cheez protected hai toh child usse use kr skta hai...no matter if child is in same or different package.
