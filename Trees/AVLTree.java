


public class AVLTree {
    Node root;
    protected  class Node {
        int data;
        Node left, right;
        int height;

        Node(int val) {
            data = val;
            left = right = null;
            height = 0;
        }
    }

    @SuppressWarnings("unused")
    AVLTree() {
        root = null;
    }

    AVLTree(int val) {
        root = new Node(val);
    }

    public void insert(int val) {
        root = insert(root, val);
    }
    public Node insert(Node node, int val) {
        if(node == null) 
            return new Node(val);
        if(val < node.data) 
            node.left = insert(node.left, val);
        else if(val > node.data) 
            node.right = insert(node.right, val);
        
        node.height = 1 + max(getHeight(node.left), getHeight(node.right));

        int balFactor = getBalanceFactor(node);

        // LL case
        if(balFactor > 1 && val < node.left.data) {
            return rightRotate(node);
        }
        // LR case
        if (balFactor > 1 && val > node.left.data) {
            node.left = leftRotate(node.left);
            return rightRotate(node);
        }
        // RR case
        if(balFactor < -1 && val > node.right.data) {
            return leftRotate(node);
        }
        // RL case
         if(balFactor < -1 && val < node.right.data) {
            node.right = rightRotate(node.right);
            return leftRotate(node);
        }

        return node;
    }

    //   x < y < z 
    private Node rightRotate(Node z) {
        Node y = z.left;
        Node subTree = y.right;
        y.right = z;
        z.left = subTree;

        z.height = 1 + max(getHeight(z.left), getHeight(z.right));
        y.height = 1 + max(getHeight(y.left), getHeight(y.right));

        return y;
    }

    //   x < y < z 
    private Node leftRotate(Node z) {
        Node y = z.right;
        Node subTree = y.left;
        y.left = z;
        z.right = subTree;

        z.height = 1 + max(getHeight(z.left), getHeight(z.right));
        y.height = 1 + max(getHeight(y.left), getHeight(y.right));

        return y;
    }

    public int getBalanceFactor(Node root) {
        if(root == null) return -1;
        return getHeight(root.left) - getHeight(root.right);
    }

    public int getHeight(Node node) {
        if(node == null) return -1;
        return node.height;
    }

    public int max(int x, int y) {
        return x > y ? x : y;
    }
    
    public void inOrder(Node root) {
        if(root == null) return;
        inOrder(root.left);
        System.out.println(root.data + " Height is " + root.height);
        inOrder(root.right);
    }
}