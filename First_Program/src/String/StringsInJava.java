package String;
import javax.sound.midi.Soundbank;
import java.util.Scanner;
public class StringsInJava {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("This is all about string");

        String firstName1 = "Rohit";
        String sameFirstName = "Rohit";
        String firstName2 = new String("Rohit");

        System.out.println(sameFirstName);
        System.out.println(firstName1 + " " + firstName2);

        // Comparing two strings
        // Jab aap == ka use krte ho tab actual object ki value check ni hori hoti hai
        // instead of it references are begin checked.

        if(firstName1 == sameFirstName){
            System.out.println("Both are same");
        } else{
            System.out.println("Both are not same");
        }

        if(firstName2 == sameFirstName){
            System.out.println("Both are same");
        } else{
            System.out.println("Both are not same");
        }

        // Using Equals method for comparing content of two string
        if(firstName1.equals(firstName2)){
            System.out.println("Both are equal checked using -- equal method");
        }
    }
}

// String in java is created using two ways:

// 1. String literal:
// String name1 = "Rohit";
// String name2 = "Rohit";
// Here name1 is pointing to Rohit which is located in a area called as string constant pool inside the heap memory.
// For name2 a different memory is not allocated name2 is also pointing to the same "Rohit" created eralier

// 2. Using new Keyword:
// String name1 = new String("Joshi");
// String name2 = new String("Joshi");
// Here name1 and name2 pointing to two different Rohit which are in the heap memory.


// Stack memory mai usually references store hore hote hai
// Sting is a non-primitive data type and == this check reference for non-prmitive data types
// Whereas for primitive data types like int, char == check for value
// That's why int x = 10, y = 10; both are equal even though x and y references are different


// If you want to compare two string values then java has given you a method called as equals that compare the content of the string.
// It compares values of string for equality.
// 1. public boolean equals(Object another) compares this string to the specified object.
// 2. public boolean  equalsIgnoreCase(String another) compares this string to another string, ignoring case.