package Data_structure_Practice.Graphs;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Queue;

public class BFS {
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
    // Breadth First Search (BFS) traversal
    public static void bfs(ArrayList<Edge> graph[],boolean visited[], int start, int v) {
        Queue<Integer> q = new LinkedList<>();
        //Starting point
        q.add(0);

        while (!q.isEmpty()) {
            int curr = q.remove();
            if (visited[curr] == false) {
                System.out.println(curr + " ");
                visited[curr] = true;

                for(int i = 0; i < graph[curr].size(); i++){
                    Edge e = graph[curr].get(i);
                    q.add(e.dest);
                }
            }
        }
    }

    public static void main(String[] args) {
        int V = 7;

        //     1 ----- 3
        //    /        | \
        //   0         |  5 ---- 6
        //    \        | / 
        //     2 ----- 4 
        ArrayList<Edge> graph[] = new ArrayList[V];
        createGraph(graph);

        boolean visited[] = new boolean[V];
        for(int i = 0; i < V; i++){
            if (visited[i] == false) {
                bfs(graph, visited, i, V);
            }
        }

        System.out.println();
    }
}
 