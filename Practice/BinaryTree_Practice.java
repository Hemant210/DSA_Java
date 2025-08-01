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

    // Calculate height of Tree
    public static int height(Node root) {
        if (root == null) {
            return 0;
        }

        int leftheight = height(root.left);
        int rightheight = height(root.right);

        return Math.max(leftheight, rightheight + 1);
    }

    // Calculate diameter of Tree
    // Time complexity = O(n²) ✅ Brute Force approch
    public static int diameter(Node root) {
        if (root == null) {
            return 0;
        }

        int dia1 = diameter(root.left);
        int dia2 = diameter(root.right);
        int dia3 = height(root.left) + height(root.right) + 1;

        return Math.max(dia3, Math.max(dia1, dia2));
    }

    static class TreeInfo {
        int ht;
        int diam;

        TreeInfo(int ht, int diam) {
            this.ht = ht;
            this.diam = diam;
        }
    }

    // Calculate diameter of Tree
    // Time complexity = O(n) ✅
    public static TreeInfo diameter2(Node root) {
        if (root == null) {
            return new TreeInfo(0, 0);
        }
        TreeInfo left = diameter2(root.left);
        TreeInfo right = diameter2(root.right);

        int myheight = Math.max(left.ht, right.ht) + 1;

        int diam1 = left.diam;
        int diam2 = right.diam;
        int diam3 = left.ht + right.ht + 1;

        int mydiam = Math.max(Math.max(diam1, diam2), diam3);

        TreeInfo myiInfo = new TreeInfo(myheight, mydiam);
        return myiInfo;
    }

    //Subtree of another tree
    public static void main(String[] args) {
        int nodes[] = { 1, 2, 4, -1, -1, 5, -1, -1, 3, -1, 6, -1, -1 };
        Binarytrees tree = new Binarytrees();
        Node root = tree.buildtree(nodes);
        System.out.println("Number of Nodes :- " + countofNodes(root));
        System.out.println("Sum of Nodes :- " + sumofNodes(root));
        System.out.println("Height of Tree :- " + height(root));
        System.out.println("Diameter of Tree :- " + diameter(root));
        System.out.println("Diameter of Tree :- " + diameter2(root).diam);
    }
}
