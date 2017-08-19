package Sito;

import java.util.Scanner;

import static java.lang.Math.sqrt;

public class Eratostenesa {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Podaj liczbę elementów");
        int size = scanner.nextInt();
        int[] inputArray = new int[size - 1];
        for (int i = 0; i < size - 1; i++)
            inputArray[i] = i + 2;

        for (int i = 0; i < inputArray.length; i++) {
            System.out.println(inputArray[i]);

        }
        inputArray = doEratostenes(inputArray);
        for (int j = 0; j < inputArray.length; j++) {
            System.out.println(inputArray[j]);
        }
    }

    public static int[] doEratostenes(int[] inputArray) {
        double pierwiastek = (int) sqrt(inputArray.length);
        System.out.println("Wykona się "+pierwiastek+"razy");

        for (int i = 0; i < inputArray.length-1; i++) {
            for (int j = i + 1; j < inputArray.length-1; j++) {
                if (inputArray[i] != 0 && inputArray[j] != 0 && inputArray[j] % inputArray[i] == 0) {
                    inputArray[j] = 0;
                }
            }
            if (inputArray[i] > pierwiastek) {
                break;
            }
        }

        return inputArray;
    }
}
