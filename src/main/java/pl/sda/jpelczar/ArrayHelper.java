package pl.sda.jpelczar;

import java.util.Arrays;
import java.util.Random;

public class ArrayHelper<T> {

    public T[] swap(T[] array, int index1, int index2) {
        if (array.length < index1 || array.length < index2) {
            throw new ArrayIndexOutOfBoundsException("index1=" + index1 + ", index2=" + index2 + ", array size=" + array.length);
        }

        T temp = array[index1];
        array[index1] = array[index2];
        array[index2] = temp;

        return array;
    }

    public int[] createAndFillArray(int n, int a, int b) {
        int[] array = new int[n];

        for (int i =0; i < array.length; i++){
            array[i] = new Random().nextInt(b - a + 1) + a;
        }

        return array;
    }
}
