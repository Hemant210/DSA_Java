package Data_structure_Practice.Arrays;

public class RainTrp {
    // Time Complexity: O(n) & O(1) Space
    public static int trap(int[] nums) {
        int n = nums.length;
        int l = 0, r = n - 1, ans = 0;
        int rightmax = 0, leftmax = 0;

        while (l < r) {
            leftmax = Math.max(leftmax, nums[l]);
            rightmax = Math.max(rightmax, nums[r]);

            if (leftmax < rightmax) {
                ans += leftmax - nums[l];
                l++;
            } else {
                ans += rightmax - nums[r];
                r--;
            }
        }

        return ans;
    }

    public static void main(String[] args) {
        int[] arr = { 0, 1, 0, 2, 1, 0, 1, 3, 2, 1, 2, 1 };

        System.out.println(trap(arr));
    }
}
