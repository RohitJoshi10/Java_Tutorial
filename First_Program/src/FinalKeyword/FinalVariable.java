package FinalKeyword;

public class FinalVariable {
    int x = 10;
//    final int x = 10;

    void changeValue(){
        x = 20;
        System.out.println("Value of x: "+x);
    }

    public static void main(String[] args) {
        FinalVariable obj = new FinalVariable();
        obj.changeValue();
    }
}


//A final variable is a variable whose value cannot be changed once it is initialized.
//This means that once a final variable is assigned a value, it cannot be reassigned.