package Data_structure_Practice.Arrays;

import java.util.Arrays;

public class Nextpermutation {

    public static void swap(int[] nums, int i, int j) {
        int temp = nums[i];
        nums[i] = nums[j];
        nums[j] = temp;
    }

    public static void nextPermutation(int[] nums) {
        int n = nums.length;
        int pivot = -1;

        // STEP 1: find pivot
        for (int i = n - 2; i >= 0; i--) {
            if (nums[i] < nums[i + 1]) {   // FIXED
                pivot = i;
                break;
            }
        }

        // STEP 2: if no pivot, sort
        if (pivot == -1) {
            Arrays.sort(nums);
            return;
        }

        // STEP 3: swap with next greater element
        for (int i = n - 1; i > pivot; i--) {
            if (nums[i] > nums[pivot]) {
                swap(nums, i, pivot);
                break;
            }
        }

        // STEP 4: reverse remaining part
        int i = pivot + 1, j = n - 1;
        while (i < j) {
            swap(nums, i, j);
            i++;
            j--;
        }
    }

    public static void main(String[] args) {
        int[] arr = {1, 2, 3};

        nextPermutation(arr);

        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
    }
}
