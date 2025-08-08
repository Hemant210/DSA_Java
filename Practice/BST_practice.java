package Practice;

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

    public static void main(String[] args) {
        int values[] = { 5, 1, 3, 4, 2, 7 };
        Node root = null;

        for (int i = 0; i < values.length; i++) {
            root = insert(root, values[i]);
        }

        System.out.println("Inorder Traversal of BST:");
        inorder(root);
        System.out.println();

        System.out.print("Nodes in range [" + 2 + ", " + 5 + "]: ");
        printInrange(root, 2, 5);
    }
}
