package crackingCodingInterview.graphtrees.graph;

import java.util.LinkedList;
import java.util.List;
import java.util.Stack;

public class DFSIterative1 {
    List<GraphNode> visited = new LinkedList<>();
    Stack<GraphNode> stack = new Stack<>();

    public boolean search(GraphNode find, GraphNode base) {
        this.stack.push(base);
        while (!stack.isEmpty()) {
            visited.add(base);
            if (find == base) {
                return true;
            }
            for (GraphNode node : base.getConnectedNodes()) {
                if (!visited.contains(node)) {
                    stack.push(node);
                }
            }
            base = stack.pop();
        }
        return false;
    }
}
