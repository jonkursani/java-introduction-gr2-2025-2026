package java_10;

import java.util.Scanner;

public class ChatApp {
    public static void main(String[] args) {
        String personi1 = "";
        String personi2 = "";
        final String STOP = "ndalo";

        Scanner sc = new Scanner(System.in);

        while (!(personi1.equalsIgnoreCase(STOP) && personi2.equalsIgnoreCase(STOP))) { // while(false)
            System.out.print("Personi 1: ");
            personi1 = sc.nextLine();
            System.out.print("Personi 2: ");
            personi2 = sc.nextLine();
        }

        System.out.println("Biseda perfundoi...");
    }
}