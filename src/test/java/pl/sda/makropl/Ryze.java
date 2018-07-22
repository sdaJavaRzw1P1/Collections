package pl.sda.makropl;

public class Ryze {
    int paczka5 = 0;
    int paczka1 = 0;
    int mamyTyżu;


    public Ryze(int paczka5, int paczka1) {
        this.paczka5 = paczka5;
        this.paczka1 = paczka1;
        mamyTyżu = 5 * paczka5 + paczka1;
    }


    int dajMnieRyz(int ile) {

        if (mamyTyżu - ile >= 0) {
            mamyTyżu -= ile;
            paczka5 -= ile / 5;
            paczka1 -= ile % 5;
            if (paczka5 < 0) {
                paczka1 += paczka5;
                paczka5 = 0;
            }
            return ile;
        } else {
            System.out.println("ni ma ryzu");
            return 0;
        }

    }
}
