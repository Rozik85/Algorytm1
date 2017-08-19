package Sortowanie;

import java.util.Scanner;

public class Wstawianie {
    public static void main(String[] args) {
        System.out.println("podaj wielkość tablicy: ");
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();

        int[] arrayN = new int[n];
        for (int i = 0; i < arrayN.length; i++) {
            System.out.println("podaj kolejną liczbę : " + i);
            arrayN[i] = scanner.nextInt();
        }
        //Insert Sort
        arrayN = doInsertSort(arrayN);
        for (int i = 0; i < arrayN.length; i++) {
            System.out.println(arrayN[i]);
        }
    }
    public static int[] doInsertSort(int[] arrayN) {
        int[] arrayResult = new int[arrayN.length];
        if (arrayN.length > 0) {
            arrayResult[0] = arrayN[0];
            if (arrayN.length > 1) {
                for (int i = 0; i < arrayN.length; i++) {
                    boolean added = false;
                    for (int j = 0; j < arrayResult.length; j++) {
                        if (arrayN[i] < arrayResult[j]) {
                            arrayResult = move(arrayResult, arrayN[i], j);
                            added = true;
                            break;
                        }
                    }
                    if (!added) {
                        arrayResult[i] = arrayN[i];
                    }
                }
            }
        }
        return arrayResult;
    }
    public static int[] move(int[] arrayResult, int insertValue, int insertIndex) {
        for (int i = arrayResult.length - 1; i > insertIndex; i--) {
            arrayResult[i] = arrayResult[i - 1];
        }
        arrayResult[insertIndex] = insertValue;
        return arrayResult;
    }
}