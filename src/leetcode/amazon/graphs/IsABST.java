package leetcode.amazon.graphs;

import crackingCodingInterview.graphtrees.bst.BSTNode;

public class IsABST {
    public static boolean isBST(BSTNode node) {
        boolean rightCheck = false, leftCheck = false;
        if (node == null) {
            return true;
        }
        if (node.getLeft() != null) {
            if (node.getLeft().getValue() <= node.getValue()) {
                leftCheck = true;
            } else leftCheck = false;
        }
        if (node.getRight() != null) {
            if (node.getRight().getValue() > node.getValue()) {
                rightCheck = true;
            } else rightCheck = false;
        }

        return rightCheck && leftCheck;
    }

    public static void main(String[] args) {
    }
}
