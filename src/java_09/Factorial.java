package java_09;

import java.util.Scanner;

public class Factorial {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Shkruani nje numer: ");
        int numri = sc.nextInt();

        int faktoriel = 1;

        for (int i = 1; i <= numri; i++) {
            // faktoriel = faktoriel * i;
            faktoriel *= i;
        }

        System.out.println("Faktorieli i numrit " + numri + " eshte: " + faktoriel);
    }
}