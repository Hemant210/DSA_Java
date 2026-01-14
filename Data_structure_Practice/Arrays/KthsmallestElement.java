package Data_structure_Practice.Arrays;

import java.util.Arrays;

public class KthsmallestElement {

    // Time Complexity: O(n) & O(1) Space
    public static int ksmallelement(int[] nums, int target) {
        int n = nums.length;

        Arrays.sort(nums);

        return nums[target - 1];
    }

    public static void main(String[] args) {
        int[] arr = { 10, 5, 4, 3, 48, 6, 2, 33, 53, 10 };
        int target = 4;

        System.out.println(ksmallelement(arr, target));
    }
}
