package Multithreading_In_Java.Deadlock;

class Pen{
    public synchronized void writeWithPenAndPaper(Paper paper){
        System.out.println(Thread.currentThread().getName() + " is using pen " + this + " and trying to use paper" + this);
        paper.finishWriting();
    }

    public synchronized void finishWriting(){
        System.out.println(Thread.currentThread().getName() + " finished using pen " + this);
    }
}

class Paper{
    public synchronized void writingWithPaperAndPen(Pen pen){
        System.out.println(Thread.currentThread().getName() + " is using paper " + this + " and trying to use pen " + this);
        pen.finishWriting();
    }

    public synchronized void finishWriting(){
        System.out.println(Thread.currentThread().getName() + " finished using paper " + this);
    }
}

// Creating two threads class1 and 2 here task1- is thread-1

class Task1 implements Runnable{
    private Pen pen;
    private Paper paper;

    public Task1(Pen pen, Paper paper){
        this.pen = pen;
        this.paper = paper;
    }

    @Override
    public  void run(){
        pen.writeWithPenAndPaper(paper); // Thread1 locks pen and tries to lock paper
    }
}


class Task2 implements Runnable{
    private Pen pen;
    private Paper paper;

    public Task2(Pen pen, Paper paper){
        this.pen = pen;
        this.paper = paper;
    }

// When deadlock happens
//    @Override
//    public  void run(){
//        paper.writingWithPaperAndPen(pen); // Thread2 locks paper and tries to lock pen
//    }

// When deadlock is not happening
     @Override
     public  void run(){
        // Phele app Pen ka lock laeye then aap Paper ka lock request kijiye
        // It will make sure that Thread-2 pen paper phr lock tabhi lagaye jab uske pass pen ka lock ho but Pen ka lock toh Thread1 k pass h and paper ka lock bhi a jayega uske pass kyuki thread2 chala he ni abhi as thread2 tabhi chlega jab uske pass thread1 ka lock hoga
         synchronized (pen){
             paper.writingWithPaperAndPen(pen); // Thread2 locks paper and tries to lock pen
         }
     }



}

public class DeadlockExample {
    public static void main(String[] args) {
        Pen pen = new Pen();
        Paper paper = new Paper();

        Thread thread1 = new Thread(new Task1(pen, paper), "Thread-1");
        Thread thread2 = new Thread(new Task2(pen, paper), "Thread-2");

        thread1.start();
        thread2.start();
    }
}
