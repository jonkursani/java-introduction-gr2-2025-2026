package java_08.ushtrime;

import java.util.Scanner;

public class UshtrimeTest {
    public static void main(String[] args) {
        int x = 10;

        if (x > 0) {
            System.out.println("Numri pozitiv");
        } else if (x < 0) {
            System.out.println("Numri negativ");
        } else {
            System.out.println("Numri eshte zero");
        }

        int mosha = 13;

        if (mosha < 13) {
            System.out.println("Femije");
        } else if (mosha >= 13 && mosha <= 17) {
            System.out.println("Adoleshent");
        } else if (mosha >= 18) {
            System.out.println("I rritur");
        } else {
            System.out.println("Mosha jo valide");
        }

        String res = (mosha < 13) ? "Femije" :
                (mosha >= 13 && mosha <= 17) ? "Adoleshent" :
                        (mosha >= 18) ? "I rritur" : "Mosha jo valide";

        if (mosha > 18) {
            System.out.println("Lejohet hyrja");
        } else {
            System.out.println("Nuk lejohet hyrja");
        }

        // () ? T : F
        String result = (mosha > 18) ? "Lejohet" : "Nuk lejohet";
        System.out.println(result);

        System.out.printf("%-8s   %s%n", "Emri", "Nota");
        System.out.printf("%-8s   %d%n", "Jon", 8);
        System.out.printf("%-8s   %d%n", "Mentor", 10);

        int num = 2;
        switch (num) {
            case 1:
                System.out.println("1 - Programim");
                break;
            case 2:
                System.out.println("2 - Rrjeta");
                break;
            case 3:
                System.out.println("3 - Algoritme");
                break;
            case 4:
                System.out.println("4 - Siguri");
                break;
            default:
                System.out.println("Numri jo valid");
                break;
        }

        // enhanced switch
        switch (num) {
            case 1 -> {
                System.out.println("1 - Programim");
                System.out.println("Rreshti tjeter");
            }
            case 2 -> System.out.println("2 - Rrjeta");
            case 3 -> System.out.println("3 - Algoritme");
            case 4 -> System.out.println("4 - Siguri");
            default -> System.out.println("Numri jo valid");
        }

        Scanner sc = new Scanner(System.in);

        System.out.print("Shkruani emrin: ");
        String emri = sc.nextLine();

        System.out.print("Shkruni moshen: ");
        int m = sc.nextInt();

        System.out.printf("Pershendetje %s, ti je %d vjec%n", emri, m);
    }
}
