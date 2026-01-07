package Data_structure_Practice.Arrays;

public class Productexpect {
    //Time complexity: O(n²) & Space complexity: O(1)
    public static int[] productExceptSelf(int[] nums) {
        int n = nums.length;
        int[] ans = new int[n];

        for (int i = 0; i < n; i++) {
            ans[i] = 1;
            for (int j = 0; j < n; j++) {
                if (i != j) {
                    ans[i] *= nums[j];
                }
            }
        }

        return ans;
    }

    public static void main(String[] args) {
        int[] arr = { 1, 2, 3, 4 };
        int[] res = productExceptSelf(arr);

        for (int i = 0; i < res.length; i++) {
            System.out.print(res[i] + " ");
        }
    }
}
