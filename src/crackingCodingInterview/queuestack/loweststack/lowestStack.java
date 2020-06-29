package crackingCodingInterview.queuestack.loweststack;

public class lowestStack {
    private int low = Integer.MAX_VALUE, size = 10;
    private int[] stackArray = new int[size];
    private int currentIndex = -1;

    private void doubleTheSize() {
        if (currentIndex + 2 >= size) {
            int[] newStack;
            size = size * 2;
            newStack = new int[size];
            for (int i = 0; i <= currentIndex; i++) {
                newStack[i] = stackArray[i];
            }
            stackArray = newStack;
        }
    }

    private void setLow() {
        int tempLow = Integer.MAX_VALUE;
        for (int i = 0; i <= currentIndex; i++) {
            if (tempLow > stackArray[i]) {
                tempLow = stackArray[i];
            }
        }
        low = tempLow;
    }

    public int getLow() {
        return low;
    }

    public int peek() {
        return stackArray[currentIndex];
    }

    public int pop() {
        int returnValue;
        returnValue = stackArray[currentIndex];
        currentIndex--;
        if (returnValue <= low) {
            setLow();
        }
        return returnValue;
    }

    public boolean push(int value) {
        if (low > value) {
            low = value;
        }
        currentIndex++;
        doubleTheSize();
        stackArray[currentIndex] = value;
        return true;
    }


}
