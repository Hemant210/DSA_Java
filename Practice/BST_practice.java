package Practice;

import java.util.ArrayList;

public class BST_practice {

    // Node class represents each node in the BST
    static class Node {
        int data;
        Node left;
        Node right;

        Node(int data) {
            this.data = data;
        }
    }

    //Minimum element in BST
    public static int getMinimum(Node root){
        if (root == null) {
            return -1;
        }

        Node currentNode = root;
        while (currentNode.left != null) {
            currentNode = currentNode.left;
        }

        return currentNode.data;
    }
    // Print all values in range [x, y]
    public static void printInrange(Node root, int x, int y) {
        if (root == null) {
            return;
        }

        if (root.data >= x && root.data <= y) {
            printInrange(root.left, x, y);
            System.out.print(root.data + " ");
            printInrange(root.right, x, y);
        } else if (root.data >= y) {
            printInrange(root.left, x, y);
        } else {
            printInrange(root.right, x, y);
        }
    }

    // Inorder traversal of BST (Left - Root - Right)
    public static void inorder(Node root) {
        if (root == null) {
            return;
        }

        inorder(root.left);
        System.out.print(root.data + " ");
        inorder(root.right);
    }

    // Insert function to add a new value into the BST
    public static Node insert(Node root, int val) {
        if (root == null) {
            root = new Node(val);
            return root;
        }

        // If value is less than current node's data, insert into left subtree tv
        if (root.data > val) {
            root.left = insert(root.left, val);
        }
        // Otherwise, insert into right subtree
        else {
            root.right = insert(root.right, val);
        }

        return root;
    }

    public static void printpath(ArrayList<Integer> path) {
        for (int i = 0; i < path.size(); i++) {
            System.out.println(path.get(i) + "->");
        }

        System.out.println();
    }

    // Print Root to leaf Paths
    public static void printRoofleaf(Node root, ArrayList<Integer> path) {
        if (root == null) {
            return;
        }

        path.add(root.data);

        if (root.left == null && root.right == null) {
            printpath(path);
        } else {
            printRoofleaf(root.left, path);
            printRoofleaf(root.right, path);
        }

        path.remove(path.size() - 1);
    }

    public static void main(String[] args) {
        int values[] = { 8, 5, 3, 6, 10, 11, 14 };
        Node root = null;

        for (int i = 0; i < values.length; i++) {
            root = insert(root, values[i]);
        }

        System.out.println("Inorder Traversal of BST:");
        inorder(root);
        System.out.println();

        // System.out.print("Nodes in range [" + 2 + ", " + 5 + "]: ");
        // printInrange(root, 2, 5);

        //printRoofleaf(root, new ArrayList<>());
        System.out.println(getMinimum(root));
    }
}
