package Multithreading_In_Java.Synchronization;

public class Test {
    public static void main(String[] args) {
        Counter counter = new Counter();
        MyThread t1 = new MyThread(counter);
        MyThread t2 = new MyThread(counter);
        t1.start();
        t2.start();
        try{
            t1.join();
            t2.join();
        } catch (Exception e){

        }
        System.out.println(counter.getCount());
    }
}


/*

In Java multithreading, concepts like the `synchronized` keyword, race conditions, mutual exclusion, and critical sections are fundamental for ensuring thread safety. Here’s a breakdown of each concept:

### 1. Synchronized Keyword
- **Purpose**: The `synchronized` keyword in Java is used to control access to a block of code or an object by multiple threads. It ensures that only one thread can execute a synchronized block at a time.
- **Usage**:
  - **Instance Method**: Locks the object instance.
    ```java
    public synchronized void method() {
        // synchronized code
    }
    ```
  - **Static Method**: Locks the class object.
    ```java
    public static synchronized void staticMethod() {
        // synchronized code
    }
    ```
  - **Block**: Locks a specific object.
    ```java
    public void method() {
        synchronized(this) {
            // synchronized code
        }
    }
    ```

### 2. Race Condition
- **Definition**: A race condition occurs when two or more threads access shared data and try to change it at the same time. If the timing of the threads' execution is not controlled, it can lead to inconsistent or unpredictable results.
- **Example**:
    ```java
    public class Counter {
        private int count = 0;

        public void increment() {
            count++; // This can lead to a race condition
        }
    }
    ```

### 3. Mutual Exclusion
- **Definition**: Mutual exclusion is a property that ensures that multiple threads cannot execute a critical section of code simultaneously. This is crucial for protecting shared resources.
- **Implementation**: Achieved using the `synchronized` keyword, locks, or other concurrency mechanisms (like `ReentrantLock`).

### 4. Critical Section
- **Definition**: A critical section is a part of the program that accesses shared resources (like variables or data structures) and must not be executed by more than one thread at a time.
- **Example**:
    ```java
    public void criticalSection() {
        synchronized(this) {
            // code that accesses shared resources
        }
    }
    ```

### Summary
- **Synchronized**: Used to achieve mutual exclusion.
- **Race Condition**: Occurs when multiple threads access shared data simultaneously without proper synchronization.
- **Mutual Exclusion**: Ensures that only one thread can access a critical section at a time.
- **Critical Section**: The part of code that needs to be protected from concurrent access.

### Best Practices
- Use `synchronized` blocks or methods to prevent race conditions.
- Minimize the scope of synchronized blocks to reduce contention.
- Consider using higher-level concurrency utilities from the `java.util.concurrent` package for more complex scenarios.

This foundational understanding of Java multithreading concepts will help you write safer and more efficient concurrent applications.

*/