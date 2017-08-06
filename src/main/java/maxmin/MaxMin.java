package maxmin;

import java.util.ArrayList;
import java.util.Scanner;

public class MaxMin {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Podaj liczbę elementów ");
        int size = scanner.nextInt();
        int [] array = new int[size];

        for (int i=0; i<size; i++){
            System.out.println("Podaj element nr "+i);
            array[i] = scanner.nextInt();
        }
        System.out.println("Max = "+ getMaxValue(array));
        System.out.println("min = "+ getMinValue(array));



    }
    public static int getMaxValue(int[] array){
        int maxValue = array[0];
        for (int arrayValue : array){
            if (maxValue < arrayValue){
                maxValue = arrayValue;
            }
        }
        return maxValue;
    }
    public static int getMinValue (int[] array){
        int minValue = array[0];
        for (int arrayValue : array){
            if (minValue >arrayValue){
                minValue=arrayValue;
            }
        }
        return minValue;
    }

}
