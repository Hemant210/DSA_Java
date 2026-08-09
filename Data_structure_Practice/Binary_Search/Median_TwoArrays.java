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

    public static double findMedianSortedArrays(int[] nums1, int[] nums2) {

        int n1 = nums1.length;
        int n2 = nums2.length;

        if (n1 > n2)
            return findMedianSortedArrays(nums2, nums1);

        int low = 0;
        int high = n1;

        while (low <= high) {

            int i1 = (low + high) / 2;
            int i2 = (n1 + n2 + 1) / 2 - i1;

            int max1 = (i1 == 0) ? Integer.MIN_VALUE : nums1[i1 - 1];
            int min1 = (i1 == n1) ? Integer.MAX_VALUE : nums1[i1];

            int max2 = (i2 == 0) ? Integer.MIN_VALUE : nums2[i2 - 1];
            int min2 = (i2 == n2) ? Integer.MAX_VALUE : nums2[i2];

            if (max1 <= min2 && max2 <= min1) {

                if ((n1 + n2) % 2 == 0) {
                    return (Math.max(max1, max2) + Math.min(min1, min2)) / 2.0;
                } else {
                    return Math.max(max1, max2);
                }

            } else if (max1 > min2) {
                high = i1 - 1;
            } else {
                low = i1 + 1;
            }
        }

        return 0;
    }

    public static void main(String[] args) {
        int[] nums1 = { 1, 3 };
        int[] nums2 = { 2, 4 };

        System.out.println("Median number of two array :- " + find_median(nums1, nums2));

        System.out.println("Median number of two array :- " + findMedianSortedArrays(nums1, nums2));
    }
}
