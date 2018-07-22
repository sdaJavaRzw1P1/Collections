package pl.sda.soleszek;

import java.util.Arrays;
import java.util.Random;

public class ArrayRandom {
    public static void main(String[] args) {
        int a = 5;
        int b = 8;
        int n = 10;

        int[] array = new int[n];
        Random random = new Random();

        for (int i = 0; i < array.length; i++) {
            array[i] = random.nextInt(b - a + 1) + a;
        }

        System.out.println(Arrays.toString(array));

    }
}
