
import java.util.NoSuchElementException;
import java.util.Iterator;

public class ArrayStack<T> implements Iterable{
    static final int MAX_SIZE = 10;
    int top;
    T[] arr;

    @SuppressWarnings("unused")
    ArrayStack() {
        arr = (T[]) new Object[MAX_SIZE];
        top = -1;
    }

    @SuppressWarnings("unused")
    ArrayStack(T val) {
        arr = (T[]) new Object[MAX_SIZE];
        arr[0] = val;
        top = 0;
    }

    public void push(T val) {
        if(top == MAX_SIZE - 1) 
            throw new IndexOutOfBoundsException("Stack Overflow");
        arr[++top] = val;
    }

    public T pop() {
        if(top == -1) 
            throw new NoSuchElementException("Stack Underflow");
        return arr[top--];
    }
    
    public T peek() {
        if(top == -1)
            throw new NoSuchElementException("Stack Underflow");
        return arr[top];
    }

    public boolean isEmpty() {
        return top == -1;
    }

    public int size() {
        return top + 1;
    }

    @Override
    public Iterator<T> iterator() {
        return new Iterator<T>() {
            int ind = 0;
            @Override
            public boolean hasNext() {
                return ind <= top;
            }
            @Override
            public T next() {
                return arr[ind++];
            }
        };
    }
}