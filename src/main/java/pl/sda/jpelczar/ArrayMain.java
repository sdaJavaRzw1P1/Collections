package pl.sda.jpelczar;

import java.util.Arrays;
import java.util.Random;
import java.util.stream.IntStream;

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

        System.out.println(executeOperation(10));

    }

    public static int executeOperation(int size) {
        int[] array = IntStream.range(0, size).toArray();
//        for (int i = 0; i < size; i++) {
//            array[i] = i;
//        }
        int[] result = new int[size]; //{0, 0, 0, 0 ,0 ,0, 0 ,0 ,0 ,0}
        for (int i = 0; i < size; i++) {
            if (i % 2 == 0) {
                result[i] = array[i] / 2; //{0, 1, 1, 3, 2, 5, 3, 7, 4, 9}
                continue;
            }
            if (i - 2 < 0) {
                result[i] = array[i];
                continue;
            }

            result[i] = array[i] + array[i - 2]; // {0, 1, 1, 4, 2, 8, 3, 12, 4, 16}
        }

        System.out.println("*********************");
        System.out.println(Arrays.toString(array));
        System.out.println(Arrays.toString(result));
        return Arrays.stream(result).sum();
    }

}
