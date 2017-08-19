package Sortowanie;

import java.util.Random;
import java.util.Scanner;

public class Babelkowe {
    public static void main(String[] args) {
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

//    public static void babelek(int[] inputArray) {
//        int zmiana = 1;
//        int k;
//        while (zmiana > 0) {
//            zmiana = 0;
//            for (int i = 0; i < inputArray.length - 1; i++) {
//                if (inputArray[i] > inputArray[i + 1]) {
//                    k = inputArray[i + 1];
//                    inputArray[i + 1] = inputArray[i];
//                    inputArray[i] = k;
//                    zmiana++;
//                }
//            }
//        }
//        for (int i = 0; i < inputArray.length; i++) {
//            System.out.print(inputArray[i] + " ");
//        }
//    }
 /* Druga opcja od końca */

    public static void babelek(int[] inputArray) {
        int n = inputArray.length;


        if (n > 1) {           //sprawdzanie czy tablica ma więcej niż 1 element

            boolean check = true;
            while (check) {
                check = false;
                for (int i = n - 1; i > 0; i--) {
                    if (inputArray[i] < inputArray[i - 1]) {
                        int temp = inputArray[i];
                        inputArray[i] = inputArray[i - 1];
                        inputArray[i - 1] = temp;
                        check = true;
                    }
                }
            }
            for (int i = 0; i < inputArray.length; i++) {
                System.out.print(inputArray[i] + " ");
            }
        }
    }
}