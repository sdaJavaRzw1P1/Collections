package pl.sda.ozon3k;

public interface Stos<T> {

    void push (T value);

    T pop();

    T push();


}
