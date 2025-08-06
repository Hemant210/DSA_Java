package Leetcode;

public class Convert_BST {

    // Definition for a binary tree node.
    static class TreeNode {
        int val;
        TreeNode left;
        TreeNode right;

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

    // Solution class with logic
    static class Solution {
        public TreeNode sortedArrayToBST(int[] nums) {
            return buildBST(nums, 0, nums.length - 1);
        }

        private TreeNode buildBST(int[] nums, int left, int right) {
            if (left > right) return null;

            int mid = left + (right - left) / 2;
            TreeNode root = new TreeNode(nums[mid]);

            root.left = buildBST(nums, left, mid - 1);
            root.right = buildBST(nums, mid + 1, right);

            return root;
        }

        // Helper function: Inorder Traversal (prints BST in ascending order)
        public void inorderTraversal(TreeNode root) {
            if (root != null) {
                inorderTraversal(root.left);
                System.out.print(root.val + " ");
                inorderTraversal(root.right);
            }
        }
    }

    // Main method to run in VS Code
    public static void main(String[] args) {
        int[] nums = {-10, -3, 0, 5, 9};

        Solution sol = new Solution();
        TreeNode bstRoot = sol.sortedArrayToBST(nums);

        System.out.print("Inorder Traversal of BST: ");
        sol.inorderTraversal(bstRoot);  // Should print: -10 -3 0 5 9
    }
}

