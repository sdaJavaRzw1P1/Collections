package pl.sda.TOboza;

public interface Stack<T> {

    void push(T value);
    T pop();
    T peak();
    boolean isEmpty();

}
