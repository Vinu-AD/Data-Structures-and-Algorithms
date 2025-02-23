public class BinaryTree {
    Node root;
    protected  class Node {
        int data;
        Node left, right;

        @SuppressWarnings("unused")
        Node() {
            left = null;
            right = null;
        }
        @SuppressWarnings("unused")
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
        r.left = new Node(val);
    }
    public void insertRight(Node r, int val) {
        r.right = new Node(val);
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