package java_05.ushtrime;

import java.util.Scanner;

public class BeriTima {
    public static void main(String[] args) {
        // 1 euro => 100 cent => 2 euro => 200 cent => 3 => 300 cent
        // euro * 100 => cent 4 euro e 50 cent = 450 cent

        Scanner sc = new Scanner(System.in);
        System.out.print("Shkruani sa euro keni: ");
        int euro = sc.nextInt();

        System.out.print("Shkruani sa cent keni: ");
        int cent = sc.nextInt();

        int parate = (euro * 100) + cent;

        System.out.println("5 euro: " + (parate / 500));
        // 500 / 500 => 1
        // 500 % 500 => 0
        parate = parate % 500;

        // 450 / 500 => 0
        // 450 % 500 => 450

        System.out.println("2 euro: " + (parate / 200));
        parate = parate % 200;

        // 450 / 200 => 2
        // 450 % 200 => 50

        System.out.println("1 euro: " + (parate / 100));
        parate = parate % 100;

        System.out.println("50 cent: " + (parate / 50));
        parate = parate % 50;

        System.out.println("20 cent: " + (parate / 20));
        parate = parate % 20;

        System.out.println("10 cent: " + (parate / 10));
        parate = parate % 10;

        System.out.println("5 cent: " + (parate / 5));
        parate = parate % 5;

        System.out.println("2 cent: " + (parate / 2));
        parate = parate % 2;

        System.out.println("1 cent: " + parate);
    }
}