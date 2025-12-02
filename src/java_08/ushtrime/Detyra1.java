package java_08.ushtrime;

import java.util.Scanner;

public class Detyra1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Shkruani nje numer 1 deri ne 5: ");
        int numri = sc.nextInt();

        switch (numri) {
            case 1 -> System.out.println("Keni klikuar tabin File");
            case 2 -> System.out.println("Keni klikuar tabin Edit");
            case 3 -> System.out.println("Keni klikuar tabin View");
            case 4 -> System.out.println("Keni klikuar tabin Helo");
            case 5 -> System.out.println("Keni klikuar tabin Tools");
            default -> System.out.println("Ky tab nuk ekziston");
        }
    }
}