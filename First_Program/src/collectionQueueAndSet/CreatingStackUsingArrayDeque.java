package collectionQueueAndSet;

import java.util.ArrayDeque;

public class CreatingStackUsingArrayDeque {
    public static void main(String[] args) {
        // Implementing stack using ArrayDeque
        ArrayDeque<Integer> st = new ArrayDeque<>();

        st.push(10);
        st.push(20);
        st.push(30);

        System.out.println(st);

        System.out.println(st.pop());
        System.out.println(st);
        System.out.println(st.peek());

        // Implementing Queue using ArrayDeque
        ArrayDeque<Integer> q = new ArrayDeque<>();
        q.offer(100);
        q.offer(200);
        q.offer(300);

        System.out.println(q);

        System.out.println(q.poll());
        System.out.println(q);
        System.out.println(q.peek());


    }
}
