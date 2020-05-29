package interview.goldman.binarySearch.tree;

public class MainBST {
    public static void main(String[] args) {
        BST aBST= new BST(12);
        aBST.put(8);
        aBST.put(77);
        aBST.put(77);
        aBST.put(77);
        aBST.put(77);
        aBST.put(9);
        aBST.put(6);
        aBST.put(6);
        aBST.put(98);
        aBST.put(13);
        aBST.put(4);
        System.out.println(aBST.exist(6));
    }
}
