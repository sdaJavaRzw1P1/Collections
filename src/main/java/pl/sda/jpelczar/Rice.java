package pl.sda.jpelczar;

public class Rice {

    private static final int BIG_PACK_CAPACITY_KILOGRAM = 5;
    private static final int SMALL_PACK_CAPACITY_KILOGRAM = 1;

    private int bigPackQuantity;
    private int smallPackQuantity;

    public Rice(int bigPackQuantity, int smallPackQuantity) {
        this.bigPackQuantity = bigPackQuantity;
        this.smallPackQuantity = smallPackQuantity;
    }


    public boolean placeOrder(int order) {
        if (order > (bigPackQuantity * BIG_PACK_CAPACITY_KILOGRAM + smallPackQuantity * SMALL_PACK_CAPACITY_KILOGRAM)) {
            return false;
        }
        int bigPackQuantityInOrder = Math.min(order / BIG_PACK_CAPACITY_KILOGRAM, bigPackQuantity);
        int orderMinusBigPack = order - bigPackQuantityInOrder * BIG_PACK_CAPACITY_KILOGRAM;
        int smallPackQuantityInOrder = Math.min(orderMinusBigPack / SMALL_PACK_CAPACITY_KILOGRAM, smallPackQuantity);

        if (order != (bigPackQuantityInOrder * BIG_PACK_CAPACITY_KILOGRAM +
                smallPackQuantityInOrder * SMALL_PACK_CAPACITY_KILOGRAM)) {
            return false;
        }

        bigPackQuantity -= bigPackQuantityInOrder;
        smallPackQuantity -= smallPackQuantityInOrder;
        return true;
    }

    public int getBigPackQuantity() {
        return bigPackQuantity;
    }

    public void setBigPackQuantity(int bigPackQuantity) {
        this.bigPackQuantity = bigPackQuantity;
    }

    public int getSmallPackQuantity() {
        return smallPackQuantity;
    }

    public void setSmallPackQuantity(int smallPackQuantity) {
        this.smallPackQuantity = smallPackQuantity;
    }

    @Override
    public String toString() {
        return "Rice{" +
                "bigPackQuantity=" + bigPackQuantity +
                ", smallPackQuantity=" + smallPackQuantity +
                '}';
    }
}
