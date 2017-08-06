package Silnia;

import java.util.Scanner;

public class Silnia {
    public static void main(String[] args) {
        Scanner myScanner = new Scanner(System.in);
        int n;

        System.out.println("Podaj liczbę");
        n = myScanner.nextInt();

        System.out.println("Wartość silni: "+ silnia(n));

    }
    public static int silnia (int n) {

        if (n<=1){
            return 1;
        }
        else {
            return n*silnia(n-1);
        }
    }
}
