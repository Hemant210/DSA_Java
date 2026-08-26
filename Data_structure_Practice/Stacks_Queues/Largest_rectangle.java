package Data_structure_Practice.Stacks_Queues;

import java.util.Stack;

public class Largest_rectangle {
    public static int largestRectangleArea(int[] heights){
        int n = heights.length;
        int[] left = new int[n];
        int[] right = new int[n];
        Stack<Integer> stack = new Stack<>();

        //Left Nearest smaller
        for(int i = 0; i < n; i++){
            while (stack.size() > 0 && heights[stack.peek()] >= heights[i] ) {
                stack.pop();
            }

            left[i] = stack.isEmpty() ? n : stack.peek();
            stack.push(i);
        }

        while (!stack.isEmpty()) {
            stack.pop();
        }

        //Right Nearest smaller
        for(int i = n - 1; i >= 0; i--){
            while (stack.size() > 0 && heights[stack.peek()] >= heights[i] ) {
                stack.pop();
            }

            right[i] = stack.isEmpty() ? -1 : stack.peek();
            stack.push(i);
        }

        int ans = 0;

        for(int i = 0; i < n; i++){
            int width = right[i] - left[i] - 1;
            int currarea = heights[i] * width;
            ans = Math.max(ans, currarea);
        }

        return ans;
    }

    public static void main(String[] args) {
        int[] heights = {2,1,5,6,2,3};

        System.out.println("Largest Rectangle in Histogram :- " + largestRectangleArea(heights));
    }
}
