package pl.sda;


import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.BlockJUnit4ClassRunner;

@RunWith(BlockJUnit4ClassRunner.class)
public class ExampleTest {

    @Test
    public void testExample() {
        Assert.assertEquals(4, 2 + 2);
    }

}