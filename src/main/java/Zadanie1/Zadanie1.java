package Zadanie1;

import java.util.Scanner;

public class Zadanie1 {
    public static void main(String[] args) {
        Scanner myScanner = new Scanner(System.in);
        int x;

        System.out.println("Podaj liczbę");
        x = myScanner.nextInt();

        int wynik = getAbsolute(x);
        System.out.println("Wynik to: " + wynik);
    }

    public static int getAbsolute (int x) {
        int wynik;


        if (x >= 0) {
            wynik = x;
        } else {
            wynik = x * -1;

        }
        return wynik;
    }
}

