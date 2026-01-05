package DSA;
//Build a Tree  its Preorder traversal
import java.util.LinkedList;
import java.util.Queue;

public class Binary_Tree {
    static class Node {
        int data;
        Node left;
        Node right;

        Node(int data) {
            this.data = data;
            this.left = null;
            this.right = null;
        }
    }

    static class Binarytrees {
        static int idx = -1;

        public static Node buildtree(int nodes[]) {
            idx++;
            if (nodes[idx] == -1) {
                return null;
            }

            Node newNode = new Node(nodes[idx]);
            newNode.left = buildtree(nodes);
            newNode.right = buildtree(nodes);

            return newNode;
        }
    }

    // Tree Traversals Preorder
    public static void preorder(Node root) {
        if (root == null) {
            return;
        }
        System.out.println(root.data + " ");
        preorder(root.left);
        preorder(root.right);
    }

    // Tree Traversals Ineorder
    public static void inorder(Node root) {
        if (root == null) {
            return;
        }

        inorder(root.left);
        System.out.println(root.data + " ");
        inorder(root.right);
    }

    // Tree Traversals Postorder
    public static void Postorder(Node root) {
        if (root == null) {
            return;
        }

        Postorder(root.left);
        Postorder(root.right);
        System.out.println(root.data + " ");
    }

    // Tree Traversals Level order - DFS
    public static void Levelorder(Node root){
        if (root == null) {
            return;
        }
        Queue<Node> q = new LinkedList<>();
        q.add(root);
        q.add(null);

        while (!q.isEmpty()) {
            Node currNode = q.remove();
            if (currNode == null) {
                System.out.println();
                if (q.isEmpty()) {
                    break;
                } else {
                    q.add(null);
                }
            } else {
                System.out.print(currNode.data + " ");
                if (currNode.left != null) {
                    q.add(currNode.left);
                }
                if (currNode.right != null) {
                    q.add(currNode.right);
                }
            }
        }
    }
    public static void main(String[] args) {
        int nodes[] = { 1, 2, 4, -1, -1, 5, -1, -1, 3, -1, 6, -1, -1 };
        Binarytrees tree = new Binarytrees();
        Node root = tree.buildtree(nodes);
        // System.out.println(root.data);
        // preorder(root);
        inorder(root);
        Postorder(root);
        Levelorder(root);
    }
}
