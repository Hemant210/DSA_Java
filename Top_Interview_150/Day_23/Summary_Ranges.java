package Top_Interview_150.Day_23;

import java.util.ArrayList;
import java.util.List;

public class Summary_Ranges {
    public static List<String> summaryrange(int[] nums) {
        if (nums == null || nums.length == 0) {
            return new ArrayList<>();
        }

        List<String> list = new ArrayList<>();
        int start = nums[0];

        for (int i = 1; i < nums.length; i++) {
            if (nums[i] != nums[i - 1] + 1) {
                if (start == nums[i - 1]) {
                    list.add(Integer.toString(start));
                } else {
                    list.add(start + "->" + nums[i - 1]);
                }

                start = nums[i];
            }
        }

        if (start == nums[nums.length - 1]) {
            list.add(Integer.toString(start));
        } else {
            list.add(start + "->" + nums[nums.length - 1]);
        }

        return list;
    }

    public static void main(String[] args) {
        int[] nums = { 0,2,3,4,6,8,9 };

        System.out.println(summaryrange(nums));
    }
}
