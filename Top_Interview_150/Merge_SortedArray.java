package Top_Interview_150;

import java.util.Arrays;

public class Merge_SortedArray {
    public static void merge(int[] nums1, int m, int[] nums2, int n) {

        for (int i = m; i < m + n; i++) {
            nums1[i] = nums2[i - m];
        }

        Arrays.sort(nums1);
    }

    public static void main(String[] args) {
        int[] nums1 = { 1, 2, 3, 0, 0, 0 };
        int[] nums2 = { 2, 5, 6 };

        merge(nums1, 3, nums2, 3);

        System.out.println(Arrays.toString(nums1));
    }
}
