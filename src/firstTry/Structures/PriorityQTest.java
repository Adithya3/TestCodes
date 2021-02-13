package firstTry.Structures;

import java.util.Comparator;
import java.util.PriorityQueue;

public class PriorityQTest {
    public static void main(String[] args) {
        PriorityQueue<ValueNameNode> aPriorityQueue = new PriorityQueue<ValueNameNode>(new Comparator<ValueNameNode>() {
            @Override
            public int compare(ValueNameNode o1, ValueNameNode o2) {
                if (o1.value < o2.value) {
                    return 1;
                } else if (o1.value > o2.value) {
                    return -1;
                } else {
                    return 0;
                }
            }
        });
//        ValueNameNode tempValueName = new ValueNameNode();
        aPriorityQueue.add(new ValueNameNode("adithya", 66));
        aPriorityQueue.add(new ValueNameNode("harsha", 2));
        aPriorityQueue.add(new ValueNameNode("bursha", 55));
        aPriorityQueue.add(new ValueNameNode("nursa", 8));
        aPriorityQueue.add(new ValueNameNode("dontknow", 77));
//        tempValueName=aPriorityQueue.poll();
        System.out.println(aPriorityQueue.poll().name);
        System.out.println(aPriorityQueue.poll().name);
        System.out.println(aPriorityQueue.poll().name);
        System.out.println(aPriorityQueue.poll().name);
        System.out.println(aPriorityQueue.poll().name);
    }
}
