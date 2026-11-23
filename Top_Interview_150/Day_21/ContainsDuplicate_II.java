package Top_Interview_150.Day_21;

import java.util.HashMap;

public class ContainsDuplicate_II {
    public static boolean contains_duplicate(int[] nums, int k) {
        HashMap<Integer, Integer> map = new HashMap<>();

        for (int i = 0; i < nums.length; i++) {
            int key = nums[i];

            if (map.containsKey(key)) {
                int prev = map.get(key);
                if (i - prev <= k) {
                    return true;
                }
            }

            map.put(key, i);
        }

        return false;
    }

    public static void main(String[] args) {
        int[] nums = { 1, 2, 3, 1, 2, 3 };
        int k = 2;

        System.out.println(contains_duplicate(nums, k));
    }
}
