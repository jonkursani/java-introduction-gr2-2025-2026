package java_07;

import java.util.Scanner;

public class SortNumbers {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Shkruani numrin e pare: ");
        int nr1 = sc.nextInt();

        System.out.print("Shkruani numrin e dyte: ");
        int nr2 = sc.nextInt();

        // nese nr1 > nr2 atehere duhet me ja ndrru vendet
        if (nr1 > nr2) {
            int temp = nr1;
            nr1 = nr2;
            nr2 = temp;
        }

        System.out.println("Numri i pare: " + nr1);
        System.out.println("Numri i dyte: " + nr2);
    }
}