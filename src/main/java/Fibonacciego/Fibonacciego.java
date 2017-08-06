package Fibonacciego;

import java.util.Scanner;

public class Fibonacciego {
    public static void main(String[] args) {
        Scanner myScanner = new Scanner(System.in);
        int n;

        System.out.println("Podaj liczbę");
        n = myScanner.nextInt();

        System.out.println("Wartość silni: "+ fibonacciego(n));

    }
    public static int fibonacciego (int n) {

        if (n<=2){
            return 1;
        }
        else {
            return fibonacciego(n-2)+fibonacciego (n-1);
        }
    }
}