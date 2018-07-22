package pl.sda.jpelczar;

import java.util.Arrays;
import java.util.Random;

public class ArrayMain {

    public static void main(String[] args) {
        ArrayHelper<Integer> arrayHelper = new ArrayHelper<>();
        Integer[] a1 = new Integer[5];
        for (int i = 0; i < a1.length; i++) {
            a1[i] = i;
        }

        Integer[] swapResult = arrayHelper.swap(a1, 0, 3);
        System.out.println(Arrays.toString(swapResult));

        /*********************************************************************/

        int n = 10; //rozmiar
        int a = 5;
        int b = 8;

        int[] array = new int[n];
        Random random = new Random();

        for (int i = 0; i < array.length; i++) {
            array[i] = random.nextInt(b - a + 1) + a;
        }

        System.out.println(Arrays.toString(array));
        System.out.println(Arrays.toString(arrayHelper.createAndFillArray(n, a, b)));
    }

}
