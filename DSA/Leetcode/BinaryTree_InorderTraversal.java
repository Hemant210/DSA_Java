package Leetcode;

import java.util.ArrayList;
import java.util.List;

//94. Binary Tree Inorder Traversal
//144. Binary Tree Preorder Traversal
//145. Binary Tree Postorder Traversal
public class BinaryTree_InorderTraversal {
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

    public List<Integer> indorTraversal(TreeNode root) {
        List<Integer> res = new ArrayList<>();
        helper(res, root);
        return res;
    }

    public void helper(List<Integer> res, TreeNode root) {
        if (root == null) {
            return;
        }

        //Inorder Traversal
        helper(res, root.left);
        res.add(root.val);
        helper(res, root.right);

        //Preorder Traversal
        
        res.add(root.val);
        helper(res, root.left);
        helper(res, root.right);
    }

    public static void main(String[] args) {
        BinaryTree_InorderTraversal tree = new BinaryTree_InorderTraversal();
        TreeNode root = new TreeNode(1);
        root.right = new TreeNode(2);
        root.right.left = new TreeNode(3);

        List<Integer> result = tree.indorTraversal(root);
        System.out.println("Inorder Traversal: " + result);
    }
}
