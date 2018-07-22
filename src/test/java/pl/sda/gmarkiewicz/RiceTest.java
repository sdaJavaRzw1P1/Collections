package pl.sda.gmarkiewicz;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class RiceTest {
    private final static int smallPackQuantity = 10;
    private final static int bigPackQuantity = 20;

    private Rice rice;
    @Before
    public void setUp() throws Exception{
        rice = new Rice(smallPackQuantity, bigPackQuantity);
    }
    @Test
    public void testbuyRice() {
        assertTrue(rice.buyRice(9));
        System.out.println("1: " + rice.riceAmount());
    }
}