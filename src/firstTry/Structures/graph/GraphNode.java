package firstTry.Structures.graph;

import java.util.ArrayList;
import java.util.List;

public class GraphNode {
    public int value;
    public List<GraphNode> edges = new ArrayList<GraphNode>();

    public GraphNode(int value) {
        this.value = value;
    }

    public GraphNode(int value, List<GraphNode> edges) {
        this.value = value;
        this.edges = edges;
    }
}
