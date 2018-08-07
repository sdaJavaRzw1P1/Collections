package gmarkiewicz.Homework;

public class Pseudocode {
    public static void main(String[] args) {
        int a = 20;
        int b = 5;
        System.out.println(gcd(a, b));
        System.out.println(multiply(a, b));
        System.out.println(isFiveOrSix(a));
        System.out.println(isFiveOrSix(b));
        whatColor(a);
        whatColor(b);
        multipleOfFive();
    }
    /**
     * gcd(a,b)
     * if a = b
     * 		return a
     * while b != 0
     * 		c ← reszta z dzielenia a przez b
     * 		a ← b
     * 		b ← c
     * return a
     */

    public static int gcd(int a, int b){
        if(a == b){
            return a;
        }
        while (b != 0){
            int c = a % b;
            a = b;
            b = c;
        }
        return a;
    }

    /**
     * multiply(a, b)
     *     return a*b
     */

    public static int multiply(int a, int b){
        return a*b;
    }

    /**
     * isFiveOrSix(a)
     * if a != 5 and a != 6
     *     return Podana liczba nie jest 5 lub 6
     * if a = 5
     *     return Podales 5
     * if a = 6
     *     return Podales 6
     */

    public static String isFiveOrSix(int a){
        if(a != 5 && a != 6) {
            return "Podana liczba nie jest 5 lub 6";
        }
        if (a == 5){
            return "Podales 5";
        }
        if (a == 6){
            return "Podales 6";
        }
        return null;
    }

    /**
     *whatColor(a)
     * if 10 <= a < 20
     *     return niebieski
     * else if 20 <= a < 30
     *     return czerwony
     * else if 30 <= a < 40
     *     return zielony
     * else
     *     return Podana liczba nie jest poprawna
     */

    public static void whatColor(int a){
        if (10 <= a && a <20){
            System.out.println("niebieski");
        }else if (20 <= a && a < 30){
            System.out.println("czerwony");
        }else if (30 <= a && a < 40){
            System.out.println("zieolny");
        }else{
            System.out.println("Podana liczba nie jest poprawna");
        }
    }

    /**
     *  multipleOfFive()
     *  for i <- 5 to 100
     *      output i
     *      i <- i + 5
     */

    public static void multipleOfFive(){
        for (int i = 5; i <= 100; i+=5){
            System.out.print(i + ", ");
        }
    }
}
