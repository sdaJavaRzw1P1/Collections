package pl.sda.sdatryRP;

public interface Stack <T>{
    void push(T value);

    /**
     *
     * @return
     */

    T pop();
    T peek();
    boolean isEmpty();


}
