package collectionQueueAndSet;

import java.util.ArrayDeque;
import java.util.Deque;
import java.util.Queue;

public class LearnDeque {
    public static void main(String[] args) {
        ArrayDeque<Integer> dq = new ArrayDeque<>(); // It can have ArrayDeque, Deque, Queue methods
        dq.offer(10);
        dq.offerLast(20);
        dq.offerFirst(30);

        System.out.println(dq);

        System.out.println(dq.poll());
        System.out.println(dq.pollLast());

        System.out.println(dq.peekFirst());



    }
}
