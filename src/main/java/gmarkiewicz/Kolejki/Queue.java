package gmarkiewicz.tablice.Kolejki;

public interface Queue <T> {

    void push (T value);

    T poll();

    T peek();

    boolean isEmpty();
}
