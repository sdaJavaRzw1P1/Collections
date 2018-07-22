package pl.sda.sdatryRP;

public class Main {
    public static void main(String[] args) {


        Rice rc = new Rice(10,10);
        boolean sprzedaz1 = rc.buy(54);

        System.out.println(sprzedaz1);
        System.out.println(rc);

        boolean sprzedaz2 = rc.buy(3);

        System.out.println(sprzedaz2);
        System.out.println(rc);




    }
}
