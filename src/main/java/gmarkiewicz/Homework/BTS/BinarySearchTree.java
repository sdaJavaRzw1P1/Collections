package gmarkiewicz.Homework.BTS;

public class BinarySearchTree<T extends Comparable> {
    private Node root;

    public  void add(T value){
        insert(root, value);
    }

    public void preOrder(){
        preOrder(root);
    }

    public void inOrder(){
        inOrder(root);
    }

    public void postOrder(){
        postOrder(root);
    }

    private void preOrder(Node node){
        System.out.println(node.value);
        if (node.left != null){
            preOrder(node.left);
        }
        if (node.right != null){
            preOrder(node.right);
        }
    }

    private void inOrder(Node node){
        if (node.left != null){
            inOrder(node.left);
        }
        System.out.println(node.value);
        if (node.right != null){
            inOrder(node.right);
        }
    }

    private void postOrder(Node node){
        if (node.left != null){
            postOrder(node.left);
        }
        if (node.right != null){
            postOrder(node.right);
        }
        System.out.println(node.value);
    }

    private void insert(Node parent, T k){
        if (root == null){
            root = new Node(k);
        } else if (k.compareTo(parent.value) < 0){
            if (parent.left == null){
                parent.left = new Node(k);
            } else {
                insert(parent.left, k);
            }
        } else {
            if (parent.right == null){
                parent.right = new Node(k);
            } else {
                insert(parent.right, k);
            }
        }
    }

    @Override
    public String toString(){
        return "BinarySearchTree{" + "root=" + root + "}";
    }

    private class Node{
        Node left;
        Node right;
        T value;

        public Node(T value){
            this.value = value;
        }

        @Override
        public String toString(){
            return "Node{" + value + ", left=" + left +
                    ", right=" + right + "}";
        }
    }
}
