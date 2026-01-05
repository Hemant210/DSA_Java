package DSA.Graph.Assigment_1;
    
import java.util.ArrayList;
//import java.util.Stack;

// public class Classroom {
//     static class Edge {
//         int src;
//         int dest;

//         public Edge(int s, int d) {
//             this.src = s; // source vertex
//             this.dest = d; // destination vertex
//         }
//     }

//     public static void createGraph(ArrayList<Edge> graph[]) {
//         for (int i = 0; i < graph.length; i++) {
//             graph[i] = new ArrayList<>();
//         }

//         graph[2].add(new Edge(2, 3));
        
//         graph[3].add(new Edge(3, 1));
        
//         graph[4].add(new Edge(4, 0));
//         graph[4].add(new Edge(4, 1));

//         graph[5].add(new Edge(5, 0));
//         graph[5].add(new Edge(5, 2));
//     }

//     public static void topsortUtil(ArrayList<Edge> graph[], int curr, boolean vis[], Stack<Integer> stack){
//         vis[curr] = true;

//         for(int i = 0; i < graph[curr].size(); i++){
//             Edge e = graph[curr].get(i);

//             if (!vis[e.dest]) {
//                 topsortUtil(graph, e.dest, vis, stack);
//             }
//         }

//         stack.push(curr);
//     }

//     public static void topSort(ArrayList<Edge> graph[], int v){
//         boolean vis[] = new boolean[v];
//         Stack<Integer> stack = new Stack<>();

//         for(int i=0; i<v;i++){
//             if (!vis[i]) {
//                 topsortUtil(graph, i, vis, stack);
//             }
//         }

//         while (!stack.empty()) {
//             System.out.println(stack.pop() + " ");
//         }
//     }
//     public static void main(String args[]) {
//         int V = 6;
//         ArrayList<Edge> graph[] = new ArrayList[V]; // adjacency list
//         createGraph(graph);

//         topSort(graph, V);
        
//     }
// }

public class Classroom {
    static class Edge {
        int src;
        int dest;

        public Edge(int s, int d) {
            this.src = s; // source vertex
            this.dest = d; // destination vertex
        }
    }

    public static void createGraph(ArrayList<Edge> graph[]) {
        for (int i = 0; i < graph.length; i++) {
            graph[i] = new ArrayList<>();
        }

        graph[0].add(new Edge(0, 1));
        graph[0].add(new Edge(0, 4));

        graph[1].add(new Edge(1, 0));
        graph[1].add(new Edge(1, 2));
        //graph[1].add(new Edge(1, 4));

        graph[2].add(new Edge(2, 1));
        graph[2].add(new Edge(2, 3));

        graph[3].add(new Edge(3, 2));

        graph[4].add(new Edge(4, 0));
        //graph[4].add(new Edge(4, 1));
        graph[4].add(new Edge(4, 5));

        graph[5].add(new Edge(5, 4));
    }

    public static boolean isCycledirected(ArrayList<Edge> graph[], boolean vis[], int curr, int par){
        vis[curr] = true;

        for(int i=0; i<graph[curr].size(); i++){
            Edge e = graph[curr].get(i);
            if (vis[e.dest] && e.dest != par) {
                return true;
            } else if (!vis[e.dest]) {
                if (isCycledirected(graph, vis, e.dest, curr)) {
                    return true;
                }
            }
        }

        return false; 
    }

    public static void main(String args[]) {
        int V = 6;
        ArrayList<Edge> graph[] = new ArrayList[V]; // adjacency list
        createGraph(graph);        

        System.out.println(isCycledirected(graph, new boolean[V], 0, -1));
    }
}

