package pl.sda.soleszek;

import org.junit.Assert;
import org.junit.Test;

import static org.junit.Assert.*;

public class ArrayHelperTest {

    @Test
    public void testSwap() {
        ArrayHelper<Integer> arrayHelper = new ArrayHelper<>();
        Integer[] al = new Integer[5];
        for (int i = 0; i < al.length; i++) {
            al[i] = i;
        }

        Integer[] swapResult = arrayHelper.swap(al, 0, 3);

        Assert.assertArrayEquals(new Integer[] {3, 1, 2, 4}, swapResult);
    }

}