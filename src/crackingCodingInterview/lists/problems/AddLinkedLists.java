package crackingCodingInterview.lists.problems;

import crackingCodingInterview.lists.starter.SingleLinkedListNode;


public class AddLinkedLists {

//    private static HashMap<String, Integer> getCarrySum(int a, int b) {
//        int sum = a + b;
//        HashMap<String, Integer> returnHashMap = new HashMap<>();
//        if (sum / 10 == 0) {
//            returnHashMap.put("carry", 0);
//            returnHashMap.put("value", sum);
//        } else {
//            returnHashMap.put("carry", sum / 10);
//            returnHashMap.put("value", sum % 10);
//        }
//        return returnHashMap;
//    }

    public static int listToNumber(SingleLinkedListNode start) {
        SingleLinkedListNode current = start;
        int returnValue = 0, place = 0;
        while (current != null) {
            returnValue = (int) (returnValue + (current.value * Math.pow(10, place)));
            current = current.next;
            place++;
        }
        return returnValue;
    }

    public static SingleLinkedListNode numberToList(int value) {
        SingleLinkedListNode start = null, pointer = null;
        while (value != 0) {
            if (start == null) {
                start = new SingleLinkedListNode(value % 10);
                pointer = start;
            } else {
                pointer.next = new SingleLinkedListNode(value % 10);
                pointer = pointer.next;
            }
            value = value / 10;
        }
        return start;
    }

    public static SingleLinkedListNode solution0(SingleLinkedListNode a, SingleLinkedListNode b) {
        return numberToList(listToNumber(a) + listToNumber(b));
    }

    public static SingleLinkedListNode solution1(SingleLinkedListNode aStart, SingleLinkedListNode bStart) {
        SingleLinkedListNode a = aStart, b = bStart, sumStart = null, sumPointer = null;
        int carry = 0, sum = 0, currentSumValue;
        //equalize the lengths.
        while (a.next != null || b.next != null) {
            if (a.next != null && b.next != null) {
                ;
            } else if (a.next == null && b.next != null) {
                a.next = new SingleLinkedListNode(0);
            } else if (a.next != null && b.next == null) {
                b.next = new SingleLinkedListNode(0);
            }
            a = a.next;
            b = b.next;
        }
        a = aStart;
        b = bStart;
        while (a != null) {
            sum = a.value + b.value + carry;
            carry = sum / 10;
            currentSumValue = sum % 10;
            if (sumStart == null) {
                sumStart = new SingleLinkedListNode(currentSumValue);
                sumPointer = sumStart;
            } else {
                sumPointer.next = new SingleLinkedListNode(currentSumValue);
                sumPointer = sumPointer.next;
            }
            a = a.next;
            b = b.next;
        }
        return sumStart;
    }
}
