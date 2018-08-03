package gmarkiewicz.Homework.BTS;

public class BinaryTreeMain {
    private BinarySearchTree<Integer> binarySearchTree;

    public static void main(String[] args) {
        BinaryTreeMain main = new BinaryTreeMain();
        main.prepare();

        main.binarySearchTree.preOrder();
        main.binarySearchTree.inOrder();
        main.binarySearchTree.postOrder();
    }

    public void prepare(){
        binarySearchTree = new BinarySearchTree<>();
        binarySearchTree.add(5);
        binarySearchTree.add(2);
        binarySearchTree.add(4);
        binarySearchTree.add(9);
        binarySearchTree.add(5);
        binarySearchTree.add(3);
        binarySearchTree.add(6);
        binarySearchTree.add(1);
        binarySearchTree.add(10);
    }
}
