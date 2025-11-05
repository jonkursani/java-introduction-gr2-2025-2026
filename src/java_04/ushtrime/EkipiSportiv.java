package java_04.ushtrime;

import java.util.Scanner;

public class EkipiSportiv {
    public static void main(String[] args) {
        Scanner skaneri = new Scanner(System.in);

//        System.out.print("Zgjedhni ekipin e preferuar: ");
//        String ekipiPreferuar = skaneri.nextLine();
//        System.out.println("Ju keni zgjedhur: " + ekipiPreferuar);

        System.out.print("Sa gola i ka dhene Kosova: ");
        int golaKosova = skaneri.nextInt();
        System.out.print("Sa gola i ka dhe Shqiperia: ");
        int golaShqiperia = skaneri.nextInt();
        System.out.println("============================");
        System.out.printf("Kosova - Shqiperia %d : %d%n", golaKosova, golaShqiperia);
        System.out.println("============================");
    }
}