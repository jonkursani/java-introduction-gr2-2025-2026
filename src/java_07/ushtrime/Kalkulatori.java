package java_07.ushtrime;

import java.util.Scanner;

public class Kalkulatori {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Shkruani numrin e pare: ");
        // int nr1 = sc.nextInt();
        int nr1 = Integer.parseInt(sc.nextLine()); // "1" => 1

        System.out.print("Shkruani numrin e dyte: ");
        int nr2 = Integer.parseInt(sc.nextLine());

        System.out.print("Shkruani operatorin (+,-,*,/,%): ");
        // String operatori = sc.nextLine(); // "+"
        char operatori = sc.nextLine().charAt(0); // '+'

        if (operatori == '+') {
            System.out.println("Mbledhja: " + (nr1 + nr2));
        } else if (operatori == '-') {
            System.out.println("Zbritja: " + (nr1 - nr2));
        } else if (operatori == '*') {
            System.out.println("Prodhimi: " + (nr1 * nr2));
        } else if (operatori == '/') {
            if (nr2 == 0) {
                System.out.println("Nuk lejohet pjestimi me 0");
            } else {
                System.out.println("Heresi: " + (nr1 / nr2));
            }
        } else if (operatori == '%') {
            if (nr2 != 0)
                System.out.println("Mbetja: " + (nr1 % nr2));
            else
                System.out.println("Nuk lejohet pjestimi (mbetja) me 0");
        } else {
            System.out.println("Operatori i gabuar, operatoret valid (+,-,*,/,%)");
        }
    }
}