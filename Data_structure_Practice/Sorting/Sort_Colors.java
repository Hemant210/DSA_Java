package Data_structure_Practice.Sorting;

public class Sort_Colors {
    // Time Complexity: O(nlogn) & Space Complexity: O(1)
    public static void sortColors(int[] nums) {
        int n = nums.length;

        int count0 = 0, count1 = 0, count2 = 0;

        for (int i = 0; i < n; i++) {
            if (nums[i] == 0)
                count0++;
            else if (nums[i] == 1)
                count1++;
            else
                count2++;
        }

        int idx = 0;
        for (int i = 0; i < count0; i++) {
            nums[idx++] = 0;
        }

        for (int i = 0; i < count1; i++) {
            nums[idx++] = 1;
        }

        for (int i = 0; i < count2; i++) {
            nums[idx++] = 2;
        }
    }

    // Time Complexity: O(n) & Space Complexity: O(1)
    public static void sort_color(int[] nums) {
        int n = nums.length;

        int low = 0, mid = 0, high = n - 1;

        while (mid <= high) {
            if (nums[mid] == 0) {
                int temp = nums[low];
                nums[low] = nums[mid];
                nums[mid] = temp;

                mid++;
                low++;
            } else if (nums[mid] == 1) {
                mid++;
            } else {
                int temp = nums[high];
                nums[high] = nums[mid];
                nums[mid] = temp;

                high--;
            }
        }
    }

    public static void main(String[] args) {
        int[] nums = { 2, 0, 2, 1, 1, 0 };

        //sortColors(nums);

        sort_color(nums);
        
        for (int i = 0; i < nums.length; i++) {
            System.out.println(nums[i] + " ");
        }
    }
}
