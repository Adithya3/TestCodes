package leetcode.interview.tree;
//Given a binary tree, find its maximum depth.
//
//        The maximum depth is the number of nodes along the longest path from the root node down to the farthest leaf node.
//
//        Note: A leaf is a node with no children.

/**
 * Definition for a binary tree node.
 * public class TreeNode {
 * int val;
 * TreeNode left;
 * TreeNode right;
 * TreeNode() {}
 * TreeNode(int val) { this.val = val; }
 * TreeNode(int val, TreeNode left, TreeNode right) {
 * this.val = val;
 * this.left = left;
 * this.right = right;
 * }
 * }
 */

public class MaximumDepth {

    public static int maxDepth0(TreeNode root) {
        int depth = 0;
        if (root == null) return depth;
        depth = 1;
        if (root.left == null && root.right == null) return depth;
        if (root.left != null && root.right != null) {
            depth = 1 + maxValue(maxDepth0(root.left), maxDepth0(root.right));
        } else if (root.left != null && root.right == null) {
            depth = 1 + maxDepth0(root.left);
        } else if (root.right != null && root.left == null) {
            depth = 1 + maxDepth0(root.right);
        }
        return depth;
    }

    public static int maxDepth(TreeNode root) {
        int depth = 0;
        if (root == null) return 0;
        depth = 1;
        if (root.left == null && root.right == null) return depth;
        depth = 1 + maxValue(maxDepth(root.left), maxDepth(root.right));
        return depth;
    }

    public static int maxValue(int value1, int value2) {
        if (value1 > value2) return value1;
        else return value2;
    }

    public static void main(String[] args) {

    }
}
