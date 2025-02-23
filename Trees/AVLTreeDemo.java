public class AVLTreeDemo {
    public static void main(String[] args) {
        // AVLTree avl = new AVLTree(30);
        // avl.insert(40);
        // avl.insert(90);
        // avl.insert(80);
        // avl.insert(20);
        // avl.insert(50);
        // avl.insert(70);

        AVLTree avl = new AVLTree(50);
        avl.insert(20);
        avl.insert(60);
        avl.insert(10);
        avl.insert(30);
        avl.insert(40);
        avl.insert(80);
        avl.insert(70);
        // 0 1 3 1 0 2 0


        avl.inOrder();
    }
}