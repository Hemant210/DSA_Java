package Practice;

//Count of Nodes
public class BinaryTree_Practice {
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

    public static int countofNodes(Node root) {
        if (root == null) {
            return 0;
        }

        int leftNode = countofNodes(root.left);
        int rightNode = countofNodes(root.right);

        return leftNode + rightNode + 1;
    }

    // Sum of Nodes
    public static int sumofNodes(Node root) {
        if (root == null) {
            return 0;
        }

        int sumleftNode = sumofNodes(root.left);
        int sumrightNode = sumofNodes(root.right);

        return sumleftNode + sumrightNode + root.data;
    }

    //Calculate height of Tree
    public static int height(Node root){
        if (root == null) {
            return 0;
        }

        int leftheight = height(root.left);
        int rightheight = height(root.right);

        return Math.max(leftheight, rightheight + 1);
    }
    public static void main(String[] args) {
        int nodes[] = { 1, 2, 4, -1, -1, 5, -1, -1, 3, -1, 6, -1, -1 };
        Binarytrees tree = new Binarytrees();
        Node root = tree.buildtree(nodes);
        System.out.println("Number of Nodes :- " + countofNodes(root));
        System.out.println("Sum of Nodes :- " + sumofNodes(root));
        System.out.println("Height of Tree :- " + height(root));
    }
}
