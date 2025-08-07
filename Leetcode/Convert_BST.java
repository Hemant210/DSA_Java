package Leetcode;

import java.util.*;

//108. Convert Sorted Array to Binary Search Tree
public class Convert_BST {

    // Definition for a binary tree node.
    static class TreeNode {
        int val;
        TreeNode left;
        TreeNode right;

        TreeNode() {
        }

        TreeNode(int val) {
            this.val = val;
        }

        TreeNode(int val, TreeNode left, TreeNode right) {
            this.val = val;
            this.left = left;
            this.right = right;
        }
    }

    // Solution class with logic
    static class Solution {
        public TreeNode sortedArrayToBST(int[] nums) {
            return buildBST(nums, 0, nums.length - 1);
        }

        private TreeNode buildBST(int[] nums, int left, int right) {
            if (left > right)
                return null;

            int mid = left + (right - left) / 2;
            TreeNode root = new TreeNode(nums[mid]);

            root.left = buildBST(nums, left, mid - 1);
            root.right = buildBST(nums, mid + 1, right);

            return root;
        }

        // Level-order traversal that prints tree like LeetCode
        public List<String> levelOrder(TreeNode root) {
            List<String> result = new ArrayList<>();
            if (root == null)
                return result;

            Queue<TreeNode> queue = new LinkedList<>();
            queue.add(root);

            while (!queue.isEmpty()) {
                TreeNode curr = queue.poll();
                if (curr != null) {
                    result.add(String.valueOf(curr.val));
                    queue.add(curr.left);
                    queue.add(curr.right);
                } else {
                    result.add("null");
                }
            }

            // Remove trailing nulls
            int i = result.size() - 1;
            while (i >= 0 && result.get(i).equals("null")) {
                result.remove(i);
                i--;
            }

            return result;
        }
    }

    // Main method
    public static void main(String[] args) {
        // int[] nums = {-10, -3, 0, 5, 9};
        int[] nums = { 1, 3 };

        Solution sol = new Solution();
        TreeNode bstRoot = sol.sortedArrayToBST(nums);

        List<String> output = sol.levelOrder(bstRoot);
        System.out.println("Output: " + output);
    }
}
