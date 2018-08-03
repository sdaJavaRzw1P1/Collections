package gmarkiewicz.Homework;

import java.util.*;
import java.util.stream.*;


public class StringToMap {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.println("Wpisz tekst:");
        String inputString = scan.nextLine();

        System.out.println();
        System.out.println(stringToMap(inputString));
        System.out.println();
        System.out.println(mapToString(stringToMap(inputString)));
    }

    public static Map<Character, List<Integer>> stringToMap(String string){
        Map<Character, List<Integer>> map = new LinkedHashMap<>();
        for(int i = 0; i < string.length(); i++){
            if (map.containsKey(string.charAt(i))){
                List<Integer> intList = new ArrayList<>();
                List<Integer> temp = map.get(string.charAt(i));
                for(Integer integer: temp){
                    intList.add(integer);
                }
                intList.add(i);
                map.put(string.charAt(i), intList);
            } else {
                map.put(string.charAt(i), new ArrayList<Integer>(Arrays.asList(i)));
            }
        }
        return map;
    }

    public static String mapToString(Map<Character, List<Integer>> map){
        List<Character> temp = new ArrayList<>();
        for (Character ch : map.keySet()){
            for(Integer integer : map.get(ch)){
                temp.add(ch);
            }
        }
        for (Character ch : map.keySet()){
            for(Integer integer : map.get(ch)){
                temp.set(integer, ch);
            }
        }
        String string = "";
        for (Character ch : temp){
            string += ch;
        }
        return string;
    }
}
