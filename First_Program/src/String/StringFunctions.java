package String;
import com.sun.security.jgss.GSSUtil;

import java.util.Scanner;

public class StringFunctions {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

//        System.out.println("Enter your First Name: ");
//        String firstName = sc.nextLine();
//
//        System.out.println("Enter your First Name: ");
//        String lastName = sc.nextLine();
//
//        System.out.println("Your full name is: " +firstName+" "+lastName);

        // 1. toUpperCase()
        String str1 = "hello";
        System.out.println(str1.toUpperCase());

        // 2. toLowerCase()
        String str2 = "HELLO";
        System.out.println(str2.toLowerCase());

        // 3. trim()
        String str3 = "   hello   ";
        System.out.println(str3.trim());

        // 4. startsWith()
        String str4 = "hello";
        System.out.println(str4.startsWith("he"));

        // 5. endsWith()
        String str5 = "hello";
        System.out.println(str5.endsWith("lo"));

        // 6. equals()
        String str6First = "hello";
        String str6Second = "hello";
        System.out.println(str6First.equals(str6Second));

        // 7. equalsIgnoreCase()
        String str7First = "hello";
        String str7Second = "HELLO";
        System.out.println(str7First.equalsIgnoreCase(str7Second));

        // 8. charAt()
        String str8 = "hello";
        System.out.println(str8.charAt(1));

        // 9. valueOf()
        int num = 123;
        System.out.println(String.valueOf(num));

        // 10. replace()
        String str10 = "hello";
        System.out.println(str10.replace('e', 'a'));
        System.out.println(str10.replace("ll", "e"));

        // 11. contains()
        String str11 = "hello";
        System.out.println(str11.contains("ell"));

        // 12. substring()
        String str12 = "hello";
        System.out.println(str12.substring(1, 4));

        // 13. split()
        String str13 = "hello,world";
        String[] parts = str13.split(",");
        System.out.println(parts[0]);

        // 14. toCharArray()
        String str14 = "hello";
        char[] chars = str13.toCharArray();
        System.out.println(chars[0]);

        // 15. isEmpty()
        String str15 = "k";
        System.out.println(str15.isEmpty());

    }
}


// Stirng Methods in Java

// 1. toUpperCase(): Converts all characters in the string to upper case.
// 2. toLowerCase(): Converts all characters in the string to lower case.
// 3. trim(): Removes leading and trailing whitespace.
// 4. startsWith(): Checks if the string starts with a specified prefix.
// 5. endsWith(): Checks if the string ends with a specified suffix.
// 6. equals(): Compares two strings for equality.
// 7. equalsIgnoreCase(): Compares two strings for equality, ignoring case considerations.
// 8. charAt(): Returns the character at a specified index.
// 9. valueOf(): Converts different types to a string.
// 10. replace(): Replaces all occurrences of a specified character or substring.
// 11. contains(): Checks if the string contains a specified sequence of characters.
// 12. substring(): Returns a new string that is a substring of the original string.
// 13. split(): Splits the string into an array based on a specified delimiter.
// 14. toCharArray(): Converts the string into a character array.
// 15. isEmpty(): Checks if the string is empty (length is 0).
