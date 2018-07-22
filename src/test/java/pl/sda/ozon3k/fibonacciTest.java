package pl.sda.ozon3k;

import org.junit.Assert;
import org.junit.Test;

import static org.junit.Assert.*;

public class fibonacciTest {

    @Test
    public void calculate() {

        int actual = new fibonacci().calculate(6);
        Assert.assertEquals(8,actual);
    }
    @Test
    public void calculate2() {

        int actual = new fibonacci().calculate(6);
        Assert.assertNotEquals(0,actual);
    }
}