//Build a Tree from its Preorder traversal
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

    public static void main(String[] args) {
        int nodes[] = { 1, 2, 4, -1, -1, 5, -1, -1, 3, -1, 6, -1, -1 };
        Binarytrees tree = new Binarytrees();
        Node root = tree.buildtree(nodes);
        // System.out.println(root.data);
        // preorder(root);
        //inorder(root);
        Postorder(root);
    }
}
