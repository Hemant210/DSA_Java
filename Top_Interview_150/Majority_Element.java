package Top_Interview_150;

public class Majority_Element {
    public static int majorityElement(int[] nums) {
        int n = nums.length;

        for (int i = 0; i < n; i++) {
            int count = 0;
            for (int j = 0; j < n; j++) {
                if (nums[i] == nums[j])
                    return nums[i];

                if (count < n / 2)
                    return nums[i];
            }
        }

        return -1;

    }

    public static void main(String[] args) {
        int[] nums = { 2, 2, 1, 1, 1, 2, 2 };
        System.out.println(majorityElement(nums));
    }
}
