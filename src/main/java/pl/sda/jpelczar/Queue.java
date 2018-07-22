package pl.sda.jpelczar;

public interface Queue<T> {

    void push(T item);

    T poll();

    T peek();

    boolean isEmpty();

}
