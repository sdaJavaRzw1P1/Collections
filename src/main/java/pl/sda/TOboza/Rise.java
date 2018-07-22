package pl.sda.TOboza;

import java.sql.SQLOutput;

public class Rise {

    protected int n;
    protected int m;
    protected int moduloRest;
    protected int overallKg;


    public void supply(int qty1kg, int qty5kg) {
        this.n = n + qty1kg;
        this.m = m + qty5kg;
        this.overallKg = n + 5 * m;
        System.out.println("Całkowita ilość paczek 1kg : " + n + "\n" +
                "Całkowita ilość paczek 5kg : " + m + "\n" +
                "Całkowita ilość kilogramów : " + overallKg+"\n");
    }

    public void sell(int ileKg) {
        overallKg = n + 5 * m;
        if ((overallKg >= ileKg) && (n >= (ileKg % 5))) {
            if (5 * m >= ileKg) {
                moduloRest = ileKg % 5;
                m = m - (ileKg / 5);
                n = n - moduloRest;
                overallKg = n + 5 * m;
                System.out.println("Sprzedano "+ileKg);
            } else {
                ileKg = ileKg - 5 * m;
                m = 0;
                n = n - ileKg;
                overallKg = n + 5 * m;
                System.out.println("Sprzedano "+ileKg);
            }
        } else {
            System.out.println("Nie można zrealizować zamówienia ");
            System.out.println("Całkowita ilość paczek 1kg : " + n + "\n" +
                            "Całkowita ilość paczek 5kg : " + m + "\n" +
                            "Całkowita ilość kilogramów : " + overallKg+"\n");
        }


    }

}

