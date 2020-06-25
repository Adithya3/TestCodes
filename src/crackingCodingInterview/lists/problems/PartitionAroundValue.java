package crackingCodingInterview.lists.problems;

import crackingCodingInterview.lists.starter.SingleLinkedListNode;

public class PartitionAroundValue {
    public static SingleLinkedListNode solution0(SingleLinkedListNode start, int value) {
        SingleLinkedListNode beforeValuePointer = null, afterValuePointer = null, afterValueStart = null, beforeValueStart = null, orginalPointer = start;
        while (orginalPointer != null) {
            if (orginalPointer.value < value) {
                if (beforeValueStart == null) {
                    beforeValueStart = new SingleLinkedListNode(orginalPointer.value);
                    beforeValuePointer = beforeValueStart;
                } else {
                    beforeValuePointer.next = new SingleLinkedListNode(orginalPointer.value);
                    beforeValuePointer = beforeValuePointer.next;
                }
            } else {
                if (afterValueStart == null) {
                    afterValueStart = new SingleLinkedListNode(orginalPointer.value);
                    afterValuePointer = afterValueStart;
                } else {
                    afterValuePointer.next = new SingleLinkedListNode(orginalPointer.value);
                    afterValuePointer = afterValuePointer.next;
                }
            }
            orginalPointer = orginalPointer.next;
        }
        beforeValuePointer.next = afterValueStart;
        return beforeValueStart;
    }
}
