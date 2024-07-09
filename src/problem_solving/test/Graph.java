package problem_solving.test;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.PriorityQueue;

class Node {
    int dest;
    int weight;

    Node(int dest, int weight) {
        this.dest = dest;
        this.weight = weight;
    }
}

public class Graph {
    private final Map<Integer, List<Node>> adjList;

    Graph(int vertices) {
        adjList = new HashMap<>();
        for (int i = 0; i < vertices; i++) {
            adjList.put(i, new ArrayList<>());
        }
    }

    void addEdge(int src, int dest, int weight) {
        adjList.get(src).add(new Node(dest, weight));
       adjList.get(dest).add(new Node(src, weight)); // For undirected graph
    }

    void dijkstra(int src) {
    	//System.out.println("--> "+ adjList.toString());
        int vertices = adjList.size();
        int[] dist = new int[vertices];
        Arrays.fill(dist, Integer.MAX_VALUE);
        dist[src] = 0;

        PriorityQueue<Node> pq = new PriorityQueue<>(vertices, Comparator.comparingInt(node -> node.weight));
        pq.add(new Node(src, 0));


        while (!pq.isEmpty()) {
            int u = pq.poll().dest;

            for (Node neighbor : adjList.get(u)) {
                int v = neighbor.dest;
                int weight = neighbor.weight;

                if (dist[u] + weight < dist[v]) {
                    dist[v] = dist[u] + weight;
                    pq.add(new Node(v, dist[v]));
                    System.out.println("At arr dest : "+v+" Dist : "+dist[v]);
                }
            }
           // System.out.println("pq : "+ pq.);
            
        }

        System.out.println("Shortest path from source " + src + ": ");
        for (int i = 0; i < dist.length; i++) {
            System.out.println(i + " : " + dist[i]);
        }
    }

    public static void main(String[] args) {
        Graph g = new Graph(5);
        g.addEdge(0, 1, 9);
        g.addEdge(0, 2, 6);
        g.addEdge(0, 3, 5);
        g.addEdge(0, 4, 3);
        g.addEdge(2, 1, 2);
        g.addEdge(2, 3, 4);
        g.addEdge(3, 4, 1);

        g.dijkstra(0);
    }
}
