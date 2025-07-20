package Multithreading_In_Java.Thread_Methods;

public class My_Interrupt extends Thread{

    @Override
    public void run(){
        try{
            Thread.sleep(1000);
            System.out.println("Thread is running");
        }catch (InterruptedException e){
            System.out.println("Thread Interrupted " + e);
        }
    }
    public static void main(String[] args) {
        My_Interrupt t1 = new My_Interrupt();
        t1.start();
        t1.interrupt(); // Iska matlb aapp iss thread ko bol rhe ho ki jo bhi aap abhi krre ho usko abhi rok do.
    }
}
