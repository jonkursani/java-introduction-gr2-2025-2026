package java_10.ushtrime;

import java.util.Scanner;

public class Detyra1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Shkruani numrin e rreshtave: ");
        int rreshtat = sc.nextInt();

        // for-i i pare ec neper rreshta
        for (int i = 1; i <= rreshtat; i++) {
            // for-i i dyte ec neper kolona
            for (int j = 1; j <= 10; j++) {
                System.out.print("*"); // 10x * ne nje rresht
            }
            System.out.println(); // kalo në rreshtin tjeter
        }
    }
}