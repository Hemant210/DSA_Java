package Top_Interview_150.Day_19;

import java.util.Arrays;
import java.util.HashMap;

public class Two_sum {
    public static int[] twosum(int[] nums, int target) {
        HashMap<Integer, Integer> map = new HashMap<>();

        for (int i = 0; i < nums.length; i++) {
            int num = nums[i];
            if (map.containsKey(target - num)) {
                return new int[] { map.get(target - num), i };
            }

            map.put(num, i);
        }

        return new int[]{};
    }

    public static void main(String[] args) {
        int[] nums = { 2, 7, 11, 15 };
        int target = 9;

        System.out.println(Arrays.toString(twosum(nums, target)));
    }
}
