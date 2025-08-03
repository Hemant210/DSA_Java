package Leetcode;

//236. Lowest Common Ancestor of a Binary Tree
public class Lowest_Ancestor {
    static class TreeNode {
        int val;
        TreeNode left;
        TreeNode right;

        TreeNode(int x) {
            val = x;
        }
    }

    public TreeNode lowestCommonAncestor(TreeNode root, int p, int q) {
        if (root == null) {
            return null;
        }

        // If root matches either p or q, return root
        if (root.val == p || root.val == q) {
            return root;
        }

        TreeNode left = lowestCommonAncestor(root.left, p, q);
        TreeNode right = lowestCommonAncestor(root.right, p, q);

        if (left == null) {
            return right;
        } else if (right == null) {
            return left;
        }

        return root;
    }

    public static void main(String[] args) {
        Lowest_Ancestor solution = new Lowest_Ancestor();

        // Constructing a sample binary tree:
        /*
                  3
                 / \
                5   1
               / \ / \
              6  2 0  8
                / \
               7   4
        */
        TreeNode root = new TreeNode(3);
        root.left = new TreeNode(5);
        root.right = new TreeNode(1);
        root.left.left = new TreeNode(6);
        root.left.right = new TreeNode(2);
        root.left.right.left = new TreeNode(7);
        root.left.right.right = new TreeNode(4);
        root.right.left = new TreeNode(0);
        root.right.right = new TreeNode(8);

        int p = 5, q = 1;
        TreeNode lca = solution.lowestCommonAncestor(root, p, q);
        System.out.println("Lowest Common Ancestor of " + p + " and " + q + " is: " + (lca != null ? lca.val : "null"));
    }
}
