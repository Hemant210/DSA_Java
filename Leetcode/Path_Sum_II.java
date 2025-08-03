package Leetcode;

import java.util.ArrayList;
import java.util.List;

//113. Path Sum II
public class Path_Sum_II {

    // TreeNode definition
    static class TreeNode {
        int val;
        TreeNode left, right;

        TreeNode(int val) {
            this.val = val;
        }

        TreeNode(int val, TreeNode left, TreeNode right) {
            this.val = val;
            this.left = left;
            this.right = right;
        }
    }

    // Main method to find all root-to-leaf paths that sum to targetSum
    public static List<List<Integer>> pathSum(TreeNode root, int targetSum) {
        List<List<Integer>> result = new ArrayList<>();
        findPaths(root, targetSum, new ArrayList<>(), result);
        return result;
    }

    // Helper method for DFS traversal
    private static void findPaths(TreeNode node, int remainingSum, List<Integer> currentPath,
            List<List<Integer>> result) {
        if (node == null)
            return;

        currentPath.add(node.val);

        // If it's a leaf and the path sum matches, add to result
        if (node.left == null && node.right == null && remainingSum == node.val) {
            result.add(new ArrayList<>(currentPath));
        } else {
            // Explore left and right subtrees
            findPaths(node.left, remainingSum - node.val, currentPath, result);
            findPaths(node.right, remainingSum - node.val, currentPath, result);
        }

        // Backtrack
        currentPath.remove(currentPath.size() - 1);
    }

    // Example usage
    public static void main(String[] args) {
        TreeNode root = new TreeNode(5,
                new TreeNode(4,
                        new TreeNode(11, new TreeNode(7), new TreeNode(2)),
                        null),
                new TreeNode(8,
                        new TreeNode(13),
                        new TreeNode(4, new TreeNode(5), new TreeNode(1))));

        int targetSum = 22;
        List<List<Integer>> result = pathSum(root, targetSum);

        System.out.println("Paths that sum to " + targetSum + ":");
        for (List<Integer> path : result) {
            System.out.println(path);
        }
    }
}
