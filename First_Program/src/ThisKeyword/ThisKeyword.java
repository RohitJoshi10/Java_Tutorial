package ThisKeyword;

public class ThisKeyword {
    public static void main(String[] args) {
        Complex num1 = new Complex(); // Complex() this is an default constructor.
        Complex num2 = new Complex(4,9);
        Complex num3 = new Complex(5);
        num1.print();
        num2.print();
        num3.print();

        System.out.println("Adding two numbers");
        Complex result = num1.add(num2);
        System.out.println(num1);
        result.print();
    }
}

class  Complex{
    int a, b;

    // Creating constructor
    public Complex(){
        a = 2;
        b = 3;
        System.out.println("I am default constructor");
    }

//    public Complex(int real , int imaginary){
//        a = real;
//        b = imaginary;
//    }

    // Removing Ambiguity: This refers to the current object
    public Complex(int a , int b){
        this.a = a;
        this.b = b;
    }

    public Complex(int real){
        a = real;
        b = 10;
    }
    void print(){
        System.out.println(a+" + "+b+"i");
    }

    Complex add(Complex num2){
        System.out.println(this);
        this.print();
        Complex newNum = new Complex(a+num2.a, b+num2.b);
        return newNum;
    }
}

// In java, this keyword is used to refer to the current object inside a method or a constructor.
// We mostly use this keyword to remove any Ambiguity in Variable Names.
// We can also use this to invoke methods of the current class or to invoke a constructor of the current class.