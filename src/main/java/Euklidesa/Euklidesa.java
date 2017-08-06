package Euklidesa;

import java.util.Scanner;

public class Euklidesa {
    public static void main(String[] args) {
        Scanner myScanner = new Scanner(System.in);
        int a;
        int b;

        System.out.println("Podaj liczbę");
        a = myScanner.nextInt();
        System.out.println("Podaj liczbę");
        b = myScanner.nextInt();

        System.out.println("= " +wynik(a,b));

    }
    public static int wynik (int a, int b) {

        while (a!=b){

            if (a<b){
                return b=b-a;
            }
            else {
                a=a-b;
            }
        }
        return a;
    }

}
