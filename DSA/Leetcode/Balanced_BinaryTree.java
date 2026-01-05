package Leetcode;

//110. Balanced Binary Tree
public class Balanced_BinaryTree {
    static class Node {
        int data;
        Node left;
        Node right;

        Node(int data) {
            this.data = data;
        }
    }

    public static boolean isBalanced(Node root) {
        int Heigth = getHeight(root);
        return (Heigth != -1);
    }

    public static int getHeight(Node root) {
        if (root == null) {
            return 0;
        }

        int leftsubtree = getHeight(root.left);
        int rightsubtree = getHeight(root.right);

        if (leftsubtree == -1 || rightsubtree == -1) {
            return -1;
        }
        if (Math.abs(leftsubtree - rightsubtree) > 1) {
            return -1;
        }

        return 1 + Math.max(leftsubtree, rightsubtree);
    }

    public static void main(String[] args) {
        Node root = new Node(3);
        root.left = new Node(9);
        root.right = new Node(20);
        root.right.left = new Node(15);
        root.right.right = new Node(7);

        System.out.println("Is tree balanced :- " + isBalanced(root));
    }
}
