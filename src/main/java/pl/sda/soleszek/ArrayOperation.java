package pl.sda.soleszek;

import java.lang.reflect.Array;
import java.util.Arrays;

public class ArrayOperation {
    public static void main(String[] args) {
        int n = 10;
        int[] input = new int[n];
        int[] output = new int[n];

        for (int i = 0; i < n; i++) {
            input[i] = i;
        }

        for (int j = 0; j < n; j++) {
            int temp = input[j];

            if ((temp % 2) != 0 && temp > 2) {
                output[j] = temp + (input[j - 2]);
            } else if (temp != 1){
                output[j] = input[j] / 2;
            } else {
                output[j] = input[j];
            }
        }

        int suma = 0;

        for (int k : output) {
            suma += k;
        }

        System.out.println(Arrays.toString(input));
        System.out.println(Arrays.toString(output));
        System.out.println(suma);




    }
}
