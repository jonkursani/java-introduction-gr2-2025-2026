package java_07;

public class IfExample {
    public static void main(String[] args) {
        // if (kushti => false/true) {
        //       // nese rezulati i kushtit eshte true
        //       ekzekutohet logjika brenda kllapave
        // }

        if (true) {
            System.out.println("Teksti brenda if-it");
        }

        if (false) {
            System.out.println("Teksti brenda if-it");
        }

        // int x = 5;
        int x = -5;

        if (x > 0) { // 5 > 0 => true
            System.out.println("5 eshte numer pozitiv");
        }

        if (x < 0) {
            System.out.println("-5 eshte numer negativ");
        }
    }
}