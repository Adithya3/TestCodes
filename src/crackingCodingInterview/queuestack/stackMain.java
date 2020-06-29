package crackingCodingInterview.queuestack;

public class stackMain {
    public static void main(String[] args) {
        QueueByStack ateststack = new QueueByStack();
        ateststack.push(8);
        ateststack.push(3);
        ateststack.push(5);
        ateststack.push(99);
        ateststack.push(4);
        ateststack.push(2);
        ateststack.push(56);
        ateststack.push(66);
        ateststack.push(81);
        ateststack.push(6);
        System.out.println(ateststack.pop());
        System.out.println(ateststack.pop());
        System.out.println(ateststack.pop());
        System.out.println(ateststack.pop());
        System.out.println(ateststack.pop());
        System.out.println(ateststack.pop());
        System.out.println(ateststack.pop());
    }
}
