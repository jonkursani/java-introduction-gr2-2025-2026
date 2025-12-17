package java_10;

import java.util.Scanner;

public class DoWhileLoop {
    public static void main(String[] args) {
        int i = 1;
        do {
            System.out.print(i + " ");
            i++;
        } while (i <= 10);

        System.out.println();

        Scanner sc = new Scanner(System.in);
        int numri;
//        System.out.print("Shkruani numrin: ");
//        do {
//            numri = sc.nextInt();
//
//            if (numri <= 0) {
//                System.out.print("Pranojme vetem numra pozitiv: ");
//            }
//        } while (numri <= 0);
        do {
            System.out.print("Shkruani nje numer pozitiv: ");
            numri = sc.nextInt();
        } while (numri <= 0);

        // Numra edhe katrori i tyre
        int x = 1;
        do {
            System.out.printf("%d^2 = %d%n", x, (x * x));
            x++;
        } while (x <= 20);


    }
}