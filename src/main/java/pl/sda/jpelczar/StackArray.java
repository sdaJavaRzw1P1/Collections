package pl.sda.jpelczar;

import java.util.Arrays;

public class StackArray<T> implements Stack<T> {

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
    public T pop() {
        if (currentIndex == INITIAL_INDEX) {
            return null;
        }

        T value = elements[currentIndex--];
        elements = Arrays.copyOf(elements, Math.max(0, elements.length - 1));
        return value;
    }

    @Override
    public T peek() {
        if (currentIndex == INITIAL_INDEX) {
            return null;
        }

        return elements[currentIndex];
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
