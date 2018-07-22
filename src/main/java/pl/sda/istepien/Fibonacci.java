package pl.sda.istepien;

public class Fibonacci {//alt +enter -> create test
    public int calculate(int itemIndex) {//itemIndex indeks w ciagu fibonacciego
        if (itemIndex == 0) {
            return 0;
        } else if (itemIndex == 1) {
            return 1;
        }
        return calculate(itemIndex-2)+calculate(itemIndex-1);
    }
}
