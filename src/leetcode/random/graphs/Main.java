package leetcode.random.graphs;

public class Main {
    public static void main(String[] args) {
//        Set<GraphNode> newGraphSet=new HashSet<>();
//        GraphNode one=new GraphNode(1);
//        GraphNode two=new GraphNode(2);
//        GraphNode three=new GraphNode(3);
//        GraphNode four=new GraphNode(4);
//        one.edges.add(two);
//        one.edges.add(four);
//        two.edges.add(three);
//        two.edges.add(one);
//        three.edges.add(four);
//        three.edges.add(two);
//        four.edges.add(one);
//        four.edges.add(three);
//        DumpAGraphFromNode.dumpGraph(new CloneGraph().cloneGraph(one));

//        System.out.println(Integer.toBinaryString(19));
//        System.out.println();
        int N=9;
//        2-Codility
//        3-Test
//        5-Coders
        for(int i=1;i<=N;i++){
            if((i%2==0)&&(i%3==0)&&(i%5==0)){
                System.out.println("CodilityTestCoders");
            }
            else if ((i%2==0)&&(i%3==0)){
                System.out.println("CodilityTest");
            }
            else if ((i%3==0)&&(i%5==0)){
                System.out.println("TestCoders");
            }
            else if ((i%2==0)&&(i%5==0)){
                System.out.println("CodilityCoders");
            }
            else if ((i%2==0)){
                System.out.println("Codility");
            }
            else if ((i%3==0)){
                System.out.println("Test");
            }
            else if ((i%5==0)){
                System.out.println("Coders");
            }else {
                System.out.println(i);
            }
        }

    }
}
