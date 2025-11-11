package java_05;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.util.GregorianCalendar;

public class DateTimeExample {
    public static void main(String[] args) {
        // Daten dhe oren prej sistemit operativ e marrim duke i perdor dy klasa
        // LocalDate => daten aktuale te sistemit
        // LocalDateTime => daten dhe oren aktuale te sistemit
        LocalDate data = LocalDate.now();
        System.out.println("Data aktuale eshte: " + data);
        System.out.println("Viti aktual eshte: " + data.getYear());

        LocalDateTime dataDheOra = LocalDateTime.now();
        System.out.println("Data dhe ora aktuale eshte: " + dataDheOra);

        GregorianCalendar gregorianCalendar = new GregorianCalendar();
        System.out.println("Data dhe ora sipas kalendarit: " + gregorianCalendar.getTime());
        System.out.println("Timezone: " + gregorianCalendar.getTimeZone());
    }
}