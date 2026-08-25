package Data_structure_Practice.Stacks_Queues;

import java.util.*;

public class NextsmallestElement {
    public static int[] small_element(int[] nums) {
        Stack<Integer> s = new Stack<>();
        int[] ans = new int[nums.length];
        
        for (int i = 0; i < nums.length; i++) {
            while (s.size() > 0 && s.peek() >= nums[i]) {
                s.pop();
            }

            if (s.isEmpty()) {
                ans[i] = -1;
            } else {
                ans[i] = s.peek();
            }

            s.push(nums[i]);

        }

        return ans;
    }

    public static void main(String[] args) {
        int[] nums2 = { 1, 3, 4, 2 };

        System.out.println(Arrays.toString(small_element(nums2)));
    }
}
