package gmarkiewicz.tablice;

import org.junit.Assert;
import org.junit.Test;

import java.util.Arrays;

import static org.junit.Assert.*;

public class ArrayHelperTest {

    @Test
    public void testSwap() {
        ArrayHelper<Integer> arrayHelper = new ArrayHelper<>();
        Integer[] a1 = new Integer[5];
        for (int i = 0; i < a1.length; i++) {
            a1[i] = i;
        }

        Integer[] swapResult = arrayHelper.swap(a1, 0, 3);

        Assert.assertArrayEquals(new Integer[]{3, 1, 2, 0, 4}, swapResult);
    }

    @Test
    public void testFill() {
        ArrayHelper<Integer> arrayHelper = new ArrayHelper<>();
        int[] randomArray = arrayHelper.fill(5, 5, 8);

        System.out.println(Arrays.toString(randomArray));
    }
}