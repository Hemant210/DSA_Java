package Data_structure_Practice.Stacks_Queues;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Stack;

public class NextGreaterElement_I {
    public static int[] next_GreaterElement(int[] nums1) {
        int n = nums1.length;
        
        Stack<Integer> st = new Stack<>();
        int[] NGE = new int[n];

        for (int i = n - 1; i >= 0; i--) {
            while (!st.isEmpty() && st.peek() <= nums1[i]) {
                st.pop();
            }

            NGE[i] = st.isEmpty() ? -1 : st.peek();
            // if (st.isEmpty()) {
            //     NGE[i] = -1;
            // } else {
            //     NGE[i] = st.peek();
            // }

            st.push(nums1[i]);
        }

        return NGE;
    }

    public static int[] nextGreaterElement(int[] nums1, int[] nums2) {
        HashMap<Integer, Integer> map = new HashMap<>();
        Stack<Integer> s = new Stack<>();

        for (int i = nums2.length - 1; i >= 0; i--) {
            while (!s.isEmpty() && s.peek() <= nums2[i]) {
                s.pop();
            }

            if (s.isEmpty()) {
                map.put(nums2[i], -1);
            } else {
                map.put(nums2[i], s.peek());
            }

            s.push(nums2[i]);
        }

        int[] ans = new int[nums1.length];
        for (int i = 0; i < nums1.length; i++) {
            ans[i] = map.get(nums1[i]);
        }

        return ans;
    }

    public static    void main(String[] args) {
        int[] nums1 = { 4, 1, 2 };
        int[] nums2 = { 1, 3, 4, 2 };

        System.out.println(Arrays.toString(nextGreaterElement(nums1, nums2)));
    }
}
