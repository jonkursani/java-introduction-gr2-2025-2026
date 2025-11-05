package java_04.ushtrime;

import java.util.Scanner;

public class Rezultati {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Ekipi vendas: ");
        String ekipiVendas = sc.nextLine();

        System.out.print("Ekipi musafir: ");
        String ekipiMusafir = sc.nextLine();

        System.out.print("Numri i tifozeve: ");
        int nrTifozeve = sc.nextInt(); // lexon numrin po jo edhe new line qe krijohet prej enter-it
        sc.nextLine(); // lexon new line ose enterin ne tastiere

        System.out.print("Fusha/Arena: ");
        String fusha = sc.nextLine();

        System.out.printf("Sa gola ka shenuar %s: ", ekipiVendas);
        int golaVendas = sc.nextInt();

        System.out.printf("Sa gola ka shenuar %s: ", ekipiMusafir);
        int golaMusafir = sc.nextInt();

        System.out.println("----------------------------------------------------------");
        System.out.println("Rezultati perfundimtar");
        System.out.printf("%s %d - %d %s%n", ekipiVendas, golaVendas, golaMusafir, ekipiMusafir);
        System.out.printf("Stadiumi %s me gjithsej %d spektatore prezent%n", fusha, nrTifozeve);
        System.out.println("----------------------------------------------------------");
    }
}