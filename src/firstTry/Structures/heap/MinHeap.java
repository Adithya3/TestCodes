package firstTry.Structures.heap;

public class MinHeap {
    BinaryNode root;

    public void insert(int value) {
      insert(value,this.root);
    }

    private void insert(int value, BinaryNode root){
     while (root!=null){
         insert(value,root.right);
     }
     root=new BinaryNode(value);
     reAdjustHeap();
    }

    private void reAdjustHeap(){

    }
}
