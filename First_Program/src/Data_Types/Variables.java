package Data_Types;

public class Variables {
    public static void main(String[] args){
        boolean isPassed = true;
        int count = 11;
        byte marks = 13;
        short studentCounts = 12345;
        // By default double he banta hai number but mai
        // Agr muje jabardasti batana hai toh i will say ki f laga do
        // float pi = 3.14; This is will treated as double but it's type is float
        // So, we will tell the compiler that i am making this as floating number not double

        float pi = 3.14f;
        double secondPi = 3.14;
        char myLetter  = 'A';

        // Implicit conversion
        int num = 10;
        long numLong = num;

        // Error of conversion: Do explicit conversion
        // long sum = 20;
        // int sumInt = sum;

        // Explicit conversion
        long sum = 20;
        int sumInt = (int)sum;


        System.out.print(count);
        System.out.println(marks);
        System.out.println(isPassed);
        System.out.println(pi);
        System.out.println(secondPi);
        System.out.println(myLetter);
        System.out.println(numLong);
        System.out.println(sumInt);

    }
}
