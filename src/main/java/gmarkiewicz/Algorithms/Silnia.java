package gmarkiewicz.Algorithms;

public class Silnia {
    public static void main(String[] args) {
        System.out.println(silnia(5));
        System.out.println(fibonacci(8));
        System.out.println(fibonacci(2));
        System.out.println(fibArray(9));
        System.out.println("****************");
        System.out.println(isPrime(13));
        System.out.println(isPrime(12));
        System.out.println(isPrime(17));
        System.out.println(isPrime(2));
        System.out.println(isPrime(1437));
    }

    public static int silnia(int a) {
        if (a == 0 || a == 1) {
            return 1;
        } else {
            return a * silnia(a - 1);
        }
    }
    /*
    silnia(a)
        if a =1 or a = 0
            return 1
        else
            return a*silnia(a-1)
    */

    public static int fibonacci(int a) {
        if (a == 0) {
            return 0;
        } else if (a == 1){
            return 1;
        } else {
            return fibonacci(a - 2) + fibonacci(a - 1);
        }
    }
    /*
    fibonacci(a)
        if a = 0
            return 0
        else if a = 1 or a = 2
            return 1
        else
            return fibonacci (a - 1) + fibonacci (a - 2)
    */
    public static int fibArray(int a){
        if (a == 0){
            return 0;
        }
        if (a == 1){
            return 1;
        }
        int[] array = new int[a+1];
        array[0] = 0;
        array[1] = 1;
        for (int i = 2; i <= a; i++){
            array[i] = array[i-2] + array[i-1];
        }return array[a];
    }

    public static boolean isPrime(int n){
        if (n <= 1){
            return false;
        } else if (n<=3){
            return true;
        } else if (n%2 == 0 || n%3 == 0){
            return false;
        }
        int i = 5;
        while (i*i <= n){
            if (n%i == 0 || n%(i+2) == 0){
                return false;
            } else {
                i += 6;
            }
        }return true;
    }
}
