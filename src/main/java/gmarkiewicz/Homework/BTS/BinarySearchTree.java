package gmarkiewicz.Homework.BTS;

import java.util.LinkedList;
import java.util.Queue;

public class BinarySearchTree<T extends Comparable> {
    protected Queue<Node> treeQueue = new LinkedList<>();
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
    public void breadthFirstSearch(){
        breadthFirstSearch(root);
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

    private void breadthFirstSearch(Node node){
        if(node != null) {
            if (node.left != null) {
                treeQueue.add(node.left);
            }
            if (node.right != null) {
                treeQueue.add(node.right);
            }
        }
        System.out.println(node.value);
        if (!treeQueue.isEmpty()) {
            breadthFirstSearch(treeQueue.poll());
        }
    }

    private void insert(Node parent, T k){
        if (root == null){
            root = new Node(k);
        } else if (k.compareTo(parent.value) <= 0){
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
