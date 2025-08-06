package Leetcode;

import java.util.*;

public class ConvertSorted_BST {

    // Definition for singly-linked list
    static class ListNode {
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

    // Definition for a binary tree node
    static class TreeNode {
        int val;
        TreeNode left, right;

        TreeNode() {}

        TreeNode(int val) {
            this.val = val;
        }

        TreeNode(int val, TreeNode left, TreeNode right) {
            this.val = val;
            this.left = left;
            this.right = right;
        }
    }

    // Custom Solution to match expected output structure
    static class Solution {
        public TreeNode sortedListToBST(ListNode head) {
            List<Integer> values = new ArrayList<>();
            while (head != null) {
                values.add(head.val);
                head = head.next;
            }
            return buildBST(values, 0, values.size() - 1);
        }

        // Force the mid to favor left middle when even length to match expected shape
        private TreeNode buildBST(List<Integer> nums, int left, int right) {
            if (left > right) return null;

            // Choose left middle when even length to force tree shape
            int mid = (left + right) / 2;

            TreeNode node = new TreeNode(nums.get(mid));
            node.left = buildBST(nums, left, mid - 1);
            node.right = buildBST(nums, mid + 1, right);
            return node;
        }
    }

    // Helper: Print level-order traversal
    public static void printLevelOrder(TreeNode root) {
        if (root == null) {
            System.out.println("[]");
            return;
        }

        Queue<TreeNode> queue = new LinkedList<>();
        queue.offer(root);
        List<String> result = new ArrayList<>();

        while (!queue.isEmpty()) {
            TreeNode node = queue.poll();
            if (node != null) {
                result.add(String.valueOf(node.val));
                queue.offer(node.left);
                queue.offer(node.right);
            } else {
                result.add("null");
            }
        }

        // Remove trailing nulls
        int i = result.size() - 1;
        while (i >= 0 && result.get(i).equals("null")) i--;
        result = result.subList(0, i + 1);

        System.out.println(result);
    }

    // Main method
    public static void main(String[] args) {
        // Create sample linked list: [-10, -3, 0, 5, 9]
        ListNode head = new ListNode(-10);
        head.next = new ListNode(-3);
        head.next.next = new ListNode(0);
        head.next.next.next = new ListNode(5);
        head.next.next.next.next = new ListNode(9);

        // Convert to BST
        Solution sol = new Solution();
        TreeNode bstRoot = sol.sortedListToBST(head);

        // Print result as level-order traversal
        System.out.print("Level Order BST: ");
        printLevelOrder(bstRoot);
    }
}


//        0
//       / \
//     -3   9
//     /    /
//  -10    5

