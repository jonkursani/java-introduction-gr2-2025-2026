package java_08;

public class CompareStrings {
    public static void main(String[] args) {
        // 1 == 1
        // tipet komplekse si String, vlerat nuk krahasohen me ==

        String emri1 = "Jon";
        String emri2 = "JoN";
        // String emri2 = "Jon";

        // if (emri1 == emri2)

        if (emri1.equals(emri2)) {
            System.out.println("Emri 1 eshte i njejte me emrin 2");
        } else {
            System.out.println("Emri 1 nuk eshte i njejte me emrin 2");
        }

        // emri1 => jon
        // emri2 => jon
        // jon == jon
        if (emri1.toLowerCase().equals(emri2.toLowerCase())) {
            System.out.println("Emrat jane te njejte");
        } else {
            System.out.println("Emrat nuk jane te njejte");
        }

        if (emri1.equalsIgnoreCase(emri2)) {
            System.out.println("Emrat jane te njejte");
        } else {
            System.out.println("Emrat nuk jane te njejte");
        }

        // compareTo
        // emri1 = emri2 => 0
        // emri1 < emri2 => < 0
        // emr1 > emri2 => > 0
        if (emri1.compareTo(emri2) == 0) {
            System.out.println("Emrat jane te njejte");
        } else if (emri1.compareTo(emri2) < 0) {
            System.out.println("Emri 1 vjen para emrit 2");
        } else if (emri1.compareTo(emri2) > 0) {
            System.out.println("Emri 2 vjen para emrit 1");
        }
    }
}