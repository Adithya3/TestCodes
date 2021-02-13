package firstTry.crackingCodingInterview.queuestack.loweststack;

public class LowestStack1 {
    int size = 10, currentIndex = -1;
    LowestStackNode[] stackArray = new LowestStackNode[10];

    private void doubleTheSize() {
        if (currentIndex + 2 >= size) {
            LowestStackNode[] newStack;
            size = size * 2;
            newStack = new LowestStackNode[size];
            for (int i = 0; i <= currentIndex; i++) {
                newStack[i] = stackArray[i];
            }
            stackArray = newStack;
        }
    }

    private LowestStackNode peek() {
        return stackArray[currentIndex];
    }

    public int getLow() {
        return peek().currentLow;
    }

    public int pop() {
        int returnValue;
        returnValue = stackArray[currentIndex].value;
        currentIndex--;
        return returnValue;
    }

    public boolean push(int value) {
        LowestStackNode tempNode;
        int currentLow;
        if (currentIndex == -1) {
            currentLow = Integer.MAX_VALUE;
        } else {
            currentLow = peek().currentLow;
        }
        if (value < currentLow) {
            tempNode = new LowestStackNode(value, value);
        } else {
            tempNode = new LowestStackNode(value, currentLow);
        }
        currentIndex++;
        doubleTheSize();
        stackArray[currentIndex] = tempNode;
        return true;
    }

}
