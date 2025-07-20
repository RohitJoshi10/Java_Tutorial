package Multithreading_In_Java.VolatileAndAtomicity;

class SharedObj{
//    private boolean flag = false;
    private  volatile boolean flag = false;

    public void setFlagTrue(){
        System.out.println("Writer thread made the flag true.");
        flag = true;
    }

    public void printIfFlagTrue(){
        while(!flag){
            // do nothing
        }
        System.out.println("Flag is true !");
    }
}

public class VolatileInJava {
    public static void main(String[] args) {
        SharedObj obj = new SharedObj();
        Thread writerThread = new Thread(() -> {
            try {
                Thread.sleep(1000);
            }catch (Exception e){

            }
           obj.setFlagTrue();
        });

        Thread readerThread = new Thread(() -> {
            obj.printIfFlagTrue();
        });

        writerThread.start();
        readerThread.start();
    }
}
