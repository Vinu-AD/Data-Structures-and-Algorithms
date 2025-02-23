
public class AVLTree {
    class Node {
        int data;
        Node left, right;
        int height;
        
        Node(int val) {
            data = val;
            left = right = null;
            height = 0;
        }
    }
    Node root;

    @SuppressWarnings("unused")
    AVLTree() {
        root = null;
    }

    @SuppressWarnings("unused")
    AVLTree(int val) {
        root = new Node(val);
    }

    public void insert(int val) {
        this.root = insert(root, val);
    }

    private  Node insert(Node node, int val) {
        if(node == null) 
            return new Node(val);
        else if(node.data > val) 
            node.left = insert(node.left, val);
        else if(node.data < val) {
            node.right = insert(node.right, val);
        }
        node.height = 1 + max(getHeight(node.left), getHeight(node.right));

        int balFactor = getHeight(node.left) - getHeight(node.right);

        // LL case
        if(balFactor > 1 && val < node.left.data) {
            return rightRotation(node);
        }

        // LR case
        if(balFactor > 1 && val > node.left.data) {
            node.left = leftRotation(root.left);
            return rightRotation(root);
        }

        // RR case
        if (balFactor < -1 && val > node.right.data) {
            return leftRotation(root);
        }

        // RL case
        if (balFactor < -1 && val < node.right.data) {
            node.right = rightRotation(root.right);
            return leftRotation(root);
        }

        return node;
    }

    private int getHeight(Node root) {
        if(root == null) return -1;
        return root.height;
    }

    private Node rightRotation(Node root) {
        Node leftNode = root.left;
        Node subTree = leftNode.right;

        leftNode.right = root;
        root.left = subTree;

        root.height = 1 + max(getHeight(root.left), getHeight(root.right));
        leftNode.height = 1 + max(getHeight(leftNode.left), getHeight(leftNode.right)); 

        return leftNode;
    }

    private Node leftRotation(Node root) {
        Node rightNode = root.right;
        Node subTree = rightNode.left;

        rightNode.left = root;
        root.right = subTree;

        root.height = 1 + max(getHeight(root.left), getHeight(root.right));
        rightNode.height = 1 + max(getHeight(rightNode.left), getHeight(rightNode.right));

        return rightNode;
    }

    private int max(int x, int y) {
        return x > y ? x : y;
    }

    public void inOrder() {
        inOrder(root);
    }
    private void inOrder(Node root) {
        if(root == null) return;
        inOrder(root.left);
        System.out.println("The height of the root " + root.data + " is " + root.height);
        inOrder(root.right);
    }
}