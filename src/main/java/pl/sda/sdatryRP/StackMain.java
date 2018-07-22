package pl.sda.sdatryRP;

public class StackMain {

    public static void main(String[] args) {
        Stack<Integer> stack = new StackImpl<>();

        stack.push(0);
        System.out.println(stack.toString());
        stack.push(1);
        System.out.println(stack.toString());
        stack.push(2);
        System.out.println(stack.toString());
        stack.push(3);
        System.out.println(stack.toString());
        stack.push(4);
        System.out.println(stack.toString());


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
    }

}
