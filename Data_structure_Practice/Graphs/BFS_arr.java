package Data_structure_Practice.Graphs;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Queue;

public class BFS_arr {

    static class Edge {
        int src;
        int dest;

        Edge(int s, int d) {
            this.src = s;
            this.dest = d;
        }
    }

    public static void createGraph(ArrayList<Edge>[] graph) {

        for (int i = 0; i < graph.length; i++) {
            graph[i] = new ArrayList<>();
        }

        // 0 -> 2,3,1
        graph[0].add(new Edge(0, 2));
        graph[0].add(new Edge(0, 3));
        graph[0].add(new Edge(0, 1));

        // 1 -> 0
        graph[1].add(new Edge(1, 0));

        // 2 -> 0,4
        graph[2].add(new Edge(2, 0));
        graph[2].add(new Edge(2, 4));

        // 3 -> 0
        graph[3].add(new Edge(3, 0));

        // 4 -> 2
        graph[4].add(new Edge(4, 2));
    }

    // Write your BFS function here
    public static ArrayList<Integer> bfs(ArrayList<Edge>[] graph) {
        ArrayList<Integer> ans = new ArrayList<>();
        Queue<Integer> q = new LinkedList<>();
        boolean vis[] = new boolean[graph.length];

         q.add(0);

         while (!q.isEmpty()) {
            int curr = q.remove();
            if (vis[curr] == false) {
                vis[curr] = true;
                ans.add(curr);

                for(int i = 0; i < graph[curr].size(); i++){
                    Edge e = graph[curr].get(i);
                    int next = e.dest;
                    if (vis[next] == false) {
                        q.add(next);
                    }
                }
            }
         }

         return ans;
    }

    public static void main(String[] args) {
        int V = 5;
        //      1
        //     /
        //    0
        //   / \
        //  2   3
        //  |
        //  4
        ArrayList<Edge>[] graph = new ArrayList[V];

        createGraph(graph);

        System.out.println(bfs(graph));
    }
}