package suma;

import java.util.ArrayList;
import java.util.Scanner;

public class Suma {
    public static void main(String[] args) {


        Scanner scanner = new Scanner(System.in);
        System.out.println("Podaj liczbę elementów ");
        int size = scanner.nextInt();
        ArrayList<Integer> array = new ArrayList(size);

        for (int i=0; i<size; i++){
            System.out.println("Podaj element nr "+i);
            array.add(scanner.nextInt());
        }
        System.out.println("Suma = "+ getArraySum(array));

    }
    public static int getArraySum(ArrayList<Integer> array) {
        int result = 0;
        for (int i = 0;i<array.size();i++){
            result += array.get(i);

        }return result;
    }

}
