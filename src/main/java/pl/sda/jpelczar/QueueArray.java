package pl.sda.jpelczar;

import java.util.Arrays;

public class QueueArray<T> implements Queue<T> {

    private static final int INITIAL_INDEX = -1;

    private T[] elements = (T[]) new Object[0];
    private int currentIndex = INITIAL_INDEX;

    @Override
    public void push(T element) {
        if (++currentIndex == Math.max(0, elements.length)) {
            elements = Arrays.copyOf(elements, elements.length + 1);
        }
        elements[currentIndex] = element;
    }

    @Override
    public T poll() {
        if (elements.length <= 0) {
            return null;
        }

        T value = elements[0];
        elements = Arrays.copyOfRange(elements, 1, elements.length);
        currentIndex--;
        return value;
    }

    @Override
    public T peek() {
        if (elements.length <= 0) {
            return null;
        }

        return elements[0];
    }

    @Override
    public boolean isEmpty() {
        return currentIndex == INITIAL_INDEX;
    }

    @Override
    public String toString() {
        return Arrays.toString(elements);
    }

}
