package Data_structure_Practice.Binary_Search;

public class minimumlimit_bag {
    public static int minimumSize(int[] nums, int maxoperations) {
        int low = 1;
        int high = 0;

        for (int i = 0; i < nums.length; i++) {
            high = Math.max(high, nums[i]);
        }

        while (low < high) {
            int mid = low + (high - low) / 2;
            long operations = 0;

            for (int i = 0; i < nums.length; i++) {
                operations += (nums[i] - 1) / mid;
            }

            if (operations <= maxoperations) {
                high = mid;
            } else {
                low = mid + 1;
            }

        }

        return low;
    }

    public static void main(String[] args) {
        int[] nums = { 2, 4, 8, 2 };
        int maxoperations = 4;

        System.out.println(minimumSize(nums, maxoperations));
    }
}
