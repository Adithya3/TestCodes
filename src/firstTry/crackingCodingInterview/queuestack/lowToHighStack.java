package firstTry.crackingCodingInterview.queuestack;

import java.util.Stack;

public class lowToHighStack {
    private Stack<Integer> compareStack = new Stack<>();
    private Stack<Integer> exposeStack = new Stack<>();

    public boolean push(int value) {
        exposeStack.push(value);
        return true;
    }

    public int pop() {
        return exposeStack.pop();
    }

    public boolean isEmpty() {
        return exposeStack.isEmpty();
    }

    public void restack() {
        int currentValue;
        compareStack.push(exposeStack.pop());
        while (!exposeStack.isEmpty()) {
            currentValue = exposeStack.pop();
            while ((!compareStack.isEmpty()) && currentValue > compareStack.peek()) {
                exposeStack.push(compareStack.pop());
            }
            compareStack.push(currentValue);
        }
        while (!compareStack.isEmpty()) {
            exposeStack.push(compareStack.pop());
        }
    }
}
