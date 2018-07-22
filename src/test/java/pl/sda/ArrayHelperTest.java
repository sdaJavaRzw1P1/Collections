package pl.sda;


import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.BlockJUnit4ClassRunner;
import pl.sda.TOboza.ArrayHelper;

import java.util.Arrays;

@RunWith(BlockJUnit4ClassRunner.class)
public class ArrayHelperTest {


    @Test
    public void losowaTablica() {
       ArrayHelper a  = new ArrayHelper();
       a.losowaTablica(20,10,15);
        System.out.println(
                Arrays.toString(a.losowaTablica(20,10,15)));
    }
}