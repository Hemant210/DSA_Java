package Data_structure_Practice.Arrays;

public class Pairsort {
    //Time complexity: O(n) & Space complexity: O(1)
    public static boolean pairInSortedRotated(int[] nums, int target) {
        int n = nums.length;

        int i;
        for (i = 0; i < n - 1; i++) {
            if (nums[i] > nums[i + 1]) {
                break;
            }
        }

        int left = (i + 1) % n;

        int right = i;

        while (left != right) {
            int sum = nums[left] + nums[right];

            if (sum == target)
                return true;

            if (sum > target)
                right = (right - 1 + n) % n;
            else
                left = (left + 1) % n;
        }

        return false;

    }

    public static void main(String[] args) {
        int[] arr = { 9, 10, 10, 11, 15, 26, 38 };
        int target = 20;
        if (pairInSortedRotated(arr, target)) {
            System.out.println("True");
        } else {
            System.out.println("False");
        }
    }
}
