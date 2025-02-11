

public class BinaryTreeMain {
    public static void main(String[] args) {
        BinaryTree tree = new BinaryTree(20);

        tree.insertLeft(tree.root, 15);
        tree.insertRight(tree.root, 25);
        tree.insertLeft(tree.root.left, 10);
        tree.insertRight(tree.root.left, 30);
        tree.insertLeft(tree.root.right, 5);

        tree.preOrder(tree.root);
        System.out.println();
        tree.inOrder(tree.root);
        System.out.println();
        tree.postOrder(tree.root);
        System.out.println();
    }
}