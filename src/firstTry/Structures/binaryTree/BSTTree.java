package firstTry.Structures.binaryTree;

public class BSTTree {
    public BinaryNode root;

    BSTTree(int value) {
        this.root = new BinaryNode(value);
    }

    public boolean exist(int value) {
        return exist(value, this.root);
    }

    public void insert(int value) {
        insert(value, this.root);
    }

    public void inorder() {
        inorder(this.root);
    }

    private void insert(int value, BinaryNode root) {
        if (value > root.value) {
            if (root.right != null) {
                insert(value, root.right);
            } else {
                root.right = new BinaryNode(value);
            }
        }
        if (value < root.value) {
            if (root.left != null) {
                insert(value, root.left);
            } else {
                root.left = new BinaryNode(value);
            }
        }
    }

    private void inorder(BinaryNode root) {
        if (root.left != null) {
            inorder(root.left);
        }
        System.out.println(root.value);
        if (root.right != null) {
            inorder(root.right);
        }
    }

    private boolean exist(int value, BinaryNode root) {
        if (root!=null){
            if (root.value == value) {
                return true;
            } else if (value < root.value) {
                return  exist(value, root.left);
            } else if (value > root.value) {
                return exist(value, root.right);
            }
        }
        return false;
    }
}
