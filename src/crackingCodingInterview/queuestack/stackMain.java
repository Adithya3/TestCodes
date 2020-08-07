package crackingCodingInterview.queuestack;

import java.util.Arrays;

public class stackMain {
    public static void main(String[] args) {
        CircularQueue cq = new CircularQueue(3);
        cq.push(9);
        cq.push(7);
        cq.push(3);
        System.out.println(cq.pop());
        System.out.println(cq.pop());
        cq.push(8);
        cq.push(6);
        System.out.println(cq.pop());
        System.out.println(Arrays.toString(cq.getQueue()));
    }
}
