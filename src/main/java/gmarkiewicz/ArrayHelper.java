package gmarkiewicz;

import java.util.Arrays;
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

    /*public int arrayChanger(int[] input) {
        int sum = 0;
        int[] modifiedArray = input;
        for (int i = 0; i < input.length; i++) {
            modifiedArray[i] = i;
        }
        int[] tempArray = modifiedArray;
        System.out.println(Arrays.toString(modifiedArray));
        for (int j = 0; j < input.length; j++) {
            if (j % 2 == 0) {
                tempArray[j] = modifiedArray[j] / 2;
            } else {
                if (modifiedArray[j] - 2 < 0) {
                    tempArray[j] = modifiedArray[j];
                } else {
                    tempArray[j] = modifiedArray[j] + modifiedArray[j - 2];
                }
            }
        }
        System.out.println(Arrays.toString(tempArray));

        for (int num : tempArray) {
            sum += num;
        }
        return sum;
    }*/
}
