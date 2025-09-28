package Practice;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Queue;

public class Graph_practice {
    static class Edge {
        int src;
        int dest;
        int wt;

        public Edge(int s, int d, int w) {
            this.src = s; // source vertex
            this.dest = d; // destination vertex
            this.wt = w; // weight of the edge
        }
    }

    // Function to create a sample graph
    static void createGraph(ArrayList<Edge> graph[]) {
        // Initialize each index of graph array with a new ArrayList
        for (int i = 0; i < graph.length; i++) {
            graph[i] = new ArrayList<>();
        }

        // Adding edges (undirected graph, so edges added both ways)
        graph[0].add(new Edge(0, 1, 1));
        graph[0].add(new Edge(0, 2, 1));

        graph[1].add(new Edge(1, 0, 1));
        graph[1].add(new Edge(1, 3, 1));

        graph[2].add(new Edge(2, 0, 1));
        graph[2].add(new Edge(2, 4, 1));

        graph[3].add(new Edge(3, 1, 1));
        graph[3].add(new Edge(3, 4, 1));
        graph[3].add(new Edge(3, 5, 1));

        graph[4].add(new Edge(4, 2, 1));
        graph[4].add(new Edge(4, 3, 1));
        graph[4].add(new Edge(4, 5, 1));

        graph[5].add(new Edge(5, 3, 1));
        graph[5].add(new Edge(5, 4, 1));
        graph[5].add(new Edge(5, 6, 1));

        // ⚠ Mistake corrected: edge from 6 -> 5 should be in graph[6], not graph[5]
        graph[6].add(new Edge(6, 5, 1));
    }

    // Breadth First Search (BFS) traversal
    public static void bfs(ArrayList<Edge> graph[], int V) {
        boolean visited[] = new boolean[V]; // visited array to mark visited nodes
        Queue<Integer> q = new LinkedList<>(); // queue for BFS

        q.add(0); // Start BFS from source vertex 0

        while (!q.isEmpty()) {
            int curr = q.remove(); // dequeue front element

            if (!visited[curr]) { // if not visited, process it
                System.out.print(curr + " "); // print current node
                visited[curr] = true; // mark as visited

                // add all unvisited neighbors to queue
                for (int i = 0; i < graph[curr].size(); i++) {
                    Edge e = graph[curr].get(i); // get edge
                    q.add(e.dest); // enqueue destination node
                }
            }
        }
        System.out.println(); // print newline after traversal
    }

    // Depth First Search (DFS) traversal
    //Time complexity - O(V+E)
    public static void DFS(ArrayList<Edge> graph[], int curr, boolean vis[]) {
        System.out.println(curr + " ");
        vis[curr] = true;

        for (int i = 0; i < graph[curr].size(); i++) {
            Edge e = graph[curr].get(i);
            if (vis[e.dest] == false) {
                DFS(graph, e.dest, vis);
            }
        }

    }

    //Print All Path 
    //Time complextity - O(V^V)
    public static void printAllpath(ArrayList<Edge> graph[], int src, int tar, String path, boolean vis[]) {

        // Base case: If source is the target, we have found a complete path
        if (src == tar) {
            System.out.println(path); // Print the current path
            return;
        }

        // Iterate over all edges/adjacent nodes of the current source node
        for (int i = 0; i < graph[src].size(); i++) {
            Edge e = graph[src].get(i);

            // Only visit the node if it has not been visited yet (to avoid cycles)
            if (!vis[e.dest]) {
                vis[e.dest] = true; // Mark node as visited
                printAllpath(graph, e.dest, tar, path + " -> " + e.dest, vis); // Recursive call
                vis[e.dest] = false; // Backtrack: unmark node for other paths
            }
        }
    }

    public static void main(String args[]) {
        /*
         * Graph representation (undirected):
         * 
         *  1 ---- 3
         * /       | \
         * 0       |  5 -- 6
         * \       | /
         *  2 ---- 4
         * 
         */
        int V = 7; // total vertices
        ArrayList<Edge> graph[] = new ArrayList[V]; // adjacency list

        createGraph(graph); // build graph
        // boolean vis[] = new boolean[V];

        // for(int i = 0; i < V; i++){
        // if (vis[i] == false) {
        // DFS(graph, 0, vis);
        // }
        // }
        // bfs(graph, V); // perform BFS traversal

        int src = 0;
        int tar = 5;
        boolean vis[] = new boolean[V];
        vis[src] = true;
        printAllpath(graph, src, tar, "" + src, vis); //Print all Path's    
        System.out.println();
    }
}
