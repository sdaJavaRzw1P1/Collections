package gmarkiewicz.Homework;

import java.util.Scanner;

public class Flowcharts {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        //Zadanie 10
        System.out.println("Podaj 3 liczby odzielone spacja");
        int a = scan.nextInt();
        int b = scan.skip(" ").nextInt();
        int c = scan.skip(" ").nextInt();

        if (a == b || b == c || a == c){
            System.out.println("Podane liczby musza byc rozne.");
        } else {
            int[] array = new int[3];
            array[0] = a;
            array[1] = b;
            array[2] = c;

            int j = 0;
            boolean counter = true;
            while(counter){
                j++;
                counter = false;
                for(int i = 0; i < array.length - j; i++){
                    if(array[i] > array[i+1]){
                        int temp = array[i];
                        array[i] = array[i+1];
                        array[i+1] = temp;
                        counter = true;
                    }
                }
            }
            for (int n : array) {
                System.out.print(n + ", ");
            }
        }
        //Zadanie 11
//        int a = 0;
//        int sum = 0;
//
//        while(a >= 0){
//            System.out.println("Podaj liczbe");
//            a = scan.nextInt();
//            sum += a;
//            System.out.println(sum);
//        }
    }
}
