package crackingCodingInterview.queuestack;

import java.util.LinkedList;
import java.util.List;

public class SetOfStacks {
    private int stackSize;
    private int currentArray = 0;
    private int currentIndex = -1;
    private List<int[]> listOfStacks = new LinkedList<>();

    SetOfStacks(int stackSize) {
        this.stackSize=stackSize;
        listOfStacks.add(new int[stackSize]);
    }

    private void addStackArray() {
        currentArray++;
        listOfStacks.add(currentArray, new int[stackSize]);
    }

    private void checkStackSize() {
        if (currentIndex >= (stackSize - 1)) {
            currentIndex = -1;
            addStackArray();
        } else if (currentIndex <= -1) {
            if (currentArray != 0) {
                currentIndex = stackSize - 1;
                currentArray--;
            }
        }
    }

    public boolean push(int value) {
        checkStackSize();
        currentIndex++;
        listOfStacks.get(currentArray)[currentIndex] = value;
        return true;
    }

    public int pop() {
        int returnValue;
        checkStackSize();
        returnValue = listOfStacks.get(currentArray)[currentIndex];
        currentIndex--;
        return returnValue;
    }
}
