package Data_structure_Practice.Graphs;

import java.util.ArrayList;

public class DFS {

    static class Edge {
        int src;
        int dest;

        public Edge(int s, int d) {
            this.src = s;
            this.dest = d;
        }
    }

    public static void createGraph(ArrayList<Edge>[] graph) {

        for (int i = 0; i < graph.length; i++) {
            graph[i] = new ArrayList<>();
        }

        // 0
        graph[0].add(new Edge(0, 1));
        graph[0].add(new Edge(0, 2));

        // 1
        graph[1].add(new Edge(1, 0));
        graph[1].add(new Edge(1, 3));

        // 2
        graph[2].add(new Edge(2, 0));
        graph[2].add(new Edge(2, 4));

        // 3
        graph[3].add(new Edge(3, 1));
        graph[3].add(new Edge(3, 4));
        graph[3].add(new Edge(3, 5));

        // 4
        graph[4].add(new Edge(4, 2));
        graph[4].add(new Edge(4, 3));
        graph[4].add(new Edge(4, 5));

        // 5
        graph[5].add(new Edge(5, 3));
        graph[5].add(new Edge(5, 4));
        graph[5].add(new Edge(5, 6));

        // 6
        graph[6].add(new Edge(6, 5));
    }

    public static void dfs(ArrayList<Edge> graph[], int curr, boolean visited[]) {
        System.out.println(curr + " ");
        visited[curr] = true;

        for (int i = 0; i < graph[curr].size(); i++) {
            Edge e = graph[curr].get(i);
            if (visited[e.dest] == false) {
                dfs(graph, e.dest, visited);
            }
        }
    }

    public static void main(String[] args) {
        int V = 7; // total vertices
        
        //     1 ----- 3
        //    /        | \
        //   0         |  5 ---- 6
        //    \        | / 
        //     2 ----- 4 
        ArrayList<Edge> graph[] = new ArrayList[V]; // adjacency list

        createGraph(graph); // build graph

        boolean vis[] = new boolean[V];

        for (int i = 0; i < V; i++) {
            if (vis[i] == false) {
                dfs(graph, i, vis);
            }
        }

        System.out.println();
    }
}
