package Structures.graph;

//limitations of this graph
//1)Every node should have a unique value i.e no two nodes will have the same value
//2)Adding a edge is always bi directional or only has undirectional edges.

public interface Graph {
    public GraphNode addNode(int nodeValue);

    public boolean removeNode(int nodeValue);

    public boolean addEdge(int nodeValue1, int nodeValue2);

    public boolean removeEdge(int nodeValue1, int nodeValue2);

    public void dumpGraph();
}
