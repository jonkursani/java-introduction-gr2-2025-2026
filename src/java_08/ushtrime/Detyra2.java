package java_08.ushtrime;

import java.util.Scanner;

public class Detyra2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Shkruani ekipin vendas: ");
        String ekipiVendas = sc.nextLine();

        System.out.print("Shkruani ekipin musafir: ");
        String ekipiMusafir = sc.nextLine();

        System.out.print("Jepni prognozen (1, X, 2): ");
        String prognoza = sc.nextLine();

        switch (prognoza) {
            case "1":
                System.out.printf("Prognoza ime per ndeshjen ne mes te %s dhe %s eshte se fiton %s",
                        ekipiVendas, ekipiMusafir, ekipiVendas);
                break;
            case "2":
                System.out.printf("Prognoza ime per ndeshjen ne mes te %s dhe %s eshte se fiton %s",
                        ekipiVendas, ekipiMusafir, ekipiMusafir);
                break;
            case "x", "X":
                System.out.printf("Prognoza ime per ndeshjen ne mes te %s dhe %s eshte se perfundon barazim",
                        ekipiVendas, ekipiMusafir);
                break;
            default:
                System.out.println("Prognoza gabim");
                break;
        }

        // enhanced switch
//        switch (prognoza) {
//            case "1" -> System.out.printf("Prognoza ime per ndeshjen ne mes te %s dhe %s eshte se fiton %s",
//                    ekipiVendas, ekipiMusafir, ekipiVendas);
//            case "2" -> System.out.printf("Prognoza ime per ndeshjen ne mes te %s dhe %s eshte se fiton %s",
//                    ekipiVendas, ekipiMusafir, ekipiMusafir);
//            case "x", "X" -> System.out.printf("Prognoza ime per ndeshjen ne mes te %s dhe %s eshte se perfundon barazim",
//                    ekipiVendas, ekipiMusafir);
//            default -> System.out.println("Prognoza gabim");
//        }
    }
}
