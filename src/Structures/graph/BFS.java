package Structures.graph;

import java.util.HashSet;
import java.util.LinkedList;

public class BFS {
    private static HashSet<GraphNode> visited = new HashSet<GraphNode>();
    private static java.util.Queue<GraphNode> nodeQueue = new LinkedList<GraphNode>();

    public static boolean doesthisnodeExist(int valueToBeFound, GraphNode startNode) {
        nodeQueue.add(startNode);
        while (!nodeQueue.isEmpty()) {
            GraphNode currentNode=nodeQueue.poll();
            if (currentNode.value==valueToBeFound) {
                return true;
            }
            visited.add(currentNode);
            addEdgeNode(currentNode);
        }
        return false;
    }

    private static void addEdgeNode(GraphNode node) {
        for (GraphNode graphNode : node.edges) {
            if (!visited.contains(graphNode)) {
                nodeQueue.add(graphNode);
            }
        }
    }
}
