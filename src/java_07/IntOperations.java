package java_07;

import java.util.Scanner;

public class IntOperations {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Shkruaj numrin e pare: ");
        int nr1 = sc.nextInt();

        System.out.print("Shkruaj numrin e dyte: ");
        int nr2 = sc.nextInt();

        int shuma = nr1 + nr2;
        System.out.println("Shuma: " + shuma);

        System.out.println("Ndryshimi: " + (nr1 - nr2));

        System.out.println("Prodhimi: " + (nr1 * nr2));

        // te pjestimi e validojme nese nr2 == 0
        if (nr2 == 0) {
            System.out.println("Nuk mund te pjestoni me 0");
        } else {
            System.out.println("Heresi: " + (nr1 / nr2));
        }

        // mbetja
        if (nr2 != 0) {
            System.out.println("Mbetja: " + (nr1 % nr2));
        } else {
            System.out.println("Nuk mund te pjestoni me 0");
        }
    }
}