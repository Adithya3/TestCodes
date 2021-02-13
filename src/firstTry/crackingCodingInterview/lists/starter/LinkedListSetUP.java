package firstTry.crackingCodingInterview.lists.starter;

public class LinkedListSetUP {

    //below are for single linked list
    public static SingleLinkedListNode createSingleLinkedList(int[] valuesArray) {
        SingleLinkedListNode start = new SingleLinkedListNode(valuesArray[0]), current;
        current = start;
        for (int i = 1; i < valuesArray.length; i++) {
            current.next = new SingleLinkedListNode(valuesArray[i]);
            current = current.next;
        }
        return start;
    }

    public static void PrintSingleListValues(SingleLinkedListNode start) {
        SingleLinkedListNode current = start;
        while (current != null) {
            System.out.println(current.value);
            current=current.next;
        }
    }


}
