package Data_structure_Practice.Stacks_Queues;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Stack;

public class Reverse_First_K {
    public static Queue<Integer> reverseFirstK(Queue<Integer> q, int k) {
        Stack<Integer> st = new Stack<>();

        int n = q.size();

        if (k > n) {
            return q;
        }

        for (int i = 0; i < k; i++) {
            st.push(q.remove());
        }

        while (!st.isEmpty()) {
            q.add(st.pop());
        }

        for (int i = 0; i < n - k; i++) {
            q.add(q.remove());
        }

        return q;
    }

    public static Queue<Integer> reverse_FirstK(Queue<Integer> q, int k) {
        int n = q.size();

        if (k <= 0) return q;

        reverse(q, k);
        
        for(int i = 0; i < n - k; i++){
            q.add(q.remove());
        }

        return q;
    }

    public static void reverse(Queue<Integer> q, int k){
        if(k == 0) return ;

        int element = q.remove();

        reverse(q, k - 1);

        q.add(element);
    }

    public static void main(String[] args) {
        Queue<Integer> q = new LinkedList<>();

        q.add(1);
        q.add(2);
        q.add(3);
        q.add(4);
        q.add(5);

        int k = 3;

        System.out.println(reverse_FirstK(q, k));
    }
}
