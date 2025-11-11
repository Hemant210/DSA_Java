package Graph.Assigment_4;

import java.util.ArrayList;

//Articulation Point in Graph(Tarjan’s Algorithm)
//Time complexity :- O(V + E)
public class ArticulationPoint_Tarjan {

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

        //     0
        //    / \
        //   1   2
        //    \ /
        //     3
        //     |
        //     4
        graph[0].add(new Edge(0, 1));
        graph[0].add(new Edge(0, 2));

        graph[1].add(new Edge(1, 0));
        graph[1].add(new Edge(1, 3));

        graph[2].add(new Edge(2, 0));
        graph[2].add(new Edge(2, 3));

        graph[3].add(new Edge(3, 1));
        graph[3].add(new Edge(3, 2));
        graph[3].add(new Edge(3, 4));

        graph[4].add(new Edge(4, 3));
    }

    public static void dfs(ArrayList<Edge>[] graph, int curr, int par,
                           boolean[] vis, int[] dt, int[] low, int time,
                           boolean[] isArticulation) {

        vis[curr] = true;
        dt[curr] = low[curr] = ++time;
        int child = 0; // Count of child nodes in DFS Tree

        for (Edge e : graph[curr]) {
            int neigh = e.dest;

            // Ignore the edge to parent
            if (neigh == par) continue;

            // Case 1: Back edge
            if (vis[neigh]) {
                low[curr] = Math.min(low[curr], dt[neigh]);
            }
            // Case 2: Forward edge (Tree Edge)
            else {
                dfs(graph, neigh, curr, vis, dt, low, time, isArticulation);
                low[curr] = Math.min(low[curr], low[neigh]);

                // Articulation Point Condition:
                if (dt[curr] <= low[neigh] && par != -1) {
                    isArticulation[curr] = true;
                }

                child++;
            }
        }

        if (par == -1 && child > 1) {
            isArticulation[curr] = true;
        }
    }

    public static void getArticulation(ArrayList<Edge>[] graph, int V) {
        int[] dt = new int[V];          // discovery time
        int[] low = new int[V];         // lowest reachable discovery time
        boolean[] vis = new boolean[V];
        boolean[] isArticulation = new boolean[V];
        int time = 0;

        for (int i = 0; i < V; i++) {
            if (!vis[i]) {
                dfs(graph, i, -1, vis, dt, low, time, isArticulation);
            }
        }

        System.out.println("Articulation Points in Graph:");
        boolean found = false;
        for (int i = 0; i < V; i++) {
            if (isArticulation[i]) {
                System.out.println(i);
                found = true;
            }
        }

        if (!found) {
            System.out.println("No Articulation Points found.");
        }
    }

    public static void main(String[] args) {
        int V = 5;
        ArrayList<Edge>[] graph = new ArrayList[V];
        createGraph(graph);

        getArticulation(graph, V);
    }
}
