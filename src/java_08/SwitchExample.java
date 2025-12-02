package java_08;

import java.util.Scanner;

public class SwitchExample {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Shkruani nje numer prej 1-7: ");
        int numri = sc.nextInt();

//        if (numri == 1) {
//            System.out.println("E hane");
//        } else if (numri == 2) {
//            System.out.println("E marte");
//        } else if (numri == 3) {
//            System.out.println("E merkure");
//        } // ....
//        else {
//            System.out.println("Numri gabim");
//        }

        switch (numri) {
            case 1: // numri == 1
                System.out.println("E hane");
                break;
            case 2:
                System.out.println("E marte");
                break;
            case 3:
                System.out.println("E merkure");
                break;
            case 4:
                System.out.println("E enjte");
                break;
            case 5:
                System.out.println("E premte");
                break;
            case 6:
                System.out.println("E shtune");
                break;
            case 7:
                System.out.println("E diel");
                break;
            default:
                System.out.println("Numri gabim");
                break;
        }

        // enhanced switch
        switch (numri) {
            case 1 -> {
                System.out.println("E hane");
                System.out.println("Rreshti tjeter");
            }
            case 2 -> System.out.println("E marte");
            case 3 -> System.out.println("E merkure");
            case 4 -> System.out.println("E enjte");
            case 5 -> System.out.println("E premte");
            case 6 -> System.out.println("E shtune");
            case 7 -> System.out.println("E diel");
            default -> System.out.println("Numri gabim");
        }

        int x = 2;

        switch (x) {
//            case 1: // nese vlera osht 1 ose 2
//            case 2:
            case 1, 2:
                System.out.println(x);
                break;
            case 3:
                System.out.println(3);
                break;
            default:
                System.out.println("Numer tjeter");
                break;
        }

        switch (x) {
            case 1, 2 -> System.out.println(x);
            case 3 -> System.out.println(3);
            default -> System.out.println("Numer tjeter");
        }
        // notepad.pw/hyrjegr2

        String emri = "JoN";

        switch (emri) {
            case "Jon":
                System.out.println("Emri eshte Jon");
                break;
            case "Leart":
                System.out.println("Emri eshte Leart");
                break;
            case "Nush":
                System.out.println("Emri eshte Nush");
                break;
            default:
                System.out.println("Emri nuk ekziston");
                break;
        }

        switch (emri.toUpperCase()) {
            case "JON" -> System.out.println("Emri eshte Jon");
            case "LEART" -> System.out.println("Emri eshte Leart");
            case "NUSH" -> System.out.println("Emri eshte Nush");
            default -> System.out.println("Emri nuk ekziston");
        }
    }
}