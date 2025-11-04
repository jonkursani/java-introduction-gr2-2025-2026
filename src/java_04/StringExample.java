package java_04;

public class StringExample {
    public static void main(String[] args) {
        String numri7 = "7";
        int numri1 = 1;
        System.out.println("71?: " + (numri7 + numri1)); // 71, jo 8 nuk mbledhen

        // Stringu nuk eshte tip primitiv eshte tip complex apo klase ju krijoni objekte te kesaj klase
        char A = 'A';
        char B = 'B';
        String AB = "AB";

        String text = "Ky eshte nje tekst";

        System.out.println("Gjatesia e tekstit eshte: " + text.length());
        // ma jep shkronjen ne indeksin 0 => K
        System.out.println("Shkronja e pare e tekstit eshte: " + text.charAt(0));
        System.out.println("Shkronja e fundit e tekstit eshte: " + text.charAt(17));
        int gjatesiaETekstit = text.length(); // 18
        int indeksiIFunditITekstit = gjatesiaETekstit - 1;
        char shkronjaEFundit = text.charAt(indeksiIFunditITekstit);
        System.out.println("Shkronja e fundit e tekstit eshte: " + shkronjaEFundit);
    }
}