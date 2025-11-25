package java_07;

public class TernaryOperator {
    public static void main(String[] args) {
        // operatori ternar
        // (kushti) ? true : false

        int x = 5;

//        if (x > 0) {
//            System.out.println("Numri eshte pozitiv");
//        } else {
//            System.out.println("Numri nuk eshte pozitiv");
//        }

        // String rezultati = (x > 0) ? "Numri eshte pozitiv" : "Numri nuk eshte pozitiv";
        String rezultati = (x > 0) ? "Numri nuk eshte pozitiv" : "Numri eshte pozitiv";

        if (x > 0) {
            System.out.println("Numri nuk eshte pozitiv");
        } else {
            System.out.println("Numri eshte pozitiv");
        }
        System.out.println(rezultati);

        if (x > 0) {
            System.out.println("Numri eshte pozitiv");
        } else if (x < 0) {
            System.out.println("Numri eshte negativ");
        } else {
            System.out.println("Numri eshte zero");
        }

        String resultati2 = (x > 0) ? "Numri eshte pozitiv" : (x < 0) ? "Numri eshte negativ" : "Numri eshte 0";
        System.out.println(resultati2);
    }
}
