package Structures.graph;

import java.util.HashSet;

public class HighFunctionalityGraph implements Graph {

    GraphNode top;
    HashSet<GraphNode> nodeSet = new HashSet<GraphNode>();

    public HighFunctionalityGraph(int value) {
        GraphNode top = new GraphNode(value);
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
            // setting the top to another node.
            if (tempNode == top) {
                if (!tempNode.edges.isEmpty()) {
                    top = tempNode.edges.get(0);
                }
            }
            // removing all the edges to this vertex
            for (GraphNode graphNode : tempNode.edges) {
                if (graphNode.edges.contains(tempNode)) {
                    graphNode.edges.remove(tempNode);
                }
            }
            // removing from the vertices set
            nodeSet.remove(tempNode);
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

    public boolean addEdge(int nodeValue1, int nodeValue2, String direction) {
        GraphNode nodeForValue1 = doWeHaveNodeForValuethenGiveNode(nodeValue1);
        GraphNode nodeForValue2 = doWeHaveNodeForValuethenGiveNode(nodeValue2);
        if ((nodeForValue1 != null) && (nodeForValue2 != null)) {
            if (direction == "bi") {
                nodeForValue1.edges.add(nodeForValue2);
                nodeForValue2.edges.add(nodeForValue1);
                return true;
            }
            if (direction == "one") {
                nodeForValue1.edges.add(nodeForValue2);
                return true;
            }
            if (direction == "two") {
                nodeForValue2.edges.add(nodeForValue1);
                return true;
            }
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

    public boolean removeEdge(int nodeValue1, int nodeValue2, String direction) {
        GraphNode nodeForValue1 = doWeHaveNodeForValuethenGiveNode(nodeValue1);
        GraphNode nodeForValue2 = doWeHaveNodeForValuethenGiveNode(nodeValue2);
        if ((nodeForValue1 != null) && (nodeForValue2 != null)) {
            if (direction == "bi") {
                nodeForValue1.edges.remove(nodeForValue2);
                nodeForValue2.edges.remove(nodeForValue1);
                return true;
            }
            if (direction == "one") {
                nodeForValue1.edges.remove(nodeForValue2);
                return true;
            }
            if (direction == "two") {
                nodeForValue2.edges.remove(nodeForValue1);
                return true;
            }
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
