package collections;

import java.util.ArrayDeque;
import java.util.LinkedList;
import java.util.Queue;

public class PriorityQueue {
    public static void main(String[] args) {
        Queue<Integer> queue=new LinkedList<>();
        ArrayDeque<Integer> deque=new ArrayDeque<>();
        queue.offer(1);
        queue.offer(2);
        queue.offer(3);
        queue.offer(4);
        queue.add(1123);
        deque.add(232);
        deque.add(324);
System.out.println(queue.contains(deque));
System.out.println(queue.poll());
System.out.println(deque.clone());
System.out.println(queue.isEmpty());
System.out.println(deque.iterator());

    }
}
