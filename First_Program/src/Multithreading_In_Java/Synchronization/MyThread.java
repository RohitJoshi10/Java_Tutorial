package Multithreading_In_Java.Synchronization;

public class MyThread extends Thread{

    private Counter counter;
    public MyThread(Counter counter){
        this.counter = counter;
    }
    @Override
    public void run(){
        for(int i=0; i<1000; i++){
            counter.increment();
        }
    }
}


// If i want ki counter ko ek baar mai ek he thread access kre jab t1 krra h access toh t2 wait kre and vica versa.
// The final value should be 2000 but it will not always comes as in the loop for a single iteration might happens that both thread run.
// Now we can achieve 2000 value every time by applying synchronized keyword in the increment.
