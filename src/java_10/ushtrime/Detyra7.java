package java_10.ushtrime;

public class Detyra7 {
    public static void main(String[] args) {
        // kimik => palindrom
        String fjala = "kimik"; // kimiki != ikimik

        String fjalaERe = "";

        for (int i = fjala.length() - 1; i >= 0; i--) {
            System.out.print(fjala.charAt(i) + " ");
            // fjalaERe = fjalaERe + fjala.charAt(i);
            fjalaERe += fjala.charAt(i);
        }

        System.out.println();

        if (fjala.equalsIgnoreCase(fjalaERe)) {
            System.out.println("Fjala eshte palindrom");
        } else {
            System.out.println("Fjala nuk eshte palindrom");
        }
    }
}