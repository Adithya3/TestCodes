package crackingCodingInterview.lists.problems;

import crackingCodingInterview.lists.starter.SingleLinkedListNode;

import java.util.HashMap;

public class RemoveDuplicated {

    public static void solution0(SingleLinkedListNode start) {
        SingleLinkedListNode current = start, prev = null;
        HashMap<Integer, SingleLinkedListNode> nonDuplicatedMap = new HashMap<>();
        while (current != null) {
            if (nonDuplicatedMap.get(current.value) == null) {
                nonDuplicatedMap.put(current.value, current);
                prev = current;
            }else {
                prev.next=current.next;
            }
            current = current.next;

        }
    }

    public static void solution1(SingleLinkedListNode start){
        SingleLinkedListNode currenti=start,currentj=start;
        while (currenti!=null){
            while (currentj.next!=null){
                if (currenti.value==currentj.next.value){
                    currentj.next=currentj.next.next;
                }else {
                    currentj=currentj.next;
                }

            }
            currenti=currenti.next;
            currentj=currenti;
        }
    }
}
