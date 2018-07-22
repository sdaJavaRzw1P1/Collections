package pl.sdaKamilS123;

import org.junit.Assert;
import org.junit.Test;

import static org.junit.Assert.*;

public class FibonacciTest {

    @Test
    public void calculateSix() {
    int actual = new Fibonacci().calculate(6);
        System.out.println("aaa");
        Assert.assertEquals(8,actual);
    }


    @Test
    public void calculateTen() {
        int actual = new Fibonacci().calculate(10);
        System.out.println("bbb");
        Assert.assertNotEquals(0,actual);
    }
}