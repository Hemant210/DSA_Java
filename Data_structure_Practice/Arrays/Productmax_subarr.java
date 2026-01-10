package Data_structure_Practice.Arrays;

public class Productmax_subarr {
    //Time Complexity: O(n) &  Space : O(1)
    public static int maxProduct(int[] nums) {
        int n = nums.length;
        int ans = Integer.MIN_VALUE;
        int prefix = 1, suffix = 1;

        for (int i = 0; i < n; i++) {
            if (prefix == 0)
                prefix = 1;
            if (suffix == 0)
                suffix = 1;

            prefix *= nums[i];
            suffix *= nums[n - i - 1];
            ans = Math.max(ans, Math.max(prefix, suffix));
        }

        return ans;
    }

    public static void main(String[] args) {
        //int[] arr = { 2, 3, -2, 4 };
        int[] arr = {-2,0,-1};
        System.out.println(maxProduct(arr));
    }
}
