package pl.sda.example.pl.sda.makropl;

import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.Random;
import java.util.stream.Collector;
import java.util.stream.Collectors;

public class ArrayHelper<T> {
    Random random=new Random();

    public T[] swap(T[] array, int indeks1, int indeks2){
        if(array.length<indeks1||array.length<indeks2){
            throw new ArrayIndexOutOfBoundsException("Nie ma takich elementów");
        }
        T temp=array[indeks1];
        array[indeks1]=array[indeks2];
        array[indeks2]=temp;
        return array;
    }

    public int[] losowa(int n, int a, int b){
        int[] tab=new int[n];
        tab= Arrays.stream(tab).map(l->l=random.nextInt(b-a)+a).toArray();
        return tab;
    }

    public int[] cosRobic(int n){
        int[] tab=new int[n];
        for (int i=0;i<n;i++){
            tab[i]=i;
        }
        System.out.println(Arrays.toString(tab  ));
        return tab ;



    }
    public void cosrob2(int[] tab2){
        int[] tab=tab2.clone();
        int niep=0;
        int temp;
        for (int i=0;i<tab.length;i++){
            if (tab[i]%2==1){
                temp=tab[i];
                tab[i]+=niep;
                niep=temp;

            }
        }
        System.out.println(Arrays.toString(tab));
    }
    public void cosrob3(int[] tab2){
        int[] tab=tab2.clone();
        for (int i=0;i<tab.length;i++){
            if(tab[i]%2==0){
                tab[i]=tab[i]/2;
            }
        }
        System.out.println(Arrays.toString(tab));
    }
    public void cosRob4(int[] tab){
        System.out.println(Arrays.stream(tab).sum());
    }
    public void sumaTab(int[] tab1, int[] tab2){
        int a=Arrays.stream(tab1).sum();
        int b=Arrays.stream(tab2).sum();
        System.out.println(a+b);
    }


}
