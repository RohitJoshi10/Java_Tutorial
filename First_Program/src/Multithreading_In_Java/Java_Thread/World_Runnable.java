package Multithreading_In_Java.Java_Thread;

public class World_Runnable implements Runnable{
    @Override
    public void run(){
        for(; ;){
            System.out.println("World");
        }
    }
}
