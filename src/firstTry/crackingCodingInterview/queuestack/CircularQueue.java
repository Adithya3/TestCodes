package firstTry.crackingCodingInterview.queuestack;

public class CircularQueue {
    private int[] queue;
    private int front = -1;
    private int rear = -1;

    CircularQueue(int size) {
        this.queue = new int[size];
    }

    public int[] getQueue() {
        return queue;
    }

    public boolean push(int value) {
        if (front == -1 && rear == -1) {
            queue[0] = value;
            front = 0;
            rear = 0;
        } else if ((rear + 1) == queue.length || (rear + 1) == front) {
            return false;
        } else {
            rear++;
            queue[rear] = value;
        }
        return true;
    }

    public int pop() {
        int returnValue = Integer.MIN_VALUE;
        if (front == -1 && rear == -1) {
            return returnValue;
        } else if (front == rear) {
            return returnValue;
        } else {
            returnValue = this.queue[front];
            front++;
            return returnValue;
        }
    }
}
