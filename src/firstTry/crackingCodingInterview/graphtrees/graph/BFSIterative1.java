package firstTry.crackingCodingInterview.graphtrees.graph;

import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

public class BFSIterative1 {
    List<GraphNode> visited = new LinkedList<>();
    Queue<GraphNode> queue = new LinkedList<>();

    public boolean search(GraphNode find, GraphNode base) {
        this.queue.add(base);
        while (!queue.isEmpty()) {
            visited.add(base);
            if (find == base) {
                return true;
            }
            for (GraphNode node : base.getConnectedNodes()) {
                if (!visited.contains(node)) {
                    queue.add(node);
                }
            }
            base = queue.remove();
        }
        return false;
    }
}
