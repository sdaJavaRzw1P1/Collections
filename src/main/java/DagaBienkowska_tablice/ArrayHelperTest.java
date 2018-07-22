package DagaBienkowska_tablice;

import java.util.Random;

public class ArrayHelperTest {
    public static void main(String[] args) {



    }

    public static void testSwap() {
        ArrayHelper<Integer> arrayHelper = new ArrayHelper<>();
        Integer[] a1 = new Integer[5];
        for (int i = 0; i < a1.length; i++) {
            a1[i] = i;
        }

        Integer[] swapResult = arrayHelper.swap(a1, 0, 3);
    }



}
