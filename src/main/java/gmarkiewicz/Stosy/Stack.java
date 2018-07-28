package gmarkiewicz.Stosy;

public interface Stack<T> {

    void push(T value);

    T pop();


    T peek();

    boolean isEmpty();
}
