package Data_structure_Practice.Arrays;

import java.util.Arrays;

public class arr {
    // // O(n) Time and O(1) Space
    public static int small_number(int[] nums) {
        Arrays.sort(nums);
        int n = nums.length;

        // return nums[0];
        return nums[nums.length - 2];
    }

    public static void Swap(int[] arr, int i, int j) {
        int temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
    }

    public static void next_permutation(int[] arr) {
        int n = arr.length;
        int p = -1;

        for (int i = n - 2; i >= 0; i--) {
            if (arr[i] < arr[i + 1]) {
                p = i;
                break;
            }
        }

        if (p == -1) {
            Arrays.sort(arr);
            return;
        }

        for (int i = n - 1; i > p; i--) {
            if (arr[i] > arr[p]) {
                Swap(arr, i, p);
                break;
            }
        }

        int i = p + 1, j = n - 1;
        while (i < j) {
            Swap(arr, i, j);
            i++;
            j--;
        }

    }

    public static void main(String[] args) {
        int[] arr = { 10, 5, 4, 3, 48, 6, 2, 33, 53, 10 };
        System.out.println(small_number(arr));

        int[] nums = { 1, 2, 3 };

        next_permutation(nums);

        for (int i = 0; i < nums.length; i++) {
            System.out.print(nums[i] + " ");
        }
    }
}
