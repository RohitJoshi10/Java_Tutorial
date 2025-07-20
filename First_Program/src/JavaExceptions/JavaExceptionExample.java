package JavaExceptions;

public class JavaExceptionExample {
    public static void main(String[] args) {
        int a[] = new int[5];
        System.out.println("Hello Guys");

//        try{
//            int result = 5/0;
//            System.out.println(a[8]);
//        } catch (ArrayIndexOutOfBoundsException e){
//            System.out.println("Tried to access out of bound element");
//        }
//        catch (ArithmeticException e){
//            System.out.println(e.getStackTrace());
//            System.out.println(e.getMessage());
//            System.out.println(e);
//        }

        // OR

//        try{
//            int result = 5/0;
//            System.out.println(a[8]);
//        } catch (ArithmeticException | ArrayIndexOutOfBoundsException | NullPointerException e){
//            System.out.println("Handling the Exception");
//        }

        try{
            int result = 5/0;
            System.out.println(a[8]);
        } catch (Exception e){
            System.out.println("Handling the Exception");
        }

    }
}


/*
Java Exceptions
An exception is an unexpected event that occurs during program execution. It affects the flow of the program instructions which can cause the program to terminate abnormally.
An exception can occur for many reasons. Some of them are:
1. Invalid user input
2. Device failure
3. Loss of network connection
4. Physical Limitations (out of disk memory)
5. Code errors
6. Opening an unavailable file

Java Runtime Exceptions
A runtime exception happens due to a programming error. They are also known as unchecked exceptions.
These exceptions are not checked at compile-time but run-time. Some of the  common runtime exceptions are:
1. Null pointer access (missing the initialization of a variable)-
   NullPointerException
2. Out-of-bounds array access - ArrayIndexOutOfBoundsException
3. Dividing a number by 0 - ArithmeticException

Java IOException
An IOException is also known as a checked exception. They are checked by the compiler at the compile-time and the programmer is prompted to handle these exceptions.
Some of the examples of checked exceptions are:
1. Trying to open a file that doesn't exist results in FileNotFoundException
2. Trying to read past the end of a file.


try-catch block
The try...catch block in java is used to handle exceptions and prevents the abnormal termination of the program.
eg:- try{
       // code
       } catch(exception){
       // code
       }
*/