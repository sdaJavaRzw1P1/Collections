package pl.sda.sdatryRP;

public interface Queue<T>{
    void push(T value);

    /**
     *
     * @return
     */

    T poll();
    T peek();
    boolean isEmpty();


}
