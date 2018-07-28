package gmarkiewicz.Kolejki;

public class QueueImpl<T> implements Queue<T> {

    private Item head;
    private Item tail;

    private class Item {
        T value;
        Item next;

        @Override
        public String toString() {
            return "Item{" +
                    "value=" + value + ", next=" + next +
                    '}';
        }
    }

    @Override
    public String toString() {
        return "QueueImpl{" +
                "head=" + head +
                ", tail=" + tail +
                '}';
    }

    @Override
    public void push(T value) {
            Item newTail = new Item();
            newTail.value = value;

        if (head == null && tail == null){
            tail = newTail;
            head = tail;
        } else if (head == tail){
            tail = newTail;
            head.next = tail;
        } else {
            tail.next= newTail;
            tail = newTail;
        }
    }

    @Override
    public T poll() {
        if (head == null) {
            return null;
        }
        T value = head.value;
        head = head.next;

        if (head == null){
            tail = null;
        }
        return value;
    }

    @Override
    public T peek() {
        if (head == null) {
            return null;
        }
        return head.value;
    }

    @Override
    public boolean isEmpty() {
        return head == null && tail == null;
    }
}
