package Graph.Assigment_2;


import java.util.ArrayList;
import java.util.PriorityQueue;

public class Dijkstras {

    // Class to store each edge (connection between two vertices)
    static class Edge {
        int src, dest, weight;

        Edge(int s, int d, int w) {
            src = s;
            dest = d;
            weight = w;
        }
    }

    // Class to store node and its current distance
    static class Pair implements Comparable<Pair> {
        int node;
        int distance;

        Pair(int n, int dist) {
            node = n;
            distance = dist;
        }

        // Sort pairs by distance (for PriorityQueue)
        public int compareTo(Pair other) {
            return this.distance - other.distance;
        }
    }

    // Dijkstra's algorithm
    public static int[] dijkstra(ArrayList<Edge>[] graph, int src) {
        int V = graph.length; // total number of vertices
        int dist[] = new int[V]; // store shortest distance from src to each vertex
        boolean visited[] = new boolean[V]; // mark visited vertices

        // Initialize distances as infinity
        for (int i = 0; i < V; i++) {
            dist[i] = Integer.MAX_VALUE;
        }
        dist[src] = 0; // distance to itself is 0

        // Priority queue to pick the smallest distance vertex first
        PriorityQueue<Pair> pq = new PriorityQueue<>();
        pq.add(new Pair(src, 0));

        while (!pq.isEmpty()) {
            Pair current = pq.remove();

            if (!visited[current.node]) {
                visited[current.node] = true;

                // Visit all neighbors of current node
                for (Edge e : graph[current.node]) {
                    int u = e.src;
                    int v = e.dest;

                    // Relax the edge (update distance if shorter path found)
                    if (!visited[v] && dist[u] + e.weight < dist[v]) {
                        dist[v] = dist[u] + e.weight;
                        pq.add(new Pair(v, dist[v]));
                    }
                }
            }
        }

        return dist;
    }

    // Create a simple sample graph
    public static void createGraph(ArrayList<Edge>[] graph) {
        for (int i = 0; i < graph.length; i++) {
            graph[i] = new ArrayList<>();
        }

        // Add edges (like connections between cities)
        graph[0].add(new Edge(0, 1, 2));
        graph[0].add(new Edge(0, 2, 4));
        graph[1].add(new Edge(1, 2, 1));
        graph[1].add(new Edge(1, 3, 7));
        graph[2].add(new Edge(2, 4, 3));
        graph[4].add(new Edge(4, 3, 2));
        graph[4].add(new Edge(4, 5, 5));
        graph[3].add(new Edge(3, 5, 1));
    }

    // Main method to run the program
    public static void main(String[] args) {
        int V = 6; // number of vertices
        ArrayList<Edge>[] graph = new ArrayList[V];
        createGraph(graph);

        int source = 0; // starting point
        int[] distance = dijkstra(graph, source);

        // Print the shortest distance to each node
        for (int i = 0; i < distance.length; i++) {
            System.out.println("Shortest distance from " + source + " to " + i + " = " + distance[i]);
        }
    }
}
