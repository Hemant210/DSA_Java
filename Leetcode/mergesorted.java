package Leetcode;

//88. Merge Sorted Array
// public class merge_sorted {
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
//             merge_sorted p = new merge_sorted();

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
    

//21. Merge Two Sorted List - Recursion
public class mergesorted {

    public static class ListNode {
        int val;
        ListNode next;

        ListNode() {}

        ListNode(int val) {
            this.val = val;
        }

        ListNode(int val, ListNode next) {
            this.val = val;
            this.next = next;
        }
    }

    static class Solution {
        public ListNode mergeTwoLists(ListNode list1, ListNode list2) {
            if (list1 == null) return list2;
            if (list2 == null) return list1;

            if (list1.val < list2.val) {
                list1.next = mergeTwoLists(list1.next, list2);
                return list1;
            } else {
                list2.next = mergeTwoLists(list1, list2.next);
                return list2;
            }
        }
    }

    public static void main(String[] args) {
        // Create list1: 1 -> 2 -> 4
        ListNode list1 = new ListNode(1, new ListNode(2, new ListNode(4)));

        // Create list2: 1 -> 3 -> 4
        ListNode list2 = new ListNode(1, new ListNode(3, new ListNode(4)));

        Solution solution = new Solution();
        ListNode merged = solution.mergeTwoLists(list1, list2);

        while (merged != null) {
            System.out.print(merged.val + " ");
            merged = merged.next;
        }
    }
}
