
import java.util.NoSuchElementException;
import java.util.Iterator;

public class LinkedList<T> implements Iterable<T>{
    Node head;
    class Node {
        T data;
        Node next;

        Node(T val) {
            data = val;
            next = null;
        }
    }
    LinkedList() {
        head = null;
    }
    @SuppressWarnings("unused")
    LinkedList(T val) {
        head = new Node(val);
    }

    public void add(T val) {
        if(head == null) {
            head = new Node(val);
            return;
        }
        Node newNode = new Node(val);
        Node temp = head;
        while(temp.next != null) 
            temp = temp.next;
        temp.next = newNode;
    }

    public void insertAtBeginning(T val) {
        if(head == null) {
            head = new Node(val);
            return;
        }
        Node newNode = new Node(val);
        newNode.next = head;
        head = newNode;
    }

    public void insertAtPos(int pos, T val) {
        if(pos == 0) {
            insertAtBeginning(val);
            return;
        }
        Node temp = head;
        Node newNode = new Node(val);
        for(int i = 1; i < pos; i++) {
            temp = temp.next;
        }
        newNode.next = temp.next;
        temp.next = newNode;
    }

    public void insertAtEnd(T val) {
        add(val);
    }

    public T remove() {
        if(head == null) throw new NoSuchElementException("List is empty");
        T deleted;
        if (head.next == null) {
            deleted = head.data;
            head = null;
            return deleted;
        }
        Node temp = head.next;
        Node prev = head;
        while(temp.next != null) {
            prev = temp;
            temp = temp.next;
        }
        prev.next = null;
        return temp.data;
    }

    public T removeAtBeginning() {
        if(head == null) throw new NoSuchElementException("List is empty");
        T deleted = head.data;
        head = head.next;
        return deleted;
    }

    public T remove(T val) {
        if(head == null) throw new NoSuchElementException("List is empty");
        T deleted = null;
        if(head.data == val) {
            deleted = head.data;
            head = null;
            return deleted;
        } 
        Node temp = head.next;
        Node prev = head;
        while(temp != null) {
            if(temp.data == val) {
                deleted = temp.data;
                prev.next = temp.next;
                break;
            }
            prev = temp;
            temp = temp.next;
        }
        return deleted;
    }

    public void update(T reference, T target) {
        if(head == null) throw new NoSuchElementException("List is empty");
        Node temp = head;
        boolean updated = false;
        while(temp != null) {
            if(temp.data == reference) {
                temp.data = target;
                updated = true;
                break;
            }
            temp = temp.next;
        }
        if(!updated) 
            throw new NoSuchElementException("The give value " + reference + " is not found in the list");
    }

    public int search(T val) {
        int index = 0;
        if(head == null) 
            throw new NoSuchElementException("List is empty");
        Node temp = head;
        while(temp != null) {
            if(temp.data == val) return index;
            index++;
            temp = temp.next;
        }
        return -1;
    }

    public T get(int ind) {
        if (head == null)
            throw new NoSuchElementException("List is empty");
        Node temp = head;
        int size = -1;
        for(int i = 0; i < ind; i++) {
            temp = temp.next;
            size++;
            if(temp == null) 
                throw new IndexOutOfBoundsException("Invalid index " + ind + " for length " + size);
        }
        return temp.data;
    }

    public boolean contains(T val) {
        if (head == null) {
            throw new NoSuchElementException("List is empty");
        }
        Node temp = head;
        boolean found = false;
        while(temp != null) {
            if(val == temp.data) {
                found = true;
                break;
            }
            temp = temp.next;
        }
        return found;
    }

    public void display() {
        if(head == null) throw new NoSuchElementException("List is empty");
        Node temp = head;
        while(temp != null) {
            System.out.print(temp.data + " ");
            temp = temp.next;
        }
    }

    public void reverse() {
        Node prev = null;
        Node curr = head;
        Node next;

        while(curr != null) {
            next = curr.next;
            curr.next = prev;
            prev = curr;
            curr = next;
        }
        head = prev;
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