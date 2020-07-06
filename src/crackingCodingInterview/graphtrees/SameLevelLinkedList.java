package crackingCodingInterview.graphtrees;

import crackingCodingInterview.graphtrees.bst.BSTNode;

import java.util.LinkedList;
import java.util.List;

public class SameLevelLinkedList {
    public static List<List<BSTNode>> createlinkedLists(BSTNode node) {
        List<List<BSTNode>> listofLists = new LinkedList<>();
        LinkedList<BSTNode> current = new LinkedList<>(), next = new LinkedList<>();
        next.add(node);
        while (next.size() != 0) {
            listofLists.add(next);
            current = next;
            next = new LinkedList<>();
            for (BSTNode loopNode : current) {
                if (loopNode.getLeft() != null) {
                    next.add(loopNode.getLeft());
                }
                if (loopNode.getRight() != null) {
                    next.add(loopNode.getRight());
                }
            }
        }
        return listofLists;
    }
}
