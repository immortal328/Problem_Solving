package problem_solving.test;

import java.util.PriorityQueue;

public class PriorityQueueExample {
    public static void main(String[] args) {
        // Create a priority queue
        PriorityQueue<Integer> pq = new PriorityQueue<>();

        // Add elements to the priority queue
        pq.add(10);
        pq.add(20);
        pq.add(5);
        pq.add(15);

        // Display the elements of the priority queue
        System.out.println("Priority Queue: " + pq);

        // Remove elements from the priority queue
        System.out.println("Removed element: " + pq.poll()); // 5
        System.out.println("Removed element: " + pq.poll()); // 10
        System.out.println("Priority Queue after removals: " + pq);
    }
}
