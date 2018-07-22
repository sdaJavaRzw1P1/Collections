package pl.sda.soleszek;

import org.junit.Assert;
import org.junit.Test;

import static org.junit.Assert.*;

public class FibonacciTest {

    @Test
    public void calculateSix() {
        int actual = new Fibonacci().calculate(6);
        System.out.println("AAA");
        Assert.assertEquals(9, actual);
    }

    @Test
    public void calculateTen() {
        int actual = new Fibonacci().calculate(10);
        System.out.println("BBB");
        Assert.assertNotEquals(0, actual);
    }
}