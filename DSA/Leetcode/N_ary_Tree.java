package DSA.Leetcode;

import java.util.ArrayList;
import java.util.List;

//590. N-ary Tree Postorder Traversal
public class N_ary_Tree {
    static class Node {
        public int val;
        public List<Node> children;

        public Node() {
        }

        public Node(int _val) {
            val = _val;
        }

        public Node(int _val, List<Node> _children) {
            val = _val;
            children = _children;
        }
    }

    List<Integer> res = new ArrayList<>();

    // Postorder traversal public method
    public List<Integer> postorder(Node root) {
        postordertraversal(root);
        return res;
    }

    // Recursive postorder traversal
    public void postordertraversal(Node root) {
        if (root == null) {
            return;
        }

        for (Node child : root.children) {
            postordertraversal(root);
        }

        res.add(root.val);
    }

    public static void main(String[] args) {
        N_ary_Tree tree = new N_ary_Tree();

        // Creating the N-ary tree manually
        Node root = new Node(1);
        Node child1 = new Node(3);
        Node child2 = new Node(2);
        Node child3 = new Node(4);
        Node child11 = new Node(5);
        Node child12 = new Node(6);

        child1.children = new ArrayList<>();
        child1.children.add(child11);
        child1.children.add(child12);

        // Assign children to root
        root.children = new ArrayList<>();
        root.children.add(child1);
        root.children.add(child2);
        root.children.add(child3);

        List<Integer> result = tree.postorder(root);

        System.out.println(result);
    }
}
