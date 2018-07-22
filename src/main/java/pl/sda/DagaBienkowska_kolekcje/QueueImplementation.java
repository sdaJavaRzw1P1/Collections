package pl.sda.DagaBienkowska_kolekcje;

public class QueueImplementation<T> implements Queue<T> {

    private QueueItem head;
    private QueueItem tail;

    @Override
    public void push(T value) {
        QueueItem newTail = new QueueItem();
        newTail.value = value;
        if (head == null && tail == null) {
            tail = newTail;
            head = newTail;
        } else if (head == tail){
            tail = newTail;
            head.next = newTail;
        } else {
            tail.next = newTail;
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
        return false;
    }

    @Override
    public String toString() {
        return "QueueImplementation{" +
                "head=" + head +
                ", tail=" + tail +
                '}';
    }

    private class QueueItem {
        T value;
        QueueItem next;

        @Override
        public String toString() {
            return "QueueItem{" +
                    "value=" + value +
                    ", next=" + next +
                    '}';
        }
    }
}
