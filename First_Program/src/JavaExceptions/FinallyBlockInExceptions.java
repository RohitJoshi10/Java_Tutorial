package JavaExceptions;

public class FinallyBlockInExceptions {
    public static void main(String[] args) {
        int a[] = new int[5];
// Finally Keyword
//        System.out.println("Hello world");
//
//        try{
//            // System.out.println(a[3]);
//            System.out.println(a[8]);
//        } catch (Exception e){
//            System.out.println("Exception Handled");
//        } finally {
//            System.out.println("I will run always");
//        }
//
//        System.out.println("Bye world");

        // Throws Keyword
        try{
            getNumberFromArray(a);
        } catch (Exception e){
            System.out.println("Catched the exception "+e.getMessage());
        }

    }

    static int getNumberFromArray(int a[]) throws  ArithmeticException{
        return a[8];
    }
}



/*
1. try will be used either with catch or with finally.
2. catch  will always be with try block.
3. finally will always be with try block. Finally ek baar he lgta hai for each try.


try-catch-finally block
In java, we can also use the finally block after the try..catch block.
In this case, the finally block is always exceuted whether there is an exception inside the try block or not.
There are some cases when a finally block does not execute:
1. Use of System.exit() method.
2. An exception occurs in the finally block.
3. The death of a thread.
*/

/*
Java throw and throws
We use the throws keyword in the method declaration the type of exceptions that might occur within it.
eg:
import java.io.*
class Main{
 public static void findFile() throws IOException{
 // Code that may produce IOException
 File newFile = new File("test.txt");
 FileInputStream stream = new FileInputStream(newFile);
 }
}

The throw keyword is used to explictily throw a single exception.
class Main{
 public static void divideByZero{
 throw new ArithmeticException("Trying to divide by zero");
 }
}
*/