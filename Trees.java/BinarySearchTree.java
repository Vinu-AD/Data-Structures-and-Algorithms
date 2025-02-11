

public class BinarySearchTree {
    Node root;
    protected class Node {
        int data;
        Node left, right;

        Node(int val) {
            data = val;
            left = right = null;
        }
    }

    @SuppressWarnings("unused")
    BinarySearchTree() {
        root = null;
    }

    BinarySearchTree(int val) {
        root = new Node(val);
    }

    public void insert(int val) {
        insert(root, val);
    }

    public Node insert(Node r, int val) {
        if(r == null) 
            return new Node(val);
        if(val < r.data) 
            r.left = insert(r.left, val);
        else 
            r.right = insert(r.right, val);
        return r;
        
    }

    public void inOrder(Node r) {
        if(r != null) {
            inOrder(r.left);
            System.err.print(r.data + " ");
            inOrder(r.right);
        }
    }

    public Node search(Node r, int val) {
        if(r == null || r.data == val) 
            return r;
        if(val < r.data)
            return search(r.left, val);
        return search(r.right, val);
    }

    public void delete(int val) {
        delete(root, val);
    }
    
    public Node delete(Node root, int val) {
        if(root == null) return root;

        if(root.data > val) 
            root.left = delete(root.left, val);
        else if(root.data < val) 
            root.right = delete(root.right, val);
        else {
            if(root.right == null)
                return root.left;
            else if(root.left == null) 
                return root.right;
            root.data = min(root.right);
            root.right = delete(root.right, root.data);
        }
        return root;
    }

    public int min(Node root) {
        int minVal = root.data;
        while(root != null) {
            minVal = root.data;
            root = root.left;
        }
        return minVal;
    }
}