package Multithreading_In_Java.Thread_Methods;

public class Priority_Method extends Thread{

    // Giving  name to our thread
    public Priority_Method(String name){
        super(name);
    }
    @Override
    public void run(){
        for(int i=0; i<5; i++){
            String a = "";
            for(int j=0; j<10000; j++){
                a += "a";
            }
            System.out.println(Thread.currentThread().getName() + " - Priority: " + Thread.currentThread().getPriority() + " - count: " + i);
            try{
                Thread.sleep(1000);
            } catch (Exception e){

            }
        }
    }

    public static void main(String[] args) {
        Priority_Method l = new Priority_Method("Low Priority Thread");
        Priority_Method m = new Priority_Method("Medium Priority Thread");
        Priority_Method h = new Priority_Method("High Priority Thread");
        l.setPriority(Thread.MIN_PRIORITY);
        m.setPriority(Thread.NORM_PRIORITY);
        h.setPriority(Thread.MAX_PRIORITY);
        l.start();
        m.start();
        h.start();
    }
}
