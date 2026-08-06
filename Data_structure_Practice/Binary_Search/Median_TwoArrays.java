package Data_structure_Practice.Binary_Search;

import java.util.Arrays;

public class Median_TwoArrays {
    public static double find_median(int[] nums1, int[] nums2) {
        int[] merged = new int[nums1.length + nums2.length];

        System.arraycopy(nums1, 0, merged, 0, nums1.length);
        System.arraycopy(nums2, 0, merged, nums1.length, nums2.length);

        Arrays.sort(merged);

        int n = merged.length;

        if (n % 2 != 0) {
            return merged[n / 2];
        }

        return (merged[n / 2] + merged[(n / 2) - 1]) / 2.0;

    }

    public static void main(String[] args) {
        int[] nums1 = { 1, 3 };
        int[] nums2 = { 2, 4 };

        System.out.println(find_median(nums1, nums2));
    }
}
