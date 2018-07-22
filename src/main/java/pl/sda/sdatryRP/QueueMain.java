package pl.sda.sdatryRP;

public class QueueMain {

    public static void main(String[] args) {
        Queue<Integer> queue = new QueueImpl<>();


        queue.push(0);
        System.out.println(queue.toString());
        queue.push(1);
        System.out.println(queue.toString());
        queue.push(2);
        System.out.println(queue.toString());
        queue.push(3);
        System.out.println(queue.toString());
        queue.push(4);
        System.out.println(queue.toString());

/*
        //4
        System.out.println(stack.peek());
        System.out.println(stack.pop());
        //3
        System.out.println(stack.peek());
        System.out.println(stack.pop());
//2
        System.out.println(stack.peek());
        System.out.println(stack.pop());
//1
        System.out.println(stack.peek());
        System.out.println(stack.pop());
//0
        System.out.println(stack.peek());
        System.out.println(stack.pop());
//c/iekawe oc?
        System.out.println(stack.peek());
        System.out.println(stack.pop());

        */
    }

}
