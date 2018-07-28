package pl.sda.gmarkiewicz;

public class Rice {
    private final static int smallPackKg = 1;
    private final static int bigPackKg = 5;
    private int smallPackQuantity;
    private int bigPackQuantity;
    private boolean isSold;

    public Rice(int smallPackQuantity, int bigPackQuantity) {
        this.smallPackQuantity = smallPackQuantity;
        this.bigPackQuantity = bigPackQuantity;
    }

    public Rice() {

    }

    public void setSmallPackQuantity(int smallPackQuantity) {
        this.smallPackQuantity = smallPackQuantity;
    }

    public void setBigPackQuantity(int bigPackQuantity) {
        this.bigPackQuantity = bigPackQuantity;
    }

    public String riceAmount() {
        return "1kg paczka ryzu: " + smallPackQuantity + " szt.\n5kg paczka ryzu: " + bigPackQuantity + " szt.";
    }

    public boolean buyRice(int x) {
        if (x > ((smallPackQuantity * smallPackKg) + (bigPackQuantity * bigPackKg)))
            return isSold = false;
        int orderedBigPackQuantity = Math.min(x / bigPackKg, bigPackQuantity);
        int orderedMinusBigPack = x - (orderedBigPackQuantity * bigPackKg);
        int orderedSmallPackQuantity = Math.min(orderedMinusBigPack / smallPackKg, smallPackQuantity);

        if (x != (orderedBigPackQuantity * bigPackKg) + (orderedSmallPackQuantity * smallPackKg))
            return isSold = false;
        bigPackQuantity -= orderedBigPackQuantity;
        smallPackQuantity -= orderedSmallPackQuantity;
        return isSold = true;
    }
}
