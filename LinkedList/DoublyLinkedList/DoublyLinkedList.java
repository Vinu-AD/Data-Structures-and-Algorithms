
import java.util.NoSuchElementException;
import java.util.Iterator;

public class DoublyLinkedList<T> implements Iterable<T> {

    Node head;
    Node tail;

    class Node {

        T data;
        Node next;
        Node prev;

        Node(T val) {
            data = val;
            next = null;
            prev = null;
        }
    }

    DoublyLinkedList() {
        head = null;
        tail = null;
    }

    @SuppressWarnings("unused")
    DoublyLinkedList(T val) {
        head = new Node(val);
    }

    public void add(T val) {
        Node newNode = new Node(val);
        if (head == null) {
            head = newNode;
            tail = newNode;
            return;
        }
        Node temp = head;
        while (temp.next != null) {
            temp = temp.next;
        }
        newNode.prev = temp;
        temp.next = newNode;
        tail = newNode;
    }

    public void insertAtBeginning(T val) {
        Node newNode = new Node(val);
        if (head == null) {
            head = newNode;
            tail = newNode;
            return;
        }
        newNode.next = head;
        head.prev = newNode;
        head = newNode;
    }

    public void insertAtPos(int pos, T val) {
        if (pos == 0) {
            insertAtBeginning(val);
            return;
        }
        Node newNode = new Node(val);
        Node temp = head;
        for (int i = 1; i < pos; i++) {
            temp = temp.next;
            if(temp == null) 
                throw new IndexOutOfBoundsException("Invalid position" + pos);
        }
        newNode.next = temp.next;
        newNode.prev = temp;
        if(tail == temp) 
            tail = newNode;
        else
            temp.next.prev = newNode;
        temp.next = newNode;
    }
    
    public void insertAtEnd(T val) {
        add(val);
    }

    public T remove() {
        if (head == null) {
            throw new NoSuchElementException("List is empty");
        }
        T deleted;
        if (head == tail) {
            deleted = head.data;
            head = null;
            tail = null;
            return deleted;
        }
        Node temp = head.next;
        Node prev = head;
        while (temp.next != null) {
            prev = temp;
            temp = temp.next;
        }
        prev.next = null;
        tail = prev;
        return temp.data;
    }

    public T removeAtBeginning() {
        if (head == null) {
            throw new NoSuchElementException("List is empty");
        }
        T deleted = head.data;
        if(head == tail) {
            head = tail = null;
            return deleted;
        }
        head = head.next;
        head.prev = null;
        return deleted;
    }

    public T remove(T val) {
        if (head == null) {
            throw new NoSuchElementException("List is empty");
        }
        T deleted = head.data;
        if (head.data == val) {
            if (head == tail) {
                head = tail = null;
                return deleted;
            }
            head = head.next;
            head.prev = null;
            return deleted;
        }
        Node temp = head.next;
        Node prev = head;
        while (temp != null) {
            if (temp.data == val) {
                deleted = temp.data;
                prev.next = temp.next;
                if(temp == tail)
                    tail = prev;
                else 
                    temp.next.prev = prev;
                break;
            }
            prev = temp;
            temp = temp.next;
        }
        return deleted;
    }

    public void update(T reference, T target) {
        if (head == null) {
            throw new NoSuchElementException("List is empty");
        }
        Node temp = head;
        while (temp != null) {
            if (temp.data == reference) {
                temp.data = target;
                return;
            }
            temp = temp.next;
        }
        throw new NoSuchElementException("The give value " + reference + " is not found in the list");
    }

    public int search(T val) {
        int index = 0;
        if (head == null) {
            throw new NoSuchElementException("List is empty");
        }
        Node temp = head;
        while (temp != null) {
            if (temp.data == val) {
                return index;
            }
            index++;
            temp = temp.next;
        }
        return -1;
    }

    public T get(int ind) {
        if (head == null) {
            throw new NoSuchElementException("List is empty");
        }
        Node temp = head;
        int size = -1;
        for (int i = 0; i < ind; i++) {
            temp = temp.next;
            size++;
            if (temp == null) {
                throw new IndexOutOfBoundsException("Invalid index " + ind + " for length " + size);
            }
        }
        return temp.data;
    }

    public boolean contains(T val) {
        if (head == null) {
            throw new NoSuchElementException("List is empty");
        }
        Node temp = head;
        while (temp != null) {
            if (val == temp.data) {
                return true;
            }
            temp = temp.next;
        }
        return false;
    }

    public void display() {
        if (head == null) {
            throw new NoSuchElementException("List is empty");
        }
        Node temp = head;
        while (temp != null) {
            System.out.print(temp.data + " ");
            temp = temp.next;
        }
    }

    public void revDisplay() {
        if (head == null) {
            throw new NoSuchElementException("List is empty");
        }
        Node temp = tail;
        while (temp != null) {
            System.out.print(temp.data + " ");
            temp = temp.prev;
        }
    }

    @Override
    public Iterator<T> iterator() {
        return new Iterator<T>() {
            Node temp = head;

            @Override
            public boolean hasNext() {
                return temp != null;
            }

            @Override
            public T next() {
                T res = temp.data;
                temp = temp.next;
                return res;
            }
        };
    }
}
