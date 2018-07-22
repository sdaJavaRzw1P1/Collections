package pl.sda.DagaBienkowska_kolekcje;

public class QueueMain {
    public static void main(String[] args) {

        Queue<Integer> queue = new QueueImplementation<>();
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
    }
}
