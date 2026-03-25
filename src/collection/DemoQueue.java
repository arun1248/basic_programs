package collection;

import java.util.*;
import java.util.concurrent.ArrayBlockingQueue;

public class DemoQueue {

    public static void main(String[] args) {
        Queue<String> queue = new LinkedList<>();
        List<String> list = new LinkedList<>();
        var ls = new ArrayList<>(10);
        System.out.println(ls);
        list.add("First");
        list.add("Second");
        list.add("Third");

        queue.offer("First");
        queue.offer("Second");
        queue.offer("Third");

        System.out.println("list: "+list);
        System.out.println("queue: "+queue);

        System.out.println("list.get(0): "+list.get(0));
        System.out.println("queue.poll(): "+queue.poll()); // first element access and removes first element
        System.out.println("queue: "+queue);
        System.out.println("queue.peek(): "+queue.peek()); // first element access
        System.out.println("queue.peek(): "+queue.peek()); // first element access

        ArrayBlockingQueue<Integer> blockingQueue = new ArrayBlockingQueue<>(3);
        blockingQueue.add(1);
        blockingQueue.add(1);
        blockingQueue.add(1);
        System.out.println("blockingQueue: "+blockingQueue);
//        blockingQueue.add(1); // crashes the program because queue is full
        blockingQueue.offer(1); // returns false because queue is full
        System.out.println("blockingQueue: "+blockingQueue);

        PriorityQueue<Integer> pq = new PriorityQueue<>();

        pq.add(30);
        pq.add(10);
        pq.add(20);

        System.out.println(pq);
        System.out.println(pq.poll());
        System.out.println(pq.poll());
        System.out.println(pq.poll());

        Queue<Integer> arrayQueue = new ArrayDeque<>();

        // Add elements
        arrayQueue.offer(10);
        arrayQueue.offer(20);
        arrayQueue.offer(30);

        System.out.println(arrayQueue); // [10, 20, 30]

        // Remove elements (FIFO)
        System.out.println(arrayQueue.poll()); // 10
        System.out.println(arrayQueue.poll()); // 20

        System.out.println(arrayQueue);

        Deque<Integer> arrayDeque = new ArrayDeque<>();

        // Add elements
        arrayDeque.offer(10);
        arrayDeque.offer(20);
        arrayDeque.offer(30);

        System.out.println(queue); // [10, 20, 30]

        // Remove elements (FIFO)
        System.out.println(queue.poll()); // 10
        System.out.println(queue.poll()); // 20

        System.out.println(queue);



    }

}
