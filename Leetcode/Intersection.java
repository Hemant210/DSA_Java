package Leetcode;

import java.util.ArrayList;
import java.util.HashSet;

public class Intersection {
    // Intersection of Two Arrays
    public int[] intersection(int[] nums1, int[] nums2) {
        HashSet<Integer> set = new HashSet<>();
        ArrayList<Integer> ans = new ArrayList<>();

        for (int i = 0; i < nums1.length; i++) {
            set.add(nums1[i]);
        }

        for (int i = 0; i < nums2.length; i++) {
            if (set.contains(nums2[i])) {
                ans.add(nums2[i]);
                set.remove(nums2[i]);
            }
        }
        int[] arr = new int[ans.size()];

        for (int i = 0; i < ans.size(); i++) {
            arr[i] = ans.get(i);
        }
        return arr;
    }

    public static void main(String[] args) {
        Intersection p = new Intersection();
        int[] nums1 = { 1, 2, 3 };
        int[] nums2 = { 2, 5, 6 };

        int[] result = p.intersection(nums1, nums2);
        System.out.print("Intersection array: ");
        for (int i = 0; i < result.length; i++) {
            System.out.print(nums2[i] + " ");
        }
        System.out.println();
    }
}
