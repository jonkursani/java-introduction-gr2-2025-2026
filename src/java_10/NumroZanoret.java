package java_10;

import java.util.Scanner;

public class NumroZanoret {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        final String ZANORET = "aeiouy";
        final String SHENJAT = "!?$%#.,;";

        int nrZanore = 0, nrBashketingellore = 0, nrShenja = 0;

        String fjalia;
        do {
            System.out.print("Shkruani nje fjali: ");
            fjalia = sc.nextLine();
        } while (fjalia.isBlank());

        for (int i = 0; i < fjalia.length(); i++) {
            char simboli = fjalia.toLowerCase().charAt(i); // 's' => "s"
            // String simboliString = simboli + "";
            String simboliString = String.valueOf(simboli);

//            if (ZANORET.contains(simboliString)) {
//                nrZanore++;
//            } else if (SHENJAT.contains(simboliString)) {
//                nrShenja++;
//            } else {
//                nrBashketingellore++;
//            }

            if (ZANORET.contains(simboliString)) {
                nrZanore++;
            } else if (simboli >= 'a' && simboli <= 'z') {
                nrBashketingellore++;
            } else if (SHENJAT.contains(simboliString)) {
                nrShenja++;
            }
        }

        System.out.println("Zanore: " + nrZanore);
        System.out.println("Bashketingellore: " + nrBashketingellore);
        System.out.println("Shenja: " + nrShenja);
    }
}