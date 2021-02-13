package firstTry.crackingCodingInterview.graphtrees;

import firstTry.crackingCodingInterview.graphtrees.bst.BST;
import firstTry.crackingCodingInterview.graphtrees.bst.BSTNode;

public class CreateShortestHeightTree {
    BST newBST;

    public CreateShortestHeightTree() {
        newBST = new BST();
    }

    private void solutionInternal(int[] theArray, int left, int right) {
        if (left < right) {
            int mid = (left+right)/2;
            this.newBST.addNode(new BSTNode(theArray[mid]));
            solutionInternal(theArray, left, mid);
            solutionInternal(theArray, mid + 1, right);
        }
    }

    public BST solution(int[] theArray) {
        solutionInternal(theArray, 0, theArray.length - 1);
        return newBST;
    }
}
