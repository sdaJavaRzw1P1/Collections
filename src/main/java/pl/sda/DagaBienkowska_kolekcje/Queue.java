package pl.sda.DagaBienkowska_kolekcje;

public interface Queue<T> {

    void push(T value);
    T poll();
    T peek();
    boolean isEmpty();
}
