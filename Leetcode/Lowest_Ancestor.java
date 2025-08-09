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

    // public TreeNode lowestCommonAncestor(TreeNode root, int p, int q) {
    // if (root == null) {
    // return null;
    // }

    // // If root matches either p or q, return root
    // if (root.val == p || root.val == q) {
    // return root;
    // }

    // TreeNode left = lowestCommonAncestor(root.left, p, q);
    // TreeNode right = lowestCommonAncestor(root.right, p, q);

    // if (left == null) {
    // return right;
    // } else if (right == null) {
    // return left;
    // }

    // return root;
    // }
    
    public TreeNode lowestCommonAncestor(TreeNode root, int p, int q) {
        // Ensure p is less than or equal to q
        if (p > q) {
            int temp = p;
            p = q;
            q = temp;
        }

        while (root != null) {
            if (root.val > q) {
                root = root.left;
            } else if (root.val < p) {
                root = root.right;
            } else {
                return root; // This is the LCA
            }
        }

        return null;
    }

    public static void main(String[] args) {
        Lowest_Ancestor solution = new Lowest_Ancestor();

        // Constructing a sample binary tree:
        /*
         * 3
         * / \
         * 5 1
         * / \ / \
         * 6 2 7 4
         * / \
         * 0 8
         */
        TreeNode root = new TreeNode(3);
        root.left = new TreeNode(5);
        root.right = new TreeNode(1);
        root.left.left = new TreeNode(6);
        root.left.right = new TreeNode(2);
        root.left.right.left = new TreeNode(0);
        root.left.right.right = new TreeNode(8);
        root.right.left = new TreeNode(7);
        root.right.right = new TreeNode(4);

        int p = 0, q = 8;
        TreeNode lca = solution.lowestCommonAncestor(root, p, q);
        System.out.println("Lowest Common Ancestor of " + p + " and " + q + " is: " + (lca != null ? lca.val : "null"));
    }
}
