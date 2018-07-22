package pl.sda.soleszek;

public class Fibonacci {
    public int calculate (int itemIndex) {
        if (itemIndex == 0) {
            return 0;
        } else if (itemIndex == 1) {
            return 1;
        }
        return calculate (itemIndex -2)
                + calculate(itemIndex - 1);
    }
}
