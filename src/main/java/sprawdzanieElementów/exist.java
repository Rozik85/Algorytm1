package sprawdzanieElementów;

import java.util.Scanner;

public class exist {
    private static boolean checkExistence(int[] array, int number) {
        boolean result = false;

        for (int element : array) {
            if (element == number) {
                return true;
            }
        }
        return result;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Podaj liczbę elementów ");
        int size = scanner.nextInt();
        System.out.println("podaj szukaną liczbę: ");
        int number = scanner.nextInt();
        int[] array = new int[size];

        for (int i = 0; i < size; i++) {
            System.out.println("Podaj element nr " + i);
            array[i] = scanner.nextInt();
        }
        System.out.println("Jest element=" + checkExistence(array, number));

    }
}
