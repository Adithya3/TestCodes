package crackingCodingInterview.lists.starter;

public class DoubleLinkedListNode {
    public int value;
    public DoubleLinkedListNode next;
    public DoubleLinkedListNode prev;

    public DoubleLinkedListNode(int value) {
        this.value = value;
    }

    public DoubleLinkedListNode(int value, DoubleLinkedListNode next, DoubleLinkedListNode prev) {
        this.value = value;
        this.next = next;
        this.prev = prev;
    }
}
