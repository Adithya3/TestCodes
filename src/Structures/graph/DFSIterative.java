package Structures.graph;

import java.util.HashSet;
import java.util.Stack;

public class DFSIterative {
    private static Stack<GraphNode> currentStack = new Stack<GraphNode>();
    private static HashSet<GraphNode> visitedNodes = new HashSet<GraphNode>();

    public static boolean doesthisnodeExist(int valueToBeFound, GraphNode startingNode) {
        GraphNode loopNode = startingNode;
        while (loopNode != null) {
            for (GraphNode edge : loopNode.edges) {
                if (!visitedNodes.contains(edge)) {
                    currentStack.push(edge);
                }
            }
            visitedNodes.add(loopNode);
//			System.out.println(currentStack.toString());
            System.out.println(loopNode.value);
            if (loopNode.value == valueToBeFound) {
                return true;
            }
            loopNode = theNextNode(loopNode);
        }
        return false;
    }

    private static GraphNode theNextNode(GraphNode node) {
        if (!node.edges.isEmpty()) {
            for (GraphNode edgeNode : node.edges) {
                if (!(visitedNodes.contains(edgeNode))) {
                    return edgeNode;
                }
            }
        }
        if (currentStack.empty()) {
//			System.out.println(currentStack.toString());
            return null;
        } else {
//			System.out.println(currentStack.peek().value);
            return currentStack.pop();
        }
    }
}
