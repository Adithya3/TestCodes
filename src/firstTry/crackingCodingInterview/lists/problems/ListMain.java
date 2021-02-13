package firstTry.crackingCodingInterview.lists.problems;

import firstTry.crackingCodingInterview.lists.starter.LinkedListSetUP;
import firstTry.crackingCodingInterview.lists.starter.SingleLinkedListNode;

public class ListMain {
    public static void main(String[] args) {
        SingleLinkedListNode a = LinkedListSetUP.createSingleLinkedList(new int[]{3, 1});
        SingleLinkedListNode b = LinkedListSetUP.createSingleLinkedList(new int[]{7, 6, 7, 8, 9, 6, 7});
//        LinkedListSetUP.PrintSingleListValues(AddLinkedLists.solution1(a, b));
//        System.out.println(AddLinkedLists.ListToNumber(start));
//        LinkedListSetUP.PrintSingleListValues(AddLinkedLists.numberToList(234567));
//        System.out.println(AddLinkedLists.numberToList(234567));
//        LinkedListSetUP.PrintSingleListValues(b);
//        ReverseSinglyLinkedList.solution1(b);
//        LinkedListSetUP.PrintSingleListValues(b);
        System.out.println(IsPalindrome.solution(b));
    }
}
