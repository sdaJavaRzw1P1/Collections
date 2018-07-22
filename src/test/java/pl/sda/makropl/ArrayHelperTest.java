package pl.sda.makropl;

import org.junit.Assert;
import org.junit.Test;
import pl.sda.example.pl.sda.makropl.ArrayHelper;

import java.lang.reflect.Array;
import java.util.Arrays;

import static org.junit.Assert.*;

public class ArrayHelperTest {
    Integer[] arr=new Integer[]{123,123,1423,423,52,35};
    ArrayHelper helpMeeeeee=new ArrayHelper();
    @Test
    public void swap() {

        helpMeeeeee.swap(arr,1,3);
        Assert.assertArrayEquals(new Integer[]{123,423,1423,123,52,35},arr);
        System.out.println(Arrays.toString(arr));
        //Arrays.stream(arr).forEach(System.out::println);

    }

    @Test
    public void losowa() {
        helpMeeeeee.losowa(8,3,8);
        System.out.println(Arrays.toString(helpMeeeeee.losowa(8,3,8)));
    }

    @Test
    public void cosRobic() {
        int[] tab=helpMeeeeee.cosRobic(10);
        helpMeeeeee.cosrob2(tab);
        helpMeeeeee.cosrob3(tab);
        helpMeeeeee.cosRob4(tab);
        helpMeeeeee.sumaTab(tab,tab);
    }
}