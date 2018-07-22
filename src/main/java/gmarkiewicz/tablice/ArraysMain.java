package gmarkiewicz.tablice;

import java.util.Arrays;

public class ArraysMain {
    public static void main(String[] args) {
        int[] input = new int[10];
        System.out.println(arrayModifier(input));
    }

    public static int arrayModifier(int[] input) {
        int sum = 0;
        int[] modifiedArray = input;
        for (int i = 0; i < input.length; i++) {
            modifiedArray[i] = i;
        }
        int[] tempArray = new int[input.length];
        System.out.println(Arrays.toString(modifiedArray));
        for (int j = 0; j < input.length; j++) {
            if (j % 2 == 0) {
                tempArray[j] = modifiedArray[j] / 2;
                continue;
            }
            if (modifiedArray[j] - 2 < 0) {
                tempArray[j] = modifiedArray[j];
                continue;
            }
            tempArray[j] = modifiedArray[j] + modifiedArray[j - 2];
        }
        System.out.println(Arrays.toString(tempArray));

        for (int num : tempArray) {
            sum += num;
        }
        return sum;
    }
}
