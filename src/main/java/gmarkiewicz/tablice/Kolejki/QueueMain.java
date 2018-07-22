package gmarkiewicz.tablice.Kolejki;

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



    }
}
