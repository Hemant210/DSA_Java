package Data_structure_Practice.Arrays;

public class Missing_number {
    public static int Miss(int[] nums) {

        int sum = 0;

        for (int i = 0; i < nums.length; i++) {
            sum = sum + nums[i];
        }

        int act_sum = (nums.length * (nums.length + 1)) / 2;
        int miss_sum = act_sum - sum;

        return miss_sum;
    }

    public static void main(String[] args) {
        int[] arr = { 9, 6, 4, 2, 3, 5, 7, 0, 1 };
        System.out.println(Miss(arr));
    }
}
