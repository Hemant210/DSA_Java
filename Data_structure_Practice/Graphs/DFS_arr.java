package Data_structure_Practice.Graphs;

import java.util.ArrayList;

public class DFS_arr {

    static class Edge {
        int src;
        int dest;

        Edge(int s, int d) {
            src = s;
            dest = d;
        }
    }

    public static void createGraph(ArrayList<Edge>[] graph) {

        for (int i = 0; i < graph.length; i++) {
            graph[i] = new ArrayList<>();
        }

        graph[0].add(new Edge(0, 2));
        graph[0].add(new Edge(0, 3));
        graph[0].add(new Edge(0, 1));

        graph[1].add(new Edge(1, 0));

        graph[2].add(new Edge(2, 0));
        graph[2].add(new Edge(2, 4));

        graph[3].add(new Edge(3, 0));

        graph[4].add(new Edge(4, 2));
    }

    private static void dfs(ArrayList<Edge>[] graph, int curr, boolean[] vis, ArrayList<Integer> ans) {
        vis[curr] = true;
        ans.add(curr);

        for (int i = 0; i < graph[curr].size(); i++) {
            Edge e = graph[curr].get(i);

            if (!vis[e.dest]) {
                dfs(graph, e.dest, vis, ans);
            }
        }   
    }

    public static ArrayList<Integer> dfs(ArrayList<Edge> graph[]){
        ArrayList<Integer> ans = new ArrayList<>();
        boolean vis[] = new boolean[graph.length];

        dfs(graph, 0, vis, ans);

        return ans;
    }

    public static void main(String[] args) {

        int V = 5;

        ArrayList<Edge>[] graph = new ArrayList[V];
        createGraph(graph);

        boolean[] vis = new boolean[V];

        System.out.println(dfs(graph));
    }
}