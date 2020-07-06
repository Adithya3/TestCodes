package crackingCodingInterview.graphtrees.graph;

import java.util.LinkedList;
import java.util.List;

public class GraphNode {
    private char value;
    private List<GraphNode> connectedNodes=new LinkedList<>();

    public List<GraphNode> getConnectedNodes() {
        return connectedNodes;
    }

    public GraphNode() {
    }

    public GraphNode(char value) {
        this.value = value;
    }

    public char getValue() {
        return value;
    }

    public void addConnection(GraphNode node) {
        connectedNodes.add(node);
    }

    public void removeConnection(GraphNode node) {
        connectedNodes.remove(node);
    }


}
