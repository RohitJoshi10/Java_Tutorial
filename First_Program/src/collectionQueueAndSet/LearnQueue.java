package collectionQueueAndSet;

import java.util.LinkedList;
import java.util.Queue;

public class LearnQueue {
    public static void main(String[] args) {

        Queue<Integer> q = new LinkedList<>(); // Queue ek interface hai and usko implement krta hai Linked List
        q.offer(10);
        q.offer(20);
        q.offer(30);
        q.offer(40);

        System.out.println(q);

        System.out.println("Element removed : " + q.poll());

        System.out.println(q);

        System.out.println("Peek(front) element of the queue: " + q.peek());

        System.out.println("Iterating in the queue");
        while(!q.isEmpty()){
            System.out.println(q.poll());
        }

        // q.remove(); // Exception in thread "main" java.util.NoSuchElementException
    }
}
