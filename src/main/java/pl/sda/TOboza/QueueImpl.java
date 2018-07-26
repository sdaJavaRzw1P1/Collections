package pl.sda.TOboza;

public class QueueImpl<T> implements Queue<T> {

    private Item head;
    private Item tail;

    @Override
    public void push(T value) {
        if (head.equals(null)) {
            Item newHead = new Item();
            newHead.value = value;

        } else {

            Item newTail = new Item();
            newTail.value = value;
            newTail.next = tail;
            tail = newTail;
            if (tail.equals(head)) {
                head = tail;
            }
        }
    }

    @Override
    public T poll() {

        if (head == null) {
            return null;
        }
        T value = head.value;
        head = head.next;
        return head.value;
    }

    @Override
    public T peak() {
        if (head == null) {
            return null;
        }
        return head.value;
    }

    @Override
    public boolean isEmpty() {
        return false;
    }

    private class Item {
        T value;
        Item next;
                
        @Override
        public String toString() {
            return "Item{" +
                    "value=" + value +
                    ", next=" + next +
                    '}';
        }

    }

    @Override
    public String toString() {
        return "StackImpl{" +
                "head=" + head +
                '}';
    }
}
