package crackingCodingInterview.queuestack;

import java.util.Stack;

public class QueueByStack {
    private Stack<Integer> pushStack = new Stack<>();
    private Stack<Integer> popStack = new Stack<>();

    private void setPopStack() {
        while (!pushStack.isEmpty()) {
            popStack.push(pushStack.pop());
        }
    }

    public boolean push(int value) {
        pushStack.push(value);
        return true;
    }

    public int pop() {
        if (popStack.isEmpty()) {
            setPopStack();
        }
        return popStack.pop();
    }

}
