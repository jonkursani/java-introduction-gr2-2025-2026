package java_05.ushtrime;

import java.util.Scanner;

public class Trekendeshi {
    public static void main(String[] args) {
        Scanner skaneri = new Scanner(System.in);

        // Hipotenuze = c = Sqrt(a^2 + b^2)

        System.out.print("Shkruani kateten a: ");
        int a = skaneri.nextInt();

        System.out.print("Shkruani kateten b: ");
        int b = skaneri.nextInt();

//        double h = Math.sqrt((a * a) + (b * b));
        double h = Math.sqrt(Math.pow(a, 2) + Math.pow(b, 2));

        System.out.println("Hipotenuza eshte: " + h);
    }
}