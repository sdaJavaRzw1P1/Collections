package pl.sda.DagaBienkowska;

import org.junit.Assert;
import org.junit.Test;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class RiceTest {
    private final static int BIG_PACK_QUANTITY = 10;
    private final static int SMALL_PACK_QUANTITY = 25;

    private Rice rice;

    @Before
    public void setUp() throws Exception {
        rice = new Rice(BIG_PACK_QUANTITY, SMALL_PACK_QUANTITY);
    }

    @Test
    public void testPlaceOneOrder() {
        assertTrue(rice.placeOrder(10));
        System.out.println(rice.toString());
    }

    @Test
    public void testPlaceOrdersAndRunOutRice() {
        assertTrue(rice.placeOrder(10));
        System.out.println("1: " + rice);
        assertTrue(rice.placeOrder(29));
        System.out.println("2: " + rice);
        assertTrue(rice.placeOrder(36));
        System.out.println("3: " + rice);
        assertFalse(rice.placeOrder(1));
        System.out.println("4: " + rice);
    }
}
