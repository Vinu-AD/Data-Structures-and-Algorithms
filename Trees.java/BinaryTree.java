public class BinaryTree {
    Node root;
    protected  class Node {
        int data;
        Node left, right;

        Node() {
            left = null;
            right = null;
        }
        Node(int val) {
            data = val;
            left = null;
            right = null;
        }
    }
    
    BinaryTree(int val) {
        root = new Node(val);
    }

    public void insertLeft(Node r, int val) {
        Node newNode = new Node(val);
        r.left = newNode;
    }
    public void insertRight(Node r, int val) {
        Node newNode = new Node(val);
        r.right = newNode;
    }

    public void preOrder(Node r) {
        if(r != null) {
            System.err.print(r.data + " ");
            preOrder(r.left);
            preOrder(r.right);
        }
    }
    public void inOrder(Node r) {
        if(r != null) {
            inOrder(r.left);
            System.err.print(r.data + " ");
            inOrder(r.right);
        }
    }
    public void postOrder(Node r) {
        if(r != null) {
            postOrder(r.left);
            postOrder(r.right);
            System.err.print(r.data + " ");
        }
    }
}