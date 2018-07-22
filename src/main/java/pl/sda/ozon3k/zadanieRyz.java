package pl.sda.ozon3k;

public class zadanieRyz {

    int ryzNPaczka;//1kg
    int ryzMPaczka;//5kg
    int ilosci;

    public zadanieRyz(int ryzNPaczka, int ryzMPaczka){
        this.ryzNPaczka = ryzNPaczka;
        this.ryzMPaczka = ryzMPaczka;
        ilosci = 5 * ryzMPaczka + ryzNPaczka;

    }

    int transakcja(int ile){
        if(ilosci - ile >= 0) {
            ilosci -= ile;
            ryzMPaczka -= ile / 5;
            ryzNPaczka -= ile % 5;
            if (ryzMPaczka < 0) {
                ryzMPaczka += ryzNPaczka;
                ryzMPaczka = 0;
            }
            return ile;
        }else{
                System.out.println("nie ma ryżu");
                return 0;
            }
        }
    }







