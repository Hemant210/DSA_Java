package Graph.Assigment_4;

import java.util.ArrayList;

//Time complexity - O(V + E)
//Bridge in Graph (Tarjan’s Algorithm)
public class Bridge_Tarjan {

    static class Edge {
        int src, dest;
        Edge(int s, int d) {
            src = s;
            dest = d;
        }
    }

    public static void createGraph(ArrayList<Edge>[] graph) {
        for (int i = 0; i < graph.length; i++) {
            graph[i] = new ArrayList<>();
        }

        // Example Graph (Undirected)
        // 0---1---2
        // |   |
        // 3---4
        graph[0].add(new Edge(0, 1));
        graph[0].add(new Edge(0, 3));

        graph[1].add(new Edge(1, 0));
        graph[1].add(new Edge(1, 2));
        graph[1].add(new Edge(1, 4));

        graph[2].add(new Edge(2, 1));

        graph[3].add(new Edge(3, 0));
        graph[3].add(new Edge(3, 4));

        graph[4].add(new Edge(4, 1));
        graph[4].add(new Edge(4, 3));
    }

    public static void dfs(ArrayList<Edge>[] graph, int curr, int par,
                           boolean[] vis, int[] dt, int[] low, int time) {

        vis[curr] = true;
        dt[curr] = low[curr] = ++time;  // discovery & low time

        for (Edge e : graph[curr]) {
            int neigh = e.dest;

            if (neigh == par) continue;

            // Case 1: Back Edge found
            if (vis[neigh]) {
                low[curr] = Math.min(low[curr], dt[neigh]);
            }
            // Case 2: Forward Edge (DFS Tree Edge)
            else {
                dfs(graph, neigh, curr, vis, dt, low, time);

                // After returning, update low value
                low[curr] = Math.min(low[curr], low[neigh]);

                // Bridge condition
                if (dt[curr] < low[neigh]) {
                    System.out.println("Bridge : " + curr + " --- " + neigh);
                }
            }
        }
    }

    public static void getBridge(ArrayList<Edge>[] graph, int V) {
        int[] dt = new int[V];     // discovery time
        int[] low = new int[V];    // lowest discovery time reachable
        boolean[] vis = new boolean[V];
        int time = 0;

        for (int i = 0; i < V; i++) {
            if (!vis[i]) {
                dfs(graph, i, -1, vis, dt, low, time);
            }
        }
    }

    public static void main(String[] args) {
        int V = 5; 
        ArrayList<Edge>[] graph = new ArrayList[V];
        createGraph(graph);

        System.out.println("Bridges in the Graph:");
        getBridge(graph, V);
    }
}
