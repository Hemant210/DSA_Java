package Data_structure_Practice.Arrays;

import java.util.Arrays;

public class Arrangelargenum {

    public static void printLargestNumber(int[] arr) {

        // Step 1: Convert int array to String array
        String[] nums = new String[arr.length];
        for (int i = 0; i < arr.length; i++) {
            nums[i] = String.valueOf(arr[i]);
        }

        // Step 2: Sort using custom comparator
        Arrays.sort(nums, (a, b) -> (b + a).compareTo(a + b));

        // Step 3: Print in single line
        for (String s : nums) {
            System.out.print(s);
        }
    }

    public static void main(String[] args) {
        int[] arr = {3, 30, 34, 5, 9};
        printLargestNumber(arr);
    }
}
