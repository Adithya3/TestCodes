package crackingCodingInterview.lists.problems;

import crackingCodingInterview.lists.starter.SingleLinkedListNode;

public class PartitionAroundValue {
    public static SingleLinkedListNode solution0(SingleLinkedListNode start, int value) {
        SingleLinkedListNode belowValue = null, current = start,temp;
        while (current != null) {
            if (current.value < value) {
                if (belowValue == null) {
                    belowValue = new SingleLinkedListNode(current.value);
                } else {
                    belowValue.next = new SingleLinkedListNode(current.value);
                }
            }
            temp=current;
            current=current.next;
            temp.next=null;
        }
        return belowValue;
    }
}
