package gmarkiewicz.tablice.Stosy;

public class StackImpl<T> implements Stack<T> {

    private Item head;

    @Override
    public void push(T value) {
        Item newHead = new Item();
        newHead.value = value;
        newHead.next = head;
        head = newHead;
    }

    @Override
    public T pop() {
        if (head == null) {
            return null;
        }
        T value = head.value;
        head = head.next;

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
        return head == null;
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
