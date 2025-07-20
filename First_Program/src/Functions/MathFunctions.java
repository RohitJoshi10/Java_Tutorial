package Functions;
import java.util.Scanner;

public class MathFunctions {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int num1;
        System.out.println("Enter num1: ");
        num1 = sc.nextInt();

        int num2;
        System.out.println("Enter num2: ");
        num2 = sc.nextInt();

        // Maths Functions
        System.out.println("Maximum of booth number is: " + (Math.max(num1, num2)));
        System.out.println("Num1 raised to the power nun2 is: " + (Math.pow(num1, num2)));
        System.out.println("Random number is: "  + Math.random());
        System.out.println("Absolute value of -3 is: " + Math.abs(-10));
        System.out.println("Get Random number from num1 to num2: " + getRandom(num1, num2));
    }

    public static int getRandom(int num1, int num2){
        return (int)(Math.random()*(num2-num1+1)+num1);
    }
}


// Maths Class Methods
// 1. Math.min(x,y)
// 2. Math.max(x,y)
// 3. Math.sqrt(x)
// 4. Math.pow(x,y)
// 5. Math.abs(x)
// 6. Math.random()  return random value between 0 to 1. [0,1) 0 is inclusive and 1 is exclusive
// 7. Math.floor(x)
// 8. Math.ceil(x)
// 9. Math.round(x)
