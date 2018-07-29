package gmarkiewicz.Collections;

import java.util.*;

public class CollectionsExercise {
    public static Map<String, String> workersMap = new HashMap<>();
    public static Map<String, String> dictionary = new HashMap<>();
    public static void main(String[] args) {
/*
        //Zadanie 1 - lista Float

        List<Float> floatList = new ArrayList<>();
        boolean run = true;
        int counter = 0;
        while (run){
            float randomNum = (float) Math.random() * 100;
            if (randomNum >= 0.01f) {
                floatList.add(randomNum);
                counter++;
            } else {
                run = false;
            }
        }
        for (float num : floatList) {
            System.out.printf("PI x %f = %f%n",num, Math.PI*num);
        }
        System.out.println(counter);
*/
        //Zadanie 2 - mapa pracownikow
        System.out.println();

        workersMap.put("a1234", "Jan Kowalski");
        workersMap.put("a4321","Pawel Nowak");

        System.out.println(getWorker("A1234"));
        System.out.println(getWorker("a1234"));

        //Zadanie 3 - slownik


        dictionary.put("zdanie", "sentance");
        dictionary.put("do", "to");
        dictionary.put("przetlumaczenia", "translate");

        Scanner scanner = new Scanner(System.in);
        System.out.println("podaj zdanie");
        List<String> stringList = new LinkedList<>();
        stringList = Arrays.asList(scanner.nextLine().split(" "));
        System.out.println(translate(stringList));

        //Zadanie 4 - licznik unikalnych znakow w stringu
        System.out.println();
        System.out.println(uniqueLetters(stringList.get(1)));

        //Zadanie 5 - tekst -> mapa, mapa -> tekst
        System.out.println();

    }

   /* public static Map<String, List<Integer>> toMap(String string){

        Map<String, List<Integer>> letterMap = new HashMap<String, List<Integer>>() {

        }
}*/

    public static int uniqueLetters(String string){
        char[] temp = string.toCharArray();
        Set<Character> charSet = new HashSet<>();
        for (int i = 0; i < string.length(); i++){
            charSet.add(temp[i]);
        }

        return charSet.size();
    }

    public static String getWorker(String id){
        return workersMap.get(id.toLowerCase());
    }

    public static String translate(List<String> list){
        String translated ="";
        for(String s : list){
            if (dictionary.keySet().contains(s)){
                translated += (dictionary.get(s)) + " ";
            } else {
                translated += s + " ";
            }
        }
        return translated;
    }

}
