package java_07;

import java.util.Scanner;

public class CompareChar {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Shkruaj nje simbol: ");
        char simboli = sc.nextLine().charAt(0);
        // 1 > 1
        // '1' > '1'
        int nrSimbolit = simboli; // '1' => 49

        System.out.println("Numri i simbolit: " + nrSimbolit);

        if (simboli >= '0' && simboli <= '9') {
            System.out.println("Simboli eshte numer");
        } else if (simboli >= 'A' && simboli <= 'Z') {
            System.out.println("Simboli eshte shkronje e madhe");
        } else if (simboli >= 'a' && simboli <= 'z') {
            System.out.println("Simboli eshte shkronje e vogel");
        } else {
            System.out.println("Simboli nuk ekziston");
        }
    }
}