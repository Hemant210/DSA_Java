package Leetcode;

public class Subtree_tree {
    // TreeNode structure for binary tree
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

    static class TreeBuilder {
        static int idx = -1;

        public static TreeNode buildTree(Integer[] nodes) {
            idx++;
            if (idx >= nodes.length || nodes[idx] == null) {
                return null;
            }

            TreeNode newNode = new TreeNode(nodes[idx]);
            newNode.left = buildTree(nodes);
            newNode.right = buildTree(nodes);
            return newNode;
        }
    }

    // Checks if two trees are structurally identical
    public static boolean isidentical(TreeNode root, TreeNode subRoot) {
        if (root == null && subRoot == null) {
            return true;
        }

        if (root == null || subRoot == null) {
            return false;
        }

        if (root.val == subRoot.val) {
            return isidentical(root.left, subRoot.left) && isidentical(root.right, subRoot.right);
        }

        return false;
    }

    // Checks if subRoot is a subtree of root
    public static boolean isSubtree(TreeNode root, TreeNode subRoot) {
        if (root == null) {
            return false;
        }

        if (subRoot == null) {
            return true;
        }

        if (root.val == subRoot.val) {
            if (isidentical(root, subRoot)) {
                return true;
            }
        }

        return isSubtree(root.left, subRoot) || isSubtree(root.right, subRoot);
    }

    public static void main(String[] args) {
        Integer[] mainTree = { 3, 4, 1, null, null, 2, null, null, 5, null, null }; // Main tree
        Integer[] subTree = { 4, 1, null, null, 2, null, null };

        TreeBuilder.idx = -1; // reset before first tree
        TreeNode root = TreeBuilder.buildTree(mainTree);

        TreeBuilder.idx = -1; // reset before second tree
        TreeNode subRoot = TreeBuilder.buildTree(subTree);

        if (isSubtree(root, subRoot)) {
            System.out.println("subRoot is a subtree of root.");
        } else {
            System.out.println("subRoot is NOT a subtree of root.");
        }
    }
}
