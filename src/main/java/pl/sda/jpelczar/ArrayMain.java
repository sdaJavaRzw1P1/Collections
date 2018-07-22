package pl.sda.jpelczar;

import java.util.Arrays;

public class ArrayMain {

    public static void main(String[] args) {
        ArrayHelper<Integer> arrayHelper = new ArrayHelper<>();
        Integer[] a1 = new Integer[5];
        for (int i = 0; i < a1.length; i++) {
            a1[i] = i;
        }

        Integer[] swapResult = arrayHelper.swap(a1, 0, 3);
        System.out.println(Arrays.toString(swapResult));

    }

}
