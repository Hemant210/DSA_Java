package Data_structure_Practice.Arrays;

import java.util.Arrays;

public class arr {
    // O(n) Time and O(1) Space
    public static int small_number(int[] nums) {
        Arrays.sort(nums);
        int n = nums.length;

        //return nums[0];
        return nums[nums.length - 2];
    }

    public static void main(String[] args) {
        int[] arr = { 10, 5, 4, 3, 48, 6, 2, 33, 53, 10 };
        System.out.println(small_number(arr));
    }
}
