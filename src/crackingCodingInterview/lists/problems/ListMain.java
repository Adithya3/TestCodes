package crackingCodingInterview.lists.problems;

import crackingCodingInterview.lists.starter.LinkedListSetUP;
import crackingCodingInterview.lists.starter.SingleLinkedListNode;

public class ListMain {
    public static void main(String[] args) {
        SingleLinkedListNode start = LinkedListSetUP.createSingleLinkedList(new int[]{1, 2, 3, 3, 4, 5, 6, 7, 7, 7, 5});
        RemoveDuplicated.solution1(start);
        LinkedListSetUP.PrintSingleListValues(start);
    }
}
