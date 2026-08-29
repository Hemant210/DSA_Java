package Data_structure_Practice.Stacks_Queues;

import java.util.Stack;

public class StockSpanner {
    public static void main(String[] args) {
        int[] price = {100, 80, 60, 70, 60, 75, 85};

        int[] ans = new int[price.length];
        Stack<Integer> stack = new Stack<>();

        for(int i = 0; i < price.length; i++){
            while (!stack.isEmpty() && price[stack.peek()] <= price[i]) {
                stack.pop();
            }

            if (stack.isEmpty()) {
                ans[i] = i + 1;
            } else {
                ans[i] = i - stack.peek();
            }

            stack.push(i);
        }

        for(int i = 0; i < ans.length; i++){
            System.out.print(ans[i] + " ");
        }

        System.out.println();
    }
}
