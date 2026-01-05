package DSA.Amazon;

import java.util.Stack;

public class Checksubarray {

    public static int maxSubarrayLength(int arr[], int k) {
        int n = arr.length;
        int[] left = new int[n];
        int[] right = new int[n];

        Stack<Integer> stack = new Stack<>();

        for (int i = 0; i < n; i++) {
            while (!stack.empty() && arr[stack.peek()] >= arr[i]) {
                stack.pop();
            }

            left[i] = stack.isEmpty() ? 0 : stack.peek() + 1;

            stack.push(i);
        }

        stack.clear();

        for (int i = n-1; i >= 0; i--) {
            while (!stack.empty() && arr[stack.peek()] >= arr[i]) {
                stack.pop();
            }

            right[i] = stack.isEmpty() ? n - 1 : stack.peek() - 1;

            stack.push(i);
        }

        int maxlength = 0;
        for(int i = 0; i < n; i++){
            int len = right[i] - left[i] + 1;

            if (arr[i] * len >= k) {
                maxlength = Math.max(maxlength, len);
            }
        }

        return maxlength;
    }

    public static void main(String[] args) {
        int[] nums = {10, 5, 8, 6, 7, 4, 3};
        int k = 20;

        int result = maxSubarrayLength(nums, k);
        System.out.println("Maximum Subarray length :- " + result);
    }
}
