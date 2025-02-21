
public class ArrayQueue2<T> {

    static final int MAX_SIZE = 5;
    int rear;
    T[] arr;

    ArrayQueue2() {
        rear = -1;
        arr = (T[]) new Object[MAX_SIZE];
    }

    public void enqueue(T val) { // O(1)
        if (rear == MAX_SIZE - 1) {
            throw new IndexOutOfBoundsException("Queue is full");
        }
        arr[++rear] = val;
    }

    public T dequeue() { // O(n)
        if (rear == -1)
            throw new IndexOutOfBoundsException("Queue is empty");
        T temp = arr[0];
        for(int i = 1; i <= rear; i++)
            arr[i-1] = arr[i];
        rear--;
        return temp;
    }

    public boolean isEmpty() {
        return rear == -1;
    }
}
