package Data_structure_Practice.Arrays;

import java.util.Arrays;

public class Checkduplicate {
    // O(n) Time and O(1) Space
    public static boolean containcopy(int[] nums) {
        Arrays.sort(nums);
        int n = nums.length;

        for (int i = 1; i < n; i++) {
            if (nums[i] == nums[i - 1]) {
                return true;
            }
        }

        return false;
    }

    public static void main(String[] args) {
        int[] arr = { 1, 2, 3, 1 };
        System.out.println(containcopy(arr));
    }
}
