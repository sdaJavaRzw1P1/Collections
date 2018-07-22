package pl.sda.jpelczar;

import org.junit.Assert;
import org.junit.Test;

import static org.junit.Assert.*;

public class FibonacciTest {

    @Test
    public void calculateSix() {
        int actual = new Fibonacci().calculate(6);
        Assert.assertEquals(8, actual);
    }

    @Test
    public void calculateTen() {
        int actual = new Fibonacci().calculate(10);
        Assert.assertNotEquals(0, actual);
    }
}