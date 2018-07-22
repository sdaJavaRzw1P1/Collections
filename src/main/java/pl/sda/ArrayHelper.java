package pl.sda;

import java.util.Random;

public class ArrayHelper {
    protected int n;
    protected int a;
    protected int b;
    Random rand = new Random() ;

    public int[] losowaTablica(int n, int a, int b) {
        int[] losowaTab = new int[n];

        for (int i = 0; i < losowaTab.length; i++) {
            losowaTab[i] = a + rand.nextInt(b-a+1);
        }
        return losowaTab;
    }
}
