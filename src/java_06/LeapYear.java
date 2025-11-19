package java_06;

import java.util.Scanner;

public class LeapYear {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Shkruani vitin: ");
        int viti = sc.nextInt();

        boolean isLeapYear;

        isLeapYear = (viti % 4 == 0) && (viti % 100 != 0);
        isLeapYear = isLeapYear || (viti % 400 == 0);
        // isLeapYear = ((viti % 4 == 0) && (viti % 100 != 0)) || (viti % 400 == 0);

        System.out.println("Vit i brisht: " + isLeapYear);
    }
}