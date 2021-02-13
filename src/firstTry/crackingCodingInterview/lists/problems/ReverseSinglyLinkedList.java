package firstTry.crackingCodingInterview.lists.problems;

import firstTry.crackingCodingInterview.lists.starter.SingleLinkedListNode;

public class ReverseSinglyLinkedList {
    //creating a new linked list
    public static SingleLinkedListNode solution0(SingleLinkedListNode start) {
        SingleLinkedListNode reversePointer = null, pointer = start, temp;
        while (pointer != null) {
            if (reversePointer == null) {
                reversePointer = new SingleLinkedListNode(pointer.value);
            } else {
                temp = new SingleLinkedListNode(pointer.value);
                temp.next = reversePointer;
                reversePointer = temp;
            }
            pointer = pointer.next;
        }
        return reversePointer;
    }

    //reversing the same linked list
    public static void solution1(SingleLinkedListNode start) {
        //base case
        if (start == null || start.next == null) {
            return;
        }
        SingleLinkedListNode firstPointer = null, secondPointer = start, thirdPointer = start.next;
        while (thirdPointer != null) {
            secondPointer.next = firstPointer;
            firstPointer = secondPointer;
            secondPointer = thirdPointer;
            thirdPointer = thirdPointer.next;
        }
    }
}
