package interview.goldman.binarySearch.tree;

public class BST {
    BSTNode root;

    BST(int value) {
        this.root = new BSTNode(value);
    }

    public void put(int value) {
        put(this.root, value);
    }

    private void put(BSTNode root, int value) {
        if (value < root.value) {
            if (root.left != null) {
                put(root.left, value);
            } else {
                root.left = new BSTNode(value);
            }
        } else {
            if (root.right != null) {
                put(root.right, value);
            } else {
                root.right = new BSTNode(value);
            }
        }
    }

    public void inOrder() {
        inOrder(this.root);
    }

    private void inOrder(BSTNode root) {
        if (root.left != null) {
            inOrder(root.left);
        }
        System.out.println(root.value);
        if (root.right != null) {
            inOrder(root.right);
        }
    }

    public boolean exist(int value) {
        return exist(this.root, value);
    }

    private boolean exist(BSTNode root, int value) {
        if (root != null) {
            if (root.value == value) return true;
            if (value > root.value) {
                return exist(root.right, value);
            } else if (value < root.value) {
                return exist(root.left, value);
            }
        }
        return false;
    }
}
