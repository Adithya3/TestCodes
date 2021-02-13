package firstTry.Structures.heap;

import java.util.Arrays;

public class BinaryMinHeap {
    public int size, capacity=10;
    public int[] heapArray;

    public BinaryMinHeap() {
        heapArray = new int[capacity];
        size=-1;
    }

    //checking if a point exist in the heap
    private boolean parentExist(int index) {
        if (index >= 0) {
            if ((index - 1) / 2 >= 0) return true;
            else return false;
        } else return false;
    }

    private boolean leftChildExit(int index) {
        if (index >= 0) {
            if (2 * index + 1 > size) return false;
            else return true;
        } else return false;
    }

    private boolean rightChildExit(int index) {
        if (index >= 0) {
            if (2 * index + 2 > size) return false;
            else return true;
        } else return false;
    }

    //getting the index of left right and parents;
    private int parentIndex(int index) {
        if (parentExist(index)) {
            return (index - 1) / 2;
        } else return -99;
    }

    private int leftIndex(int index) {
        if (leftChildExit(index)) {
            return index * 2 + 1;
        } else return -99;
    }

    private int rightIndex(int index) {
        if (rightChildExit(index)) {
            return index * 2 + 2;
        } else return -99;
    }

    //getting the actual value
    private int parentValue(int index) {
        if (parentExist(index)) {
            return heapArray[parentIndex(index)];
        } else return -99;
    }

    private int leftValue(int index) {
        if (leftChildExit(index)) {
            return heapArray[leftIndex(index)];
        } else return -99;
    }

    private int rightValue(int index) {
        if (rightChildExit(index)) {
            return heapArray[rightIndex(index)];
        } else return -99;
    }

    private void swap(int index0, int index1) {
        int temp;
        temp = heapArray[index0];
        heapArray[index0] = heapArray[index1];
        heapArray[index1] = temp;
    }

    private void heapityDown() {
        int index = 0, smallerChildIndex;
        while (leftChildExit(index)){
            smallerChildIndex=leftIndex(index);
            if (rightChildExit(index) && (rightValue(index)<leftValue(index))){
                smallerChildIndex=rightIndex(index);
            }
            swap(index,smallerChildIndex);
            index=smallerChildIndex;
        }
    }

    private void heapifyUp(){
        int index=size;
        while (parentExist(index) && parentValue(index)>heapArray[index]){
            swap(index,parentIndex(index));
            index=parentIndex(index);
        }
    }

    public int peek() {
        if (size > 0) {
            return heapArray[0];
        } else return -99;
    }

    public int pop() {
        int returnValue;
        if (size >= 0) {
            returnValue = heapArray[0];
            heapArray[0] = 0;
            swap(0, size);
            size--;
            heapityDown();
            return returnValue;
        } else throw new IllegalStateException();
    }

    private void increaseCapasityIfNeeded(){
        if (this.size+1>=this.capacity){
            heapArray= Arrays.copyOf(heapArray,capacity*2);
            capacity=capacity*2;
        }
    }

    public void insert(int value){
        increaseCapasityIfNeeded();
        heapArray[size+1]=value;
        size++;
        heapifyUp();
    }
}
