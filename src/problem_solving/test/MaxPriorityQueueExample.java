package problem_solving.test;

import java.util.Collections;
import java.util.PriorityQueue;

public class MaxPriorityQueueExample {
    public static void main(String[] args) {
        // Create a max-priority queue
        PriorityQueue<Integer> pq = new PriorityQueue<>(Collections.reverseOrder());

        // Add elements to the priority queue
        pq.add(10);
        pq.add(20);
        pq.add(5);
        pq.add(15);

        // Display the elements of the priority queue
        System.out.println("Priority Queue: " + pq);

        // Remove elements from the priority queue
        System.out.println("Removed element: " + pq.poll()); // 20
        System.out.println("Removed element: " + pq.poll()); // 15
        System.out.println("Priority Queue after removals: " + pq);
    }
}