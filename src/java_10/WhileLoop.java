package java_10;

import java.util.Scanner;

public class WhileLoop {
    public static void main(String[] args) {
        for (int i = 1; i <= 10; i++) {
            System.out.print(i + " ");
        }

        System.out.println();

        int i = 1;
        while (i <= 10) {
            System.out.print(i + " ");
            i++;
            // i = i + 1;
        }

        System.out.println();

        for (i = 1; i <= 10; i++) {
            System.out.print(i + " ");
        }

        System.out.println();

        // Average
        int sum = 0, counter = 0;
//        while (counter < 10) {
//            counter++;
////            sum = sum + counter;
//            sum += counter;
//        }
        Scanner sc = new Scanner(System.in);
        System.out.print("Shkruani noten (0 - per tu ndalur): ");

        while (!sc.hasNextInt()) {
            System.out.print("Input gabim nota duhet te jete numer: ");
            sc.next();
        }

        int numri = sc.nextInt();
//        System.out.println("Nota: " + numri);

        final int SENTINEL = 0;
        while (numri != SENTINEL) {
            counter++;
            sum += numri;
            System.out.print("Shkruani noten (0 - per tu ndalur): ");
            while (!sc.hasNextInt()) {
                System.out.print("Input gabim nota duhet te jete numer: ");
                sc.next();
            }
            numri = sc.nextInt();
        }

        double average = (double) sum / counter;
        System.out.println("Average: " + average);

        // Numrat dhe katrori i tyre
        int nr = 1;
        while (nr <= 50) {
            System.out.printf("%d^2 = %d%n", nr, (nr * nr));
            nr++;
        }

        System.out.println();

        // Numrat cift prej 2 deri ne N
        System.out.print("Shkruani rangun: ");
        while (!sc.hasNextInt()) {
            System.out.print("Input gabim rangu duhet te jete numer: ");
            sc.next();
        }

        int rangu = sc.nextInt();
        int c = 2;
        while (c <= rangu) {
//            if (c % 2 == 0)
//                System.out.print(c + " ");
//
//            c++;

            System.out.print(c + " ");
            c += 2;
        }

        System.out.println();

        // Shkronjat pre A deri ne Z
        char A = 'A';
        while (A <= 'Z') {
            System.out.print(A + " ");
            A++;
        }

        System.out.println();

        for (A = 'Z'; A >= 'A'; A--) {
            System.out.print(A + " ");
        }

        System.out.println();









    }
}