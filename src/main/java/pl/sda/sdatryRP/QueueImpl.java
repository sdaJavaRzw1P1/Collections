package pl.sda.sdatryRP;

public class QueueImpl<T> implements Queue<T> {

    private Item head; // na sztywno
    private Item tail;


    @Override
    public void push(T value) {
/*

        Item newTail = new Item();
        newTail.value = value;
        newTail.next = tail;
        tail = newTail;
   */
        Item newTail = new Item();
        if(head==null && tail ==null){
            tail = newTail;
            head = newTail;
        }else if(head==tail){
            tail= newTail;
            head.next = newTail;
        }else{
            tail.next = newTail;
            tail = newTail; // newtail.next = newTail - zapętla
        }


        /*
        Item newHead = new Item();
        newHead.value = value;
        newHead.next = head;
        head = newHead;
*/

    }

    @Override
    public T poll() {
 
        if(head==null){
            return null;
        }
        T value = head.value;


        head = head.next;
        if(head==null){
            tail=null;
        }



        return value;

        /*
        T value = head.value;
        head = head.next;
        return value;
        */



    }

    @Override
    public T peek() {
        if(head==null){
            return null;
        }
        return head.value;
    }

    @Override
    public boolean isEmpty() {
        return head==null;
    }




    private class Item{
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
        return "QueueImpl{" +
                "head=" + head +
                ", tail=" + tail +
                '}';
    }
}
