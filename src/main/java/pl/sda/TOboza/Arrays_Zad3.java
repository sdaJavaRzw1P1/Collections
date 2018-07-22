package pl.sda.TOboza;

import java.util.Arrays;

public class Arrays_Zad3 {

    public static void main(String[] args) {


        int n = 10;
        int[] tab = new int[n];
        int[] tab2 = new int[n];
        int[] tab3 = new int[n];
        int suma = 0;

        for (int i = 0; i < tab.length; i++) {
            tab[i] = i;
            tab2[i] = i;
        }
        System.out.println(Arrays.toString(tab));

        for (int i = 0; i < tab2.length; i++) {
            if (i > 2) {
                if(tab2[i]%2 != 0) {
                    tab2[i] = tab[i] + tab[i - 2];
                }
            }
        }
        System.out.println(Arrays.toString(tab2));

        for (int i = 0; i < tab.length; i++) {
            if(tab[i] % 2 == 0) {
                tab3[i] = tab2[i]/2;
            }else {
                tab3[i] = tab[i];
            }
        }
        System.out.println(Arrays.toString(tab3));
        for (int i = 0; i < tab3.length; i++) {

            suma += tab2[i];

        }
        System.out.println(suma);
    }
}