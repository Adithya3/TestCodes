package crackingCodingInterview.graphtrees.graph;

import java.util.LinkedList;
import java.util.List;

public class DFS {
    List<GraphNode> visited = new LinkedList<>();

    public boolean doesThisnodeExist(GraphNode find, GraphNode base) {
        if (base == find) {
            return true;
        }
        for (GraphNode node : base.getConnectedNodes()) {
            if (!visited.contains(node)) {
                visited.add(node);
                if (doesThisnodeExist(find, node)) {
                    return true;
                }
            }
            ;
        }
        return false;
    }
}
