package java_10.ushtrime;

import java.util.Scanner;

public class Detyra4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Shkruani numrin e rreshtave: ");
        int rreshtat = sc.nextInt();

        System.out.print("Shkruani numrin e kolonave: ");
        int kolonat = sc.nextInt();

        for (int i = 1; i <= rreshtat; i++) {
            for (int j = 0; j < kolonat; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }
}