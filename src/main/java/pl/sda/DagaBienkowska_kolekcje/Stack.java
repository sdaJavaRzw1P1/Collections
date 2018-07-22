package pl.sda.DagaBienkowska_kolekcje;

public interface Stack<T> {

    void push(T value);
    T pop();
    T peek();
    boolean isEmpty();
}
