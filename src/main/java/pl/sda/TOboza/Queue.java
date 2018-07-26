package pl.sda.TOboza;

public interface Queue<T> {

        void push(T value);
        T poll();
        T peak();
        boolean isEmpty();



}
