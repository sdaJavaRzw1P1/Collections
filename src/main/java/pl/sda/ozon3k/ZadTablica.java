package pl.sda.ozon3k;

import pl.sda.jpelczar.ArrayHelper;

import java.util.Arrays;
import java.util.Random;

public class ZadTablica {
    public static void main(String[] args) {
//program przypisujący randomowe wartości do tablicy o określonej długości
//
//        int n=10;
//        int a=5;
//        int b=8;
//
//        int[] array = new int[n];
//
//        for (int i = 0; i < array.length; i++) {
//            array[i]= new Random().nextInt(b - a + 1)+a ;
//
//        }
//        System.out.println(Arrays.toString(array));
//Zad2
        int n = 10;
        int[] tablica = new int[n];
        for (int i = 0; i < tablica.length; i++) {
            tablica[i] = i;

        }
        for (int i : tablica) {
            if (i % 2 != 0) {
                tablica[i] = tablica[i] + tablica[i - 1];
                continue;
            }

            for (int f = 1; f < tablica.length; f++) {
                if (f % 2 == 0) {
                    tablica[f] = tablica[f] / 2;
                }

            }

        } System.out.println(Arrays.toString(tablica));
    }
}

