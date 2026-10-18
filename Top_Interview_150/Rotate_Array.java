package Top_Interview_150;

public class Rotate_Array {
    public static void rotatearray(int[] nums, int k) {
        int n = nums.length;
        k %= n;

        reverse(nums, 0, n - 1);
        reverse(nums, 0, k - 1);
        reverse(nums, k, n - 1);
    }

    public static void reverse(int[] nums, int left, int right) {
        while (left < right) {
            int temp = nums[left];
            nums[left] = nums[right];
            nums[right] = temp;
            left++;
            right--;
        }
    }

    public static void main(String[] args) {
        int[] nums = { -1,-100,3,99 };
        int k = 2;

        rotatearray(nums, k);

        for(int i = 0; i < nums.length; i++){
            System.out.println(nums[i]);
        }
    }
}
