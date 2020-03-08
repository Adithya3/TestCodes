package Structures.graph;

import java.util.HashSet;

public class LowFunctionalityGraph implements Graph {
    GraphNode top;
    HashSet<GraphNode> nodeSet = new HashSet<GraphNode>();

    public LowFunctionalityGraph(int graphNodeValue) {
        GraphNode top = new GraphNode(graphNodeValue);
        this.top = top;
        nodeSet.add(top);
    }

    @Override
    public GraphNode addNode(int nodeValue) {
        GraphNode tempGraphNode = new GraphNode(nodeValue);
        nodeSet.add(tempGraphNode);
        return tempGraphNode;
    }

    @Override
    public boolean removeNode(int nodeValue) {
        GraphNode tempNode = doWeHaveNodeForValuethenGiveNode(nodeValue);
        if (tempNode != null) {
            nodeSet.remove(tempNode);
            return true;
        }
        return false;
    }

    @Override
    public boolean addEdge(int nodeValue1, int nodeValue2) {
        GraphNode nodeForValue1 = doWeHaveNodeForValuethenGiveNode(nodeValue1);
        GraphNode nodeForValue2 = doWeHaveNodeForValuethenGiveNode(nodeValue2);
        if ((nodeForValue1 != null) && (nodeForValue2 != null)) {
            nodeForValue1.edges.add(nodeForValue2);
            nodeForValue2.edges.add(nodeForValue1);
            return true;
        }
        return false;
    }

    @Override
    public boolean removeEdge(int nodeValue1, int nodeValue2) {
        GraphNode nodeForValue1 = doWeHaveNodeForValuethenGiveNode(nodeValue1);
        GraphNode nodeForValue2 = doWeHaveNodeForValuethenGiveNode(nodeValue2);
        if ((nodeForValue1 != null) && (nodeForValue2 != null)) {
            nodeForValue1.edges.remove(nodeForValue2);
            nodeForValue2.edges.remove(nodeForValue1);
            return true;
        }
        return false;
    }

    public GraphNode doWeHaveNodeForValuethenGiveNode(int value) {
        for (GraphNode graphNode : nodeSet) {
            if (graphNode.value == value) {
                return graphNode;
            }
        }
        return null;
    }

    @Override
    public void dumpGraph() {
        for (GraphNode graphNode : nodeSet) {
            System.out.println(graphNode.value);
            if (!graphNode.edges.isEmpty()) {
                for (GraphNode edgeNode : graphNode.edges) {
                    System.out.println("|--" + edgeNode.value);
                }
            }
        }
    }

}
