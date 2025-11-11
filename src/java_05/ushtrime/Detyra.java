package java_05.ushtrime;

import java.util.Scanner;

public class Detyra {
    public static void main(String[] args) {
        Scanner skaneri = new Scanner(System.in);

        // Ligji i dyte i Njutonit => F = m * a
//        System.out.print("Shkruani masen: ");
//        double m = skaneri.nextDouble();
//
//        System.out.print("Shkruani nxitimin (a): ");
//        double a = skaneri.nextDouble();
//
//        double f = m * a;
//        System.out.println("F = " + f);

        // Forca e gravitetit => F = m * g
        final double GRAVITY = 9.81;

        System.out.print("Shkruani mases: ");
        double m = skaneri.nextDouble();

        double f = m * GRAVITY;

        System.out.println("F = " + f);
    }
}