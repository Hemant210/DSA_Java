package Data_structure_Practice.Arrays;

import java.util.Arrays;

public class FindDuplicate {
    // O(n) Time and O(1) Space
    public static int Find_duplicate(int[] nums) {
        Arrays.sort(nums);
        int n = nums.length;

        for (int i = 1; i < n; i++) {
            if (nums[i] == nums[i + 1]) {
                return nums[i];
            }
        }

        return 1;
    }

    public static void main(String[] args) {
        int[] arr = { 3, 1, 3, 4, 2 };
        System.out.println(Find_duplicate(arr));
    }
}
