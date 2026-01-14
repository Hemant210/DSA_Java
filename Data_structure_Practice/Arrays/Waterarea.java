package Data_structure_Practice.Arrays;

public class Waterarea {
    // Time Complexity: O(n) & O(1) Space
    public static int findarea(int[] nums) {
        int maxarea = 0;

        for (int i = 0; i < nums.length; i++) {
            for (int j = 0; j < nums.length; j++) {
                int w = j - i;
                int h = Math.min(nums[i], nums[j]);

                int currwater = w * h;

                maxarea = Math.max(maxarea, currwater);
            }
        }
        return maxarea;
    }

    public static void main(String[] args) {
        int[] nums = { 1, 8, 6, 2, 5, 4, 8, 3, 7 };
        System.out.println(findarea(nums));
    }
}
