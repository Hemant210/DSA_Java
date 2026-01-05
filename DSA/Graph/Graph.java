package Graph;
import java.util.ArrayList;

public class Graph {

    // Edge class represents a connection between two vertices (src -> dest)
    static class Edge {
        int src;   // source vertex
        int dest;  // destination vertex
        int wght;  // Weight Vertex

        public Edge(int s, int d, int w){
            this.src = s;
            this.dest = d;
            this.wght = w;
        }
    }

    // Create graph using adjacency list representation
    public static void creategraph(ArrayList<Edge> graph[]){
        // Step 1: Initialize each index with an empty ArrayList
        // because initially, no edges are added
        for(int i = 0; i < graph.length; i++){
            graph[i] = new ArrayList<Edge>();
        }

        // Step 2: Add edges (directed graph)
        // vertex 0 -> 2
        graph[0].add(new Edge(0, 2,2));
        
        // vertex 1 -> 2 and 1 -> 3
        graph[1].add(new Edge(1, 2,10));
        graph[1].add(new Edge(1, 3,0));

        // vertex 2 -> 0, 2 -> 1, 2 -> 3
        graph[2].add(new Edge(2, 0,2));
        graph[2].add(new Edge(2, 1,10));
        graph[2].add(new Edge(2, 3,-1));

        // vertex 3 -> 1, 3 -> 2
        graph[3].add(new Edge(3, 1,0));
        graph[3].add(new Edge(3, 2,-1));
    }

    public static void main(String[] args) {
        int V = 4; // number of vertices in graph

        // adjacency list: each index of array stores a list of edges
        ArrayList<Edge> graph[] = new ArrayList[V];  

        // build the graph
        creategraph(graph);

        // Example: print all neighbours of vertex 2
        // neighbours = all destination vertices connected from src = 2 with weight
        for(int i = 0; i < graph[2].size(); i++){
            Edge e = graph[2].get(i);   // get edge from adjacency list
            System.out.println(e.dest + "," + e.wght); // print destination node
        }
    }
}
