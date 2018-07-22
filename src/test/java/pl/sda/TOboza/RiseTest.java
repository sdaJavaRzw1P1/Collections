package pl.sda.TOboza;

import org.junit.Test;

import static org.junit.Assert.*;

public class RiseTest {

    @Test
    public void supply() {
        Rise rise = new Rise();
        rise.supply(10,10);

    }

    @Test
    public void sell() {
        Rise rise = new Rise();
        rise.supply(10,10);
        rise.sell(22);
        rise.sell(6);
        rise.sell(4);
        rise.sell(4);
        rise.sell(3);
        rise.sell(15);
        rise.sell(10);
        rise.sell(1);
    }
}