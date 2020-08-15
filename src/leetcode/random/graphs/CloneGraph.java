package leetcode.random.graphs;

//cloning a connected, undirected graph

import Structures.graph.GraphNode;

import java.util.*;

public class CloneGraph {
    List<GraphNode> visited = new LinkedList<>();
    Queue<GraphNode> queue = new LinkedList<>();
//    Stack<GraphNode> stack = new Stack<>();
    List<GraphNode> newGraph = new LinkedList<>();
    HashMap<Integer, GraphNode> nodeMap = new HashMap();

    public GraphNode cloneGraph(GraphNode node) {
        GraphNode tempNode, newtempNode;
        queue.add(node);
        while (!queue.isEmpty()) {
            tempNode = queue.poll();
            if (!visited.contains(tempNode)) {
                visited.add(tempNode);
                newtempNode = new GraphNode(tempNode.value);
                newGraph.add(newtempNode);
                nodeMap.put(tempNode.value, newtempNode);
                for (GraphNode loopNode : tempNode.edges) {
                    queue.add(loopNode);
                }
            }
        }
        for (int i = 0; i < visited.size(); i++) {
            newtempNode = newGraph.get(i);
            for (GraphNode loopNode : visited.get(i).edges) {
                newtempNode.edges.add(nodeMap.get(loopNode.value));
            }
        }
        return newGraph.get(0);
    }
}
