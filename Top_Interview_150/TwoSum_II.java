package Top_Interview_150;

import java.lang.reflect.Array;
import java.util.Arrays;

public class TwoSum_II {
    public static int[] twoswap(int[] nums, int target) {
        int left = 0, right = nums.length - 1;

        while (left < right) {
            int sum = nums[left] + nums[right];

            if (sum == target) {
                return new int[] { left + 1, right + 1 };
            } else if (sum < target) {
                left++;
            } else {
                right--;
            }
        }

        return new int[0];
    }

    public static void main(String[] args) {
        int[] nums = { 2, 7, 11, 15 };
        int target = 9;

        int[] n = twoswap(nums, target);
        System.out.println(Arrays.toString(n));
    }
}
