package java_04;

import java.util.Scanner;

public class ScannerExample {
    // maina
    public static void main(String[] args) {
        // System.in => input prej tastieres (keyboard)
        Scanner scanner = new Scanner(System.in);

//        System.out.println("Shkruani nje tekst: ");
////        String text = "Teksti";
//        String userInput = scanner.nextLine(); // lexon String
//        System.out.println("Ju keni shkruar: " + userInput);

//        while (true) {
//            System.out.println("Shkruani nje tekst: ");
//            String input = scanner.nextLine();
//            System.out.println("Ju keni shkruar: " + input);
//
//            if (input.equals("ndalo")) {
//                break;
//            }
//        }

//        System.out.println("Shkruani emrin: ");
        System.out.print("Shkruani emrin: ");
        String emri = scanner.nextLine(); // lexon String

        System.out.print("Shkruani mbiemrin: ");
        String mbiemri = scanner.nextLine(); // lexon String

        System.out.print("Shkruani moshen: ");
        int mosha = scanner.nextInt(); // lexon int

        System.out.print("Shkruani gjatesine: ");
        float gjatesia = scanner.nextFloat(); // lexon float

        System.out.print("A jeni student? (true/false): ");
        boolean eshteStudent = scanner.nextBoolean();

        System.out.println("============= Studenti ==============");
        System.out.println("Emri: " + emri);
        System.out.println("Mbiemri: " + mbiemri);
        System.out.println("Mosha: " + mosha);
        System.out.println("Gjatesia: " + gjatesia);
        System.out.println("Eshte student: " + eshteStudent);
    }
}