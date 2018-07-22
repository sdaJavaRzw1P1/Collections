package pl.sda.sdatryRP;

import org.junit.Assert;
import org.junit.Test;

import static org.junit.Assert.*;

public class FibonacciTest {

    @Test
    public void calculateSix() {
        int actual = new Fibonacci().calculate(6);
        System.out.println("AAA");
        Assert.assertEquals(8,actual);  //zwroci czy jeden obiekt jest rowny drugiemu
      //  Assert.assertTrue(8==actual);
    }

    @Test
    public void calculateTen() {
        int actual = new Fibonacci().calculate(10);
        System.out.println("BBB");
        Assert.assertNotEquals(0,actual);  //zwroci czy jeden obiekt NIE jest rowny drugiemu
    }



}