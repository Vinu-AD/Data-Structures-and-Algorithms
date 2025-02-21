
public class ArrayQueue<T> {
    static final int MAX_SIZE = 5;
    int rear;
    int front;
    T[] arr;

    ArrayQueue() {
        front = -1;
        rear = -1;
        arr = (T[]) new Object[MAX_SIZE];
    }

    public void enqueue(T val) { // O(1)
        if(rear == MAX_SIZE - 1)
            throw new IndexOutOfBoundsException("Queue is full");
        if(front == -1)
            front++;
        arr[++rear] = val;
    }

    public T dequeue() { // O(1)
        if(front == -1 || front > rear)
            throw new IndexOutOfBoundsException("Queue is empty");
        return arr[front++];
    }

    public boolean isEmpty() {
        return rear == -1 || front > rear;
    }
}