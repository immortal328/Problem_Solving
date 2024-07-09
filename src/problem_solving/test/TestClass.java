package problem_solving.test;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.PriorityQueue;
import java.util.Scanner;

class Nodes {
    int dest;
    int weight;

    Nodes(int dest, int weight) {
        this.dest = dest;
        this.weight = weight;
    }
}

class GraphD {
    public final Map<Integer, List<Nodes>> adjList;
    GraphD() { adjList = new HashMap<>();}
    
    void addEdge(Integer src, Integer dest, Integer weight) {
        adjList.get(src).add(new Nodes(dest, weight));
    }
    
    void dijkstra(int src) {
        int vertices = adjList.size();
        int[] dist = new int[vertices];
        Arrays.fill(dist, Integer.MAX_VALUE);
        dist[src] = 0;

        PriorityQueue<Node> pq = new PriorityQueue<>(vertices, Comparator.comparingInt(node -> node.weight));
        pq.add(new Node(src, 0));


        while (!pq.isEmpty()) {
            int u = pq.poll().dest;

            for (Nodes neighbor : adjList.get(u)) {
                int v = neighbor.dest;
                int weight = neighbor.weight;

                if (dist[u] + weight < dist[v]) {
                    dist[v] = dist[u] + weight;
                    pq.add(new Node(v, dist[v]));
                    System.out.println("At arr dest : "+v+" Dist : "+dist[v]);
                }
            }
        }

        System.out.println("Shortest path from source " + src + ": ");
        for (int i = 0; i < dist.length; i++) {
            System.out.println(i + " : " + dist[i]);
        }
    }
}

public class TestClass {
	public static void main(String args[]) throws Exception {
		Scanner sc= new Scanner(System.in);
		int vertices = sc.nextInt();
		GraphD graph = new GraphD();
		for(int i=0;i<vertices;i++) {
			graph .adjList.put(sc.nextInt(),  new ArrayList<>());			
		}
		
		int edges = sc.nextInt();
		
		for(int i=0;i<edges;i++) {
			Integer src = sc.nextInt();
			Integer dest = sc.nextInt();
			Integer weitgh = sc.nextInt();
			//System.out.println(src+" "+dest+" "+weitgh);
			graph.addEdge(src,dest,weitgh);
		}
		
		Integer origin = sc.nextInt();
		Integer destin = sc.nextInt();
		//System.out.println(origin+ " "+destin);
		graph.dijkstra(origin);
			
	}
}