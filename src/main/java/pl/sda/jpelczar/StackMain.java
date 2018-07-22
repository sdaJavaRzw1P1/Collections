package pl.sda.jpelczar;

public class StackMain {

    public static void main(String[] args) {
        performStackOperations(new StackImpl<>());
        performStackOperations(new StackArray<>());

    }

    private static void performStackOperations(Stack<Integer> stack) {
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
        System.out.println("Peek: " + stack.peek());
        System.out.println("Pop: " + stack.pop());
        System.out.println("Stack: " + stack);

        //3
        System.out.println("Peek: " + stack.peek());
        System.out.println("Pop: " + stack.pop());
        System.out.println("Stack: " + stack);

        //2
        System.out.println("Peek: " + stack.peek());
        System.out.println("Pop: " + stack.pop());
        System.out.println("Stack: " + stack);

        //1
        System.out.println("Peek: " + stack.peek());
        System.out.println("Pop: " + stack.pop());
        System.out.println("Stack: " + stack);

        //0
        System.out.println("Peek: " + stack.peek());
        System.out.println("Pop: " + stack.pop());
        System.out.println("Stack: " + stack);

        //??????
        System.out.println("Peek: " + stack.peek());
        System.out.println("Pop: " + stack.pop());
        System.out.println("Stack: " + stack);

        //??????
        System.out.println("Peek: " + stack.peek());
        System.out.println("Pop: " + stack.pop());
        System.out.println("Stack: " + stack);
    }
}
