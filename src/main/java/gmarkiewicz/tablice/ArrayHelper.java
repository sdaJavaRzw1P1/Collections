package gmarkiewicz.tablice;

import java.util.Random;

public class ArrayHelper<T> {
    public T[] swap(T[] array, int index1, int index2) {
        if (array.length < index1 || array.length < index2) {
            throw new ArrayIndexOutOfBoundsException("index1= " + index1 + ", index2= " + index2);
        }
        T temp = array[index1];
        array[index1] = array[index2];
        array[index2] = temp;

        return array;
    }

    public int[] fill(int length, int a, int b) {
        int[] intArray = new int[length];
        Random random = new Random();
        
        for (int i = 0; i < intArray.length; i++) {
            intArray[i] = random.nextInt(b - a + 1) + a;
        }
        return intArray;
    }
}
