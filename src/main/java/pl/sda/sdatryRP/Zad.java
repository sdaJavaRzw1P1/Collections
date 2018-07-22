package pl.sda.sdatryRP;

import java.util.Arrays;
import java.util.Random;
import java.util.stream.Stream;

public class Zad {


    public static void main(String[] args) {
        Zad zad = new Zad();
        int[] tab = zad.metoda2(10,29,33);
        System.out.println(Arrays.toString(tab));



        int n=10;
        int[] tabInput = new int[n];
        for (int i = 0; i<n;i++){


            tabInput[i] = i;

        }
        int[] tabResult = new int[n];

        // int[] arr = IntStream().range(0,size).toArray();

        for(int j =0; j<n; j++){

            if(tabInput[j]%2 != 0){
                if(tabInput[j]==1){ tabResult[j]=1;}
                else{tabResult[j]=tabInput[j]+tabInput[j-2];}
                continue;
            }

            else if (tabInput[j]%2==0){
                tabResult[j]=tabInput[j]/2;
                continue;
            }

        }

        int suma1=0;
        for(int a: tabInput){
            suma1+=a;
        }

        //int suma = Stream.of(tabResult).
        int suma=0;
        for(int a: tabResult){
            suma+=a;
        }


        System.out.println(Arrays.toString(tabInput));
        System.out.println(Arrays.toString(tabResult));
        System.out.println(suma);
        System.out.println(suma1);

       // return Arrays.stream(result).reduce((i+j)->i+j).orElse(0);  // return Arrays.stream(result).sum();

    }





    public int[] metoda2(int n, int a, int b){
        int[] tablica = new int[n];
        Random rd = new Random();
        for(int i =0 ; i<n ; i++){

            tablica[i] = rd.nextInt(b-a)+a;

        }

        return tablica;

    }






}
