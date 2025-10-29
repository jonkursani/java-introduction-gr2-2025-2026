package java_03.ushtrime;

public class Detyra2 {
    public static void main(String[] args) {
        // Menyra 1
//        String emri = "Filan";
//        String mbiemri = "Fisteku";

        // Menyra 2
//        String emri, mbiemri;
//        emri = "Filan";
//        mbiemri = "Fisteku";

        // Menyra 3
        String emri = "Filan", mbiemri = "Fisteku";
        // int mosha = 18;
        short mosha = 18;
        short vitiLindjes = 2005;
        float gjatesia = 1.80F;
        double distanca = 5.5; // 5.5km
        char gjinia = 'M';
        boolean jamStudent = (mosha > 17);

        System.out.printf("Une quhem %s %S.%n", emri, mbiemri);
        System.out.printf("Mosha ime eshte: %d.%n", mosha);
        System.out.printf("Viti i lindjes: %d.%n", vitiLindjes);
        System.out.printf("Gjatesia ime eshte: %.2f.%n", gjatesia);
        System.out.printf("Distanca nga shtepia ne cct: %.2f.%n", distanca);
        System.out.printf("Gjinia: %c.%n", gjinia);
        System.out.printf("Jam student: %b.%n", jamStudent);
    }
}