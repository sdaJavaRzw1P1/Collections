package gmarkiewicz.Collections;

import java.util.ArrayList;
import java.util.List;

public class CollectionsExercise {
    public static void main(String[] args) {
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
    }
}
