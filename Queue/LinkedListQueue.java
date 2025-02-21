
public class LinkedListQueue<T> {
    class Node {
        T data;
        Node next;

        Node(T val) {
            data = val;
            next = null;
        }
    }

    Node front, rear;

    @SuppressWarnings("unused")
    LinkedListQueue() {
        rear = null;
        front = null;
    }

    @SuppressWarnings("unused")
    LinkedListQueue(T val) {
        front = new Node(val);
        rear = front;
    }

    public void enqueue(T val) {
        Node newNode = new Node(val);
        if(front == null)
            front = newNode;
        else 
            rear.next = newNode;
        rear = newNode;
    }

    public T dequeue() {
        if(front == null)
            throw new IndexOutOfBoundsException("Queue is empty");
        T deleted = front.data;
        front = front.next;
        if(front == null)
            rear = null;    
        return deleted;
    }

    public boolean isEmpty() {  
        return front == null;
    }

    public T elementAtFront() {
        if(front == null)
            throw new IndexOutOfBoundsException("Queue is empty");
        return front.data;
    }

    public T elementAtEnd() {
        if (rear == null) {
            throw new IndexOutOfBoundsException("Queue is empty");
        }
        return rear.data;
    }
}