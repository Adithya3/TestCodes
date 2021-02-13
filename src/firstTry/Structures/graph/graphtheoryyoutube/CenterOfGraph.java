package firstTry.Structures.graph.graphtheoryyoutube;

import firstTry.Structures.graph.GraphNode;
import firstTry.Structures.graph.LowFunctionalityGraph;

import java.util.HashMap;
import java.util.LinkedList;
import java.util.List;

public class CenterOfGraph {
    public static List<GraphNode> centerOftheGraph(List<GraphNode> graphNodeList) {
        HashMap<GraphNode, Integer> remainingNodes = new HashMap();

        //working with the edge cases first
        if (graphNodeList.size() == 0) return null;
        if (graphNodeList.size() == 1) return graphNodeList;


        //finding all the leafs
        for (GraphNode node : graphNodeList) {
            int distanceFromCenterValue = node.edges.size();
            remainingNodes.put(node, distanceFromCenterValue);
        }


        //peeling the layers of the graph
        while (remainingNodes.size() >= 2) {
            HashMap<GraphNode, Integer> nextRemaining = new HashMap();
            for (GraphNode node : remainingNodes.keySet()) {
                int distance = remainingNodes.get(node);
                if (distance != 1) {
                    nextRemaining.put(node, distance - 1);
                }
            }
            remainingNodes = nextRemaining;
        }


        return new LinkedList(remainingNodes.keySet());
    }

    public static void main(String[] args) {
        LowFunctionalityGraph aGraph = new LowFunctionalityGraph(1);
        aGraph.addNode(2);
        aGraph.addNode(3);
        aGraph.addNode(4);
        aGraph.addNode(5);
        aGraph.addNode(6);
        aGraph.addNode(7);
        aGraph.addNode(8);
        aGraph.addNode(9);
        aGraph.addNode(10);
        aGraph.addNode(11);
        aGraph.addEdge(5, 7);
        aGraph.addEdge(1, 4);
        aGraph.addEdge(1, 6);
        aGraph.addEdge(4, 7);
        aGraph.addEdge(7, 8);
        aGraph.addEdge(7, 9);
        aGraph.addEdge(4, 3);
        aGraph.addEdge(3, 2);
        aGraph.addEdge(5, 10);
        aGraph.addEdge(11, 10);
        List<GraphNode> centers = centerOftheGraph(aGraph.giveMeNodes());
        for (GraphNode node : centers) {
            System.out.println(node.value);
        }

    }
}
