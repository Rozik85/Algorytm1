package Sortowanie;

import java.util.Random;
import java.util.Scanner;

public class Babelkowe {
    public static void main(String[] args) {
        int k = 0;
        Scanner scanner = new Scanner(System.in);
        System.out.println("Podaj liczbę elementów");
        int size = scanner.nextInt();

        int[] inputArray = new int[size];

        for (int i = 0; i < size; i++) {
            System.out.println("Podaj element nr " + i);
            inputArray[i] = scanner.nextInt();
        }
        babelek(inputArray);
    }

    public static void babelek(int[] inputArray) {
        int zmiana = 1;
        int k;
        while (zmiana > 0) {
            zmiana = 0;
            for (int i = 0; i < inputArray.length - 1; i++) {
                if (inputArray[i] > inputArray[i + 1]) {
                    k = inputArray[i + 1];
                    inputArray[i + 1] = inputArray[i];
                    inputArray[i] = k;
                    zmiana++;
                }
            }
        }
        for (int i = 0; i < inputArray.length; i++) {
            System.out.print(inputArray[i] + " ");
        }
    }
}
