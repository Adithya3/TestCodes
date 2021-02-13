package firstTry.crackingCodingInterview.lists.problems;

import firstTry.crackingCodingInterview.lists.starter.SingleLinkedListNode;

public class NthFromLast {
    public static int solution(SingleLinkedListNode start, int n) {
        SingleLinkedListNode forwardLookingPointer = start, followingPointer = start;
        int count = 0;
        try {
            while (count < n) {
                forwardLookingPointer = forwardLookingPointer.next;
                count++;
            }
        } catch (NullPointerException e) {
            return -1;
        }
        while (forwardLookingPointer != null) {
            forwardLookingPointer = forwardLookingPointer.next;
            followingPointer = followingPointer.next;
        }
        return followingPointer.value;
    }
}
