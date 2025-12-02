package java_08;

import java.util.Scanner;

public class KalkulatoriSwitch {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Shkruani numrin e pare: ");
        int nr1 = Integer.parseInt(sc.nextLine());

        System.out.print("Shkruani numrin e dyte: ");
        int nr2 = Integer.parseInt(sc.nextLine());

        System.out.print("Shkruani operatorin (+,-,*,/,%): ");
        char operatori = sc.nextLine().charAt(0);

        switch (operatori) {
            case '+':
                System.out.println("Shuma: " + (nr1 + nr2));
                break;
            case '-':
                System.out.println("Ndryshimi: " + (nr1 - nr2));
                break;
            case '*':
                System.out.println("Prodhimi: " + (nr1 * nr2));
                break;
            case '/':
                if (nr2 == 0) {
                    System.out.println("Nuk mund te pjestoni me 0");
                } else {
                    System.out.println("Heresi: " + (nr1 / nr2));
                }
                break;
            case '%':
                if (nr2 != 0)
                    System.out.println("Mbetja: " + (nr1 % nr2));
                else
                    System.out.println("Nuk lejohet pjestimi (mbetja) me 0");
                break;
            default:
                System.out.println("Operatori gabim");
                break;
        }
    }
}
