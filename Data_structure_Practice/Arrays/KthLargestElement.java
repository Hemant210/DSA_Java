package Data_structure_Practice.Arrays;

import java.util.Arrays;

public class KthLargestElement {

    // Time Complexity: O(n) & O(1) Space
    public static int findklargest(int[] nums, int k) {
        int n = nums.length;

        Arrays.sort(nums);

        return nums[n - k];
    }

    public static void main(String[] args) {
        int[] arr = { 3, 2, 3, 1, 2, 4, 5, 5, 6 };
        int k = 4;

        System.out.println("The K Largest element is :- " + findklargest(arr, k));
    }
}
