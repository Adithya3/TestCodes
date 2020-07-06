package crackingCodingInterview.graphtrees.bst;

public class BST {
    public BSTNode root = null;

    public BST(BSTNode root) {
        this.root = root;
    }

    public BST() {
    }

    private void addNodeInternal(BSTNode node, BSTNode base) {
        if (base == null) {
            this.root = node;
        } else {
            if (node.getValue() < base.getValue()) {
                if (base.getLeft() != null) {
                    addNodeInternal(node, base.getLeft());
                } else {
                    base.setLeft(node);
                }
            } else {
                if (base.getRight() != null) {
                    addNodeInternal(node, base.getRight());
                } else {
                    base.setRight(node);
                }
            }
        }
    }

    public void addNode(BSTNode node) {
        addNodeInternal(node, root);
    }

    private void inOrderInternal(BSTNode node) {
        if (node != null) {
            inOrderInternal(node.getLeft());
            System.out.println(node.getValue());
            inOrderInternal(node.getRight());
        }
    }

    public void inOrder() {
        inOrderInternal(this.root);
    }

    private void preOrderInternal(BSTNode node) {
        if (node != null) {
            System.out.println(node.getValue());
            preOrderInternal(node.getLeft());
            preOrderInternal(node.getRight());
        }
    }

    public void preOrder() {
        preOrderInternal(this.root);
    }

    private int height(BSTNode node) {
        if (node == null) {
            return 0;
        }
        return Math.max(height(node.getLeft()), height(node.getRight())) + 1;
    }

    public int height() {
        return height(this.root);
    }
}
