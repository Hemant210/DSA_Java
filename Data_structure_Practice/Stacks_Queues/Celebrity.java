package Data_structure_Practice.Stacks_Queues;

import java.util.Stack;

public class Celebrity {
    public static int getCelebrity(int[][] arr) {

        int n = arr.length;

       Stack<Integer> s = new Stack<>();
  
        // Push all people into stack
        for (int i = 0; i < n; i++) {
            s.push(i);
        }

        // Find potential celebrity
        while (s.size() > 1) {

            int i = s.peek();
            s.pop();

            int j = s.peek();
            s.pop();

            if (arr[i][j] == 0) {
                // i does not know j
                // So j cannot be celebrity
                s.push(i);
            } else {
                // i knows j
                // So i cannot be celebrity
                s.push(j);
            }
        }

        int celeb = s.peek();

        // Verify the potential celebrity
        for (int i = 0; i < n; i++) {

            if (i != celeb &&
                (arr[i][celeb] == 0 || arr[celeb][i] == 1)) {

                return -1;
            }
        }

        return celeb;
    }

    public static void main(String[] args) {

        int[][] arr = {
            {0, 1, 0},
            {0, 0, 0},
            {0, 1, 0}
        };


        System.out.println("Celebrity is :- " + getCelebrity(arr));
    }
}