package Multithreading_In_Java.Thread_Methods;

public class My_yield extends Thread{
    public My_yield(String name){
        super(name);
    }
    @Override
    public void run(){
        for(int i=0; i<5; i++){
            System.out.println(Thread.currentThread().getName() + " is running");
            Thread.yield(); // Like setPriority method this method also gives hint to the scheduler that you can give chances to other also.
        }
    }

    public static void main(String[] args) {
        My_yield t1  = new My_yield("t1");
        My_yield t2  = new My_yield("t2");
        t1.start();
        t2.start();

    }
}
