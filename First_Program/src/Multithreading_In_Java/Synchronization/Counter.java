package Multithreading_In_Java.Synchronization;

public class Counter {
    private int count = 0;
// Making a method as synchronized
//    public synchronized void  increment(){
//        count++;
//    }

    // We can apply sysnchronized keyword in a block also
    public void increment(){
        synchronized (this){ // This means ek instance jispe increment method call hora hai. Agar usko multiple thread access kr rhe hai. Toh ek baar mai ek he thread access kr payega.
            count++;
        }
    }

    public int getCount(){
        return count;
    }
}

// Hamare code mai esi kon si jagha hai jaha pe shared resorces acces and modify kie jaare ho ussi part of program ko bolte hai critical section.
// And jab jum synchronized keyword use nhi krre hai toh uss condition ko bolte hai race condition.
// Synchronized krne k baad jab ek time pe ek he thread access kr paye uss condition ko bolte hai mutual exclusion.