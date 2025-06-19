package Leetcode;

import java.util.ArrayList;
import java.util.HashSet;

//88. Merge Sorted Array
// public class Practice {
//     public void merge(int[] nums1, int m, int[] nums2, int n) {
//             int idx = m + n - 1;
//             int i = m - 1;
//             int j  = n - 1;
    
//             while(i >= 0 && j >= 0){
//                 if(nums1[i] > nums2[j]){
//                     nums1[idx--] = nums1[i--];
//                 } else {
//                     nums1[idx--] = nums2[j--];
//                 }
//             }
            
//             while(j >= 0){
//                 nums1[idx--] = nums2[j--];
//             }
//         }

//         public static void main(String[] args){
//             Practice p = new Practice();

//             int[] nums1 = {1, 2, 3, 0, 0, 0};
//             int[] nums2 = {2, 5, 6};
//             int m = 3;
//             int n = 3;
    
//             p.merge(nums1, m, nums2, n);
    
//             System.out.print("Merged array: ");
//             for (int i = 0; i < nums1.length; i++) {
//                 System.out.print(nums1[i] + " ");
//             }
//             System.out.println();
//         }
//     }    
    
//Intersection of Two Arrays
public class Practice{
    public int[] intersection(int[] nums1, int[] nums2) {
        HashSet<Integer> set = new HashSet<>();
        ArrayList<Integer> ans = new ArrayList<>();

        for(int i = 0; i < nums1.length; i++){
            set.add(nums1[i]);
        }

        for(int i = 0; i < nums2.length; i++){
            if(set.contains(nums2[i])){
                ans.add(nums2[i]);
                set.remove(nums2[i]);
            }
        }
        int [] arr = new int[ans.size()];

        for(int i = 0; i < ans.size(); i++){
            arr[i] = ans.get(i);
        }
        return arr;
}


    public static void main(String[] args) {
        Practice p = new Practice();
        int[] nums1 = {1, 2, 3};
        int[] nums2 = {2, 5, 6};

        int[] result = p.intersection(nums1, nums2);
        System.out.print("Intersection array: ");
            for (int i = 0; i < result.length; i++) {
                System.out.print(nums2[i] + " ");
            }
            System.out.println();
    }
}