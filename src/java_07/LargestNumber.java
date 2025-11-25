package java_07;

import java.util.Scanner;

public class LargestNumber {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Shkruani numrin e pare: ");
        int nr1 = sc.nextInt();

        System.out.print("Shkruani numrin e dyte: ");
        int nr2 = sc.nextInt();

        System.out.print("Shkruani numrin e trete: ");
        int nr3 = sc.nextInt();

        int numriMeIMadh;

        // nested if-else
        if (nr1 >= nr2) {
            if (nr1 >= nr3) {
                numriMeIMadh = nr1; // numri1 numri ma i madh
            } else {
                numriMeIMadh = nr3;
            }
        } else {
            if (nr2 >= nr3) {
                numriMeIMadh = nr2;
            } else {
                numriMeIMadh = nr3;
            }
        }

        System.out.println("Numri me i madh eshte: " + numriMeIMadh);
    }
}