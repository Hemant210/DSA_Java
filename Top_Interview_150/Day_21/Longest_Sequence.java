package Top_Interview_150.Day_21;

import java.util.HashMap;

public class Longest_Sequence {

    public static int longestConsecutive(int[] nums) {
        HashMap<Integer, Boolean> map = new HashMap<>();

        for(int i = 0; i < nums.length; i++){
            map.put(nums[i], true);
        }

        for(int i = 0; i < nums.length; i++){
            if (map.containsKey(nums[i] - 1)) {
                map.put(nums[i], false);
            }
        }

        int msp = 0, ml = 0;
        for(int i = 0; i < nums.length; i++){
            if (map.get(nums[i]) == true) {
                int tl = 1;
                int tsp = nums[i];

                while (map.containsKey(tsp + tl)) {
                    tl++;
                }

                if (tl > ml) {
                    msp = tsp;
                    ml = tl;
                }
            }
        }

        return ml;
    }

    public static void main(String[] args) {
        int[] nums = { 1,0,1,2 };
        System.out.println(longestConsecutive(nums));
    }
}
