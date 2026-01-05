//Print BST TREE
public class BST {
    // Node class represents each node in the BST
    static class Node {
        int data;
        Node left;
        Node right;

        Node(int data) {
            this.data = data;
        }
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

    // Search function to found a value into the BST
    // Time complexity :- O(H)
    public static Boolean search(Node root, int key) {
        if (root == null) {
            return false;
        }
        if (root.data > key) {
            return search(root.left, key);
        } else if (root.data == key) {
            return true;
        } else {
            return search(root.right, key);
        }
    }

    // Delete function to delete a value into the BST
    public static Node delete(Node root, int val){
        if (root.data > val) {
            root.left = delete(root.left, val);
        } else if (root.data < val) {
            root.right = delete(root.right, val);
        } else {
            //Case :- 1
            if (root.left == null && root.right == null) {
                return null;
            }

            //Case :- 2
            if (root.left == null) {
                return root.right;
            } else if (root.right == null) {
                return root.left;
            }

            //Case :- 3
            Node IS = inorderSuccesor(root.right);
            root.data = IS.data;
            root.right = delete(root.right, IS.data);
        }

        return root;
    }

    public static Node inorderSuccesor(Node root){
        while (root.left != null) {
            root = root.left;
        }

        return root;
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

    public static void main(String[] args) {
        int values[] = { 5, 1, 3, 4, 2, 7 };
        Node root = null;

        for (int i = 0; i < values.length; i++) {
            root = insert(root, values[i]);
        }

        System.out.println("Inorder Traversal of BST:");
        inorder(root);
        System.out.println();

        if (search(root, 5)) {
            System.out.println("Found");
        } else {
            System.out.println("Not found");
        }

        delete(root, 5);
        inorder(root);
    }
}
