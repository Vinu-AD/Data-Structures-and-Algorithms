

public class BinarySearchTreeDemo {
    public static void main(String[] args) {
        BinarySearchTree tree = new BinarySearchTree(50);
        tree.insert(30);
        tree.insert(20);
        tree.insert(10);
        tree.insert(60);
        tree.insert(90);
        tree.insert(80);
        tree.insert(70);
        tree.insert(38);
        tree.insert(19);
        tree.insert(93);
        tree.insert(23);

        // tree.inOrder(tree.root);

        int n = 100;
        if(tree.search(tree.root, n) == null) 
            System.out.println("The value " + n + " is NOT FOUND in the tree");
        else System.out.println("The value " + n + " is FOUND in the tree"); 

        tree.delete(50);

        tree.inOrder(tree.root); // why root
    }
}