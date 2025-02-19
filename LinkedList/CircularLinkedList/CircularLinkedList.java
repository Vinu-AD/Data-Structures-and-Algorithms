
import java.util.Iterator;
import java.util.NoSuchElementException;

public class CircularLinkedList<T> implements Iterable<T> {

    Node last;
    int size;
    class Node {

        T data;
        Node next;

        Node(T val) {
            data = val;
            next = null;
        }
    }

    CircularLinkedList() {
        last = null;
        size = 0;
    }

    @SuppressWarnings("unused")
    CircularLinkedList(T val) {
        last = new Node(val);
        last.next = last;
        size = 1;
    }

    public void add(T val) {
        size++;
        Node newNode = new Node(val);
        if (last == null) {
            last = newNode;
            last.next = newNode;
            return;
        }
        newNode.next = last.next;
        last.next = newNode;
        last = newNode;
    }

    public void insertAtBeginning(T val) {
        size++;
        Node newNode = new Node(val);
        if (last == null) {
            newNode.next = newNode;
            last = newNode;
            return;
        }
        newNode.next = last.next;
        last.next = newNode;
    }

    public void insertAtEnd(T val) {
        add(val);
    }

    public T deleteAtBeginning() {
        if (last == null) {
            throw new NoSuchElementException("List is empty");
        }
        size--;
        T deleted = last.next.data;
        if (last.next == last) {
            last = null;
            return deleted;
        }
        last.next = last.next.next;
        return deleted;
    }

    public T deleteAtEnd() {
        if (last == null) {
            throw new NoSuchElementException("List is empty");
        }
        size--;
        T deleted = last.data;
        if (last.next == last) {
            last = null;
            return deleted;
        }
        Node temp = last.next;
        while (temp.next != last) {
            temp = temp.next;
        }
        temp.next = last.next;
        last = temp;
        return deleted;
    }

    public void deleteVal(T val) {
        Node temp = last.next;
        Node prev = last;
        boolean deleted = false;
        do { 
            if(temp.data == val) {
                prev.next = temp.next;
                deleted = true;
                size--;
                break;
            }
            prev = temp;
            temp = temp.next;
        } while (temp != last.next);
        if(!deleted) throw new NoSuchElementException("Value " + val + " is not present in the list");
    }

    public void insertAfter(T reference, T val) {
        if(last == null) 
            throw new NoSuchElementException("List is empty");
        Node newNode = new Node(val);
        Node temp = last.next;
        boolean found = false;
        do { 
            if(temp.data == reference) {
                newNode.next = temp.next;
                temp.next = newNode;
                size++;
                found = true;
                break;
            }
            temp = temp.next;
        } while (temp != last.next);
        if(!found) 
            throw new NoSuchElementException("Give value " + reference + " is not present in the list");
    }

    public int size() {
        return size;
    }

    public void update(T reference, T target) {
        if (last == null) {
            throw new NoSuchElementException("List is empty");
        }
        Node temp = last.next;
        do {
            if (temp.data == reference) {
                temp.data = target;
                return;
            }
            temp = temp.next;
        } while (temp != last.next);
        throw new NoSuchElementException("The give value " + reference + " is not found in the list");
    }

    public boolean contains(T val) {
        if (last == null) {
            throw new NoSuchElementException("List is empty");
        }
        Node temp = last.next;
        do {
            if (val == temp.data) {
                return true;
            }
            temp = temp.next;
        } while (temp != last.next);
        return false;
    }

    public void display() {
        if (last == null) {
            throw new NoSuchElementException("List is empty");
        }
        Node temp = last.next;
        do {
            System.out.print(temp.data + " ");
            temp = temp.next;
        } while (temp != last.next);
    }

    @Override
    public Iterator<T> iterator() {
        return new Iterator<T>() {
            Node temp = last != null ? last.next : null;
            boolean firstIteration = true;

            @Override
            public boolean hasNext() {
                if(temp == null) return false;
                return firstIteration || temp != last.next;
            }

            @Override
            public T next() {
                if(!hasNext()) 
                    throw new NoSuchElementException();
                T res = temp.data;
                temp = temp.next;
                firstIteration = false;
                return res;
            }
        };
    }
}
