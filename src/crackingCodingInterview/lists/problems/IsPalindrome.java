package crackingCodingInterview.lists.problems;

import crackingCodingInterview.lists.starter.SingleLinkedListNode;

public class IsPalindrome {
    public static boolean solution(SingleLinkedListNode start) {
        SingleLinkedListNode reversedStart = ReverseSinglyLinkedList.solution0(start);
        while (start != null) {
            if (start.value != reversedStart.value) {
                return false;
            }
            start = start.next;
            reversedStart = reversedStart.next;
        }
        return true;
    }
}
