


public class LinkedListStack<T> {
    class Node {
        T data;
        Node next;

        Node(T val) {
            data = val;
            next = null;
        }
    }

    Node top;

    @SuppressWarnings("unused")
    LinkedListStack() {
        top = null;
    }
    @SuppressWarnings("unused")
    LinkedListStack(T val) {
        top = new Node(val);
    }

    public void push(T val) {
        Node newNode = new Node(val);
        newNode.next = top;
        top = newNode;
    }

    public T pop() {
        if(top == null) 
            throw new IndexOutOfBoundsException("Stack Underflow");
        T deleted = top.data;
        top = top.next;
        return deleted;
    }

    public T peek() {
        return top.data;
    }

    public boolean isEmpty() {
        return top == null;
    }
}