package crackingCodingInterview.queuestack;

import crackingCodingInterview.queuestack.loweststack.LowestStack1;

public class stackMain {
    public static void main(String[] args) {
        LowestStack1 ateststack=new LowestStack1();
        ateststack.push(8);
        ateststack.push(3);
        ateststack.push(5);
        ateststack.push(99);
        ateststack.push(4);
        ateststack.push(2);
        ateststack.push(56);
        ateststack.pop();
        ateststack.pop();
        System.out.println(ateststack.getLow());
    }
}
