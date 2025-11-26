package java_07.ushtrime;

import java.util.Scanner;

public class Rangu {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Shkruani ne numer ne rangun -10,000 / 10,000: ");
        int numri = sc.nextInt();

        if (numri >= -10000 && numri <= 10000) {
            System.out.println("Numri eshte brenda rangut: " + numri);
        } else {
            System.out.println("Numri nuk eshte branda rangut: " + numri);
        }
    }
}