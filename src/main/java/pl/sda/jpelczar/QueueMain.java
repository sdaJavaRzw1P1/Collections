package pl.sda.jpelczar;

public class QueueMain {

    public static void main(String[] args) {
        System.out.println("***************QueueImpl*****************");
        System.out.println();
        performQueueOperations(new QueueImpl<>());
        System.out.println("***************QueueArray*****************");
        System.out.println();
        performQueueOperations(new QueueArray<>());
    }


    private static void performQueueOperations(Queue<Integer> queue) {
        System.out.println("queue = " + queue);
        queue.push(0);
        System.out.println("queue = " + queue);
        queue.push(1);
        System.out.println("queue = " + queue);
        queue.push(2);
        System.out.println("queue = " + queue);
        queue.push(3);
        System.out.println("queue = " + queue);
        queue.push(4);
        System.out.println("queue = " + queue);

        //0
        System.out.println("value = " + queue.peek());
        System.out.println("queue poll = " + queue.poll());
        System.out.println("queue = " + queue);

        //1
        System.out.println("value = " + queue.peek());
        System.out.println("queue poll = " + queue.poll());
        System.out.println("queue = " + queue);

        //2
        System.out.println("value = " + queue.peek());
        System.out.println("queue poll = " + queue.poll());
        System.out.println("queue = " + queue);

        //3
        System.out.println("value = " + queue.peek());
        System.out.println("queue poll = " + queue.poll());
        System.out.println("queue = " + queue);

        //4
        System.out.println("value = " + queue.peek());
        System.out.println("queue poll = " + queue.poll());
        System.out.println("queue = " + queue);

        //???
        System.out.println("value = " + queue.peek());
        System.out.println("queue poll = " + queue.poll());
        System.out.println("queue = " + queue);
    }
}
