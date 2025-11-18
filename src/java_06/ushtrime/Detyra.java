package java_06.ushtrime;

import java.util.Scanner;

public class Detyra {
    public static void main(String[] args) {
        // Lexu ni vlere
        Scanner sc = new Scanner(System.in);

        System.out.print("Shkruaj numrin e pare: ");
        String nrPareText = sc.nextLine(); // "5"
        int nrPare = Integer.parseInt(nrPareText); // "5" => 5

        System.out.print("Shkruaj numrin e dyte: ");
        int nrDyte = Integer.parseInt(sc.nextLine());

        int shuma = nrPare + nrDyte;

        System.out.println("Shuma = " + shuma);

        System.out.print("Shkruaj nje numer ne e konvertojme ne tekst: ");
        int numri = sc.nextInt();
//        String numriText = numri + "";
        String numriText = String.valueOf(numri);
        System.out.println("Numri i konvertuar = " + numriText);
    }
}