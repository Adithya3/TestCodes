package leetcode.random.graphs;

import Structures.graph.GraphNode;

import java.util.HashSet;
import java.util.LinkedList;
import java.util.Queue;
import java.util.Set;

public class DumpAGraphFromNode {
    static Queue<GraphNode> queue = new LinkedList<>();
    static Set<GraphNode> graphSet = new HashSet<>();

    private static void createGraphSet(GraphNode node) {
        GraphNode tempNode;
        queue.clear();
        graphSet.clear();
        queue.add(node);
        while (!queue.isEmpty()) {
            tempNode = queue.poll();
            for (GraphNode loopNode : tempNode.edges) {
                if (!graphSet.contains(loopNode)) {
                    graphSet.add(loopNode);
                    queue.add(loopNode);
                }
            }
        }
    }

    public static void dumpGraph(GraphNode node) {
        createGraphSet(node);
        for (GraphNode graphNode : graphSet) {
            System.out.println(graphNode.value);
            if (!graphNode.edges.isEmpty()) {
                for (GraphNode edgeNode : graphNode.edges) {
                    System.out.println("|--" + edgeNode.value);
                }
            }
        }
    }
}
