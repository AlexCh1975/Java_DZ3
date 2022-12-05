/*
 * Задан целочисленный список ArrayList. Найти минимальное, максимальное и 
 * среднее из этого списка.
 */

package task_003;

import java.util.Random;
import java.util.ArrayList;

public class program {
    public static void main(String[] args) {
        Random rnd = new Random();
        ArrayList<Integer> intArray = new ArrayList<>();
        for (int i = 0; i < 10; i++) {
            intArray.add(rnd.nextInt(1,100));
       } 
        int min = intArray.get(0);
        int max = intArray.get(0);
        int sum = 0;
        
        for (int i = 0; i < intArray.size(); i++) {
            if (intArray.get(i) < min) min = intArray.get(i);
            if (intArray.get(i) > max) max = intArray.get(i);
            sum += intArray.get(i);
        }
        Double average = (double) sum / 10;

        StringBuilder printSB = new StringBuilder();
        for (Integer i : intArray) {
            // System.out.print(i + ", ");
            printSB.append(i + ", ");
        }
        String printOut = printSB.substring(0, printSB.length() - 2);
        System.out.println(printOut);

        System.out.printf("Max = %d\nMin = %d\nAverage =%f", max, min, average);
    }
}
