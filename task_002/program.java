/*
 * Пусть дан произвольный список целых чисел, удалить из него четные числа
 */

import java.util.Random;
import java.util.ArrayList;

public class program{
    public static void main(String[] args) {
        Random rnd = new Random();
        ArrayList<Integer> intArray = new ArrayList<>();
        ArrayList<Integer> newArray = new ArrayList<>();
        for (int i = 0; i < 10; i++) {
             intArray.add(rnd.nextInt(1,100));
        } 
        printArray(intArray);

        for (int i = 0; i < intArray.size(); i++) {
            if (intArray.get(i) % 2 != 0){
                newArray.add(intArray.get(i));
            }
        }
        printArray(newArray);
 
    }
    public static void printArray(ArrayList<Integer> array){
        StringBuilder printSB = new StringBuilder();
        for (Integer i : array) {
            // System.out.print(i + ", ");
            printSB.append(i + ", ");
        }
        String printOut = printSB.substring(0, printSB.length() - 2);
        System.out.println(printOut);
    }
}