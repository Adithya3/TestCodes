package leetcode.amazon.graphs;

import java.util.ArrayList;
import java.util.List;

public class LevelOrderTreePrint {
    public static List<List<Integer>> levelOrder(LeetCodeGraphNode root) {
        if (root == null) return null;

        List<List<Integer>> traversalList = new ArrayList<>();
        List<List<LeetCodeGraphNode>> traversalListTreeNode = new ArrayList();
        List<LeetCodeGraphNode> currentList = new ArrayList();
        List<LeetCodeGraphNode> futureList = new ArrayList();
        List<Integer> tempList;

        currentList.add(root);
        futureList.add(root);
        traversalListTreeNode.add(futureList);

        while (!futureList.isEmpty()) {
            futureList = new ArrayList();
            for (LeetCodeGraphNode node : currentList) {
                if (node.left != null) {
                    futureList.add(node.left);
                }
                if (node.right != null) {
                    futureList.add(node.right);
                }
            }
            currentList=new ArrayList<>();
            if (!futureList.isEmpty()) {
                currentList=futureList;
                traversalListTreeNode.add(futureList);
            }
        }


        for (List<LeetCodeGraphNode> alist : traversalListTreeNode) {
            tempList = new ArrayList();
            for (LeetCodeGraphNode node : alist) {
                tempList.add(node.val);
            }
            traversalList.add(tempList);
        }

        return traversalList;
    }
}
