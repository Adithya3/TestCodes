package firstTry.Structures.graph;

import java.util.HashSet;

public class DFSRecursive {
    private static HashSet<GraphNode> visited = new HashSet<GraphNode>();

    public static boolean doesthisnodeExist(int valueToBeFound, GraphNode startingNode) {
        if (visited.contains(startingNode)) {
            return false;
        }
        visited.add(startingNode);
        System.out.println(startingNode.value);
        if (startingNode.value == valueToBeFound) {
            return true;
        }
        for (GraphNode graphNode : startingNode.edges) {
            if (doesthisnodeExist(valueToBeFound, graphNode)) {
                return true;
            }
        }
        return false;
    }
}
