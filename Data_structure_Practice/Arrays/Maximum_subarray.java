package Data_structure_Practice.Arrays;

public class Maximum_subarray {
    public static int maxiarr(int[] nums) {
        int n = nums.length;
        int maxsum = Integer.MIN_VALUE;

        for (int i = 0; i < n; i++) {
            int currsum = 0;

            for (int j = i; j < n; j++) {
                currsum += nums[j];
                maxsum = Math.max(maxsum, currsum);
            }
        }

        return maxsum;

    }

    // Kadane's Algorithm
    public static int maxSubArray(int[] nums) {
        int currsum = nums[0];
        int maxsum = nums[0];

        for (int i = 1; i < nums.length; i++) {
            currsum = Math.max(currsum + nums[i], nums[i]);

            maxsum = Math.max(maxsum, currsum);
        }

        return maxsum;
    }

    public static void main(String[] args) {
        int[] arr = { 5, 4, -1, 7, 8 };
        // System.out.println(maxiarr(arr));
        System.out.println("Maximum Subarray :- " + maxSubArray(arr));
    }
}
