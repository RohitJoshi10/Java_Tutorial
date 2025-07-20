package collectionQueueAndSet;

import java.util.PriorityQueue;
import java.util.Queue;

public class LearnPriorityQueue {
    public static void main(String[] args) {
        // This will act as a min-heap
        Queue<Integer> pq = new PriorityQueue<>();

        // This will act as a max-heap
        // Queue<Integer> pq = new PriorityQueue<>((a,b)->b-a); // comparator lamda exp b-a k base pe comparison krta hai and incase of string sort based on dictionary wise.
        pq.add(30);
        pq.add(40);
        pq.add(10);
        pq.add(20);

        System.out.println(pq);
        System.out.println(pq.poll());
        System.out.println(pq);
        System.out.println(pq.poll());
        System.out.println(pq);
        System.out.println(pq.poll());
    }
}
