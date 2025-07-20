package Multithreading_In_Java.Thread_Methods;

public class MyThread extends  Thread{
    @Override
    public void run(){
        for(int i=0; i<=5; i++){
            try{
                Thread.sleep(1000); // Suspend the current thread execution for a specified period of time.
            } catch (InterruptedException e){
                throw new RuntimeException(e);
            }

            System.out.println(i);
        }

        System.out.println("Thread will sleep for 3 sec");
        try{
            Thread.sleep(3000);
        } catch (InterruptedException e){
            System.out.println(e);
        }
    }

    public static void main(String[] args) throws InterruptedException {
        MyThread t1 = new MyThread();
        t1.start();
        t1.join(); // Join method mai ye hota hai ki jo iss method ko call krra hota hai like here main method jo intezaar krega t1 ka end hone ka tabhi wo aage ka execution krega.
        System.out.println("Ye statement 3 sec baad dikhega");

    }
}
