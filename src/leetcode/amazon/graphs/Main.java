package leetcode.amazon.graphs;

import java.util.List;

public class Main {
    public static void main(String[] args) {
        LeetCodeGraphNode nine=new LeetCodeGraphNode(9);
        LeetCodeGraphNode three=new LeetCodeGraphNode(3);
        LeetCodeGraphNode twenty=new LeetCodeGraphNode(20);
        LeetCodeGraphNode fifteen=new LeetCodeGraphNode(15);
        LeetCodeGraphNode seven=new LeetCodeGraphNode(7);

        three.left=nine;
        three.right=twenty;
        twenty.left=fifteen;
        twenty.right=seven;

        List<List<Integer>> returnValue=LevelOrderZigZagTreePrintOut.levelOrder(three);

        for (List<Integer> alist:returnValue){
            for (int value:alist){
                System.out.println(value);
            }
        }

    }
}
