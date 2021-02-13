package firstTry.crackingCodingInterview.graphtrees.bst;

import firstTry.crackingCodingInterview.graphtrees.SameLevelLinkedList;

import java.util.LinkedList;
import java.util.List;

public class BSTMain {
    public static void main(String[] args) {
//        int[] sortedArray = {1, 2, 3, 4, 5, 6, 7, 8,9};
//        CreateShortestHeightTree creation = new CreateShortestHeightTree();
//        BST newbst = creation.solution(sortedArray);
        BST newbst = new BST();
        newbst.addNode(new BSTNode(5));
        newbst.addNode(new BSTNode(3));
        newbst.addNode(new BSTNode(2));
        newbst.addNode(new BSTNode(1));
        newbst.addNode(new BSTNode(8));
        newbst.addNode(new BSTNode(7));
        newbst.addNode(new BSTNode(9));
        newbst.addNode(new BSTNode(22));
//        newbst.inOrder();
//        System.out.println(newbst.height());
        List<List<BSTNode>> listOfList = SameLevelLinkedList.createlinkedLists(newbst.root);
        for (List<BSTNode> rows : listOfList) {
            List<Integer> values = new LinkedList<>();
            for (BSTNode each : rows) {
                values.add(each.getValue());
            }
            System.out.println(values);
        }

    }
}
