package java_07.ushtrime;

import java.util.Scanner;

public class Nota {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Shkruani piket: ");
        int piket = sc.nextInt();

        if (piket >= 0 && piket < 50) {
            System.out.println("Nota 5");
        } else if (piket >= 50 && piket < 60) {
            System.out.println("Nota 6");
        } else if (piket >= 60 && piket < 70) {
            System.out.println("Nota 7");
        } else if (piket >= 70 && piket < 80) {
            System.out.println("Nota 8");
        } else if (piket >= 80 && piket < 90) {
            System.out.println("Nota 9");
        } else if (piket >= 90 && piket <= 100) {
            System.out.println("Nota 10");
        } else {
            System.out.println("Piket e lejuara jane prej 0 deri 100");
        }
    }
}