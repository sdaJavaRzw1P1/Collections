package pl.sda.TOboza;

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
        stack.push(5);
        System.out.println(stack.toString());
        stack.push(6);
        System.out.println(stack.toString());

        stack.peak();
        System.out.println(stack.toString());
        stack.pop();
        System.out.println(stack.toString());
        stack.peak();
        System.out.println(stack.toString());
        stack.pop();
        System.out.println(stack.toString());
        stack.peak();
        System.out.println(stack.toString());
        stack.pop();
        System.out.println(stack.toString());
        stack.peak();
        System.out.println(stack.toString());
        stack.pop();
        System.out.println(stack.toString());
        stack.peak();
        System.out.println(stack.toString());
        stack.pop();
        System.out.println(stack.toString());
        stack.peak();
        System.out.println(stack.toString());
        stack.pop();
        System.out.println(stack.toString());
    }

}
