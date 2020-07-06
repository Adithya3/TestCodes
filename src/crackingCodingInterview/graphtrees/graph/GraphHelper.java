package crackingCodingInterview.graphtrees.graph;

import java.util.LinkedList;
import java.util.List;

public class GraphHelper {
    private List<GraphNode> nodes;

    public GraphHelper() {
        nodes = new LinkedList<>();
    }

    public void addNodes(GraphNode node1, GraphNode node2, boolean bi) {
        if (!this.nodes.contains(node1)) {
            this.nodes.add(node1);
        }
        if (!this.nodes.contains(node2)) {
            this.nodes.add(node2);
        }
        if (bi) {
            node1.addConnection(node2);
            node2.addConnection(node1);
        } else {
            node1.addConnection(node2);
        }
    }


}
