package DagaBienkowska_tablice;

import java.util.Arrays;
import java.util.Random;

public class ArrayHelper2 {

    public static void main(String[] args) {
        int n = 10;
        int a = 5;
        int b = 8;

        int[] array = new int[n];
        for (int i = 0; i < array.length; i++) {
            array[i] = new Random().nextInt(b - a + 1) + a;
        }

        System.out.println(Arrays.toString(array));

        System.out.println("\nZadanie 3");
        int n2 = 10;
        int[] input = new int[n2];
        int[] result = new int[n2];
        for (int i = 0; i < input.length; i++) {
            input[i] = i;
        }
        System.out.println(Arrays.toString(input));
        for (int i = 0; i <n2; i++) {
            if (i % 2 ==0) {
                result[i] = input[i] / 2;
                continue;
            }
                if (i - 2 < 0) {
                    result[i] = input[i];
                    continue;
                }
            result[i] = input[i] + input[i-2];
            }

        System.out.println(Arrays.toString(result));
        int sum = 0;
        for (int x : result){
            sum = sum +x;
        }
        System.out.println(sum);
    }
}
