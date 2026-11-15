package Top_Interview_150;

public class Maximum_Subarray {
    public static int max_subarray(int[] nums) {
        int currsum = nums[0];
        int maxsum = nums[0];

        for (int i = 0; i < nums.length; i++) {
            currsum = Math.max(currsum + nums[i], nums[i]);

            maxsum = Math.max(currsum, maxsum);
        }

        return maxsum;
    }

    public static void main(String[] args) {
        int[] nums = { -2, 1, -3, 4, -1, 2, 1, -5, 4 };
        System.out.println(max_subarray(nums));
    }
}
