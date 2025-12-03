package java_08;

public class StringExample {
    public static void main(String[] args) {
        // String methods => metodat e stringut

        String fjalia = "Javen tjeter kemi test ne lenden hyrje ne programim";

        // charAt(parameter)
        System.out.println("charAt(0): " + fjalia.charAt(0));

        // length()
        System.out.println("Gjatesia e kesaj fjalie eshte: " + fjalia.length());

        // format()
        System.out.println("format(): " + String.format("%s %S", "Emri", "Mbiemri"));

        // substring()
        // substring(startIndex) => prejt indeksit deri te fundi
        // substring(startIndex, endIndex) => prej indeksit te fillimit tu e perfshi po tu mos e perfshi indeksin e fundit
        System.out.println("substring(6): " + fjalia.substring(6));
        System.out.println("substring(0,4): " + fjalia.substring(0, 5));

        // contains() => true ose false
        System.out.println("contains(\"hyrje\"): " + fjalia.contains("hyrje")); // true
        System.out.println("contains(\"siguri\"): " + fjalia.contains("siguri")); // false

        // join()
        System.out.println("join(): " + String.join(" - ", "Emri", "Mbiemri", "Mosha"));

        // equals(), equalsIgnoreCase()
        System.out.println("equals(): " + "Jon".equals("Mentor")); // false
        System.out.println("equalsIgnoreCase(): " + "Jon".equalsIgnoreCase("JON")); // true

        // isEmpty(), isBlank()
        System.out.println("isEmpty(): " + " ".isEmpty()); // false
        System.out.println("isBlank(): " + " ".isBlank()); // true
        System.out.println("isEmpty(): " + " J".isEmpty()); // false
        System.out.println("isBlank(): " + " J".isBlank()); // false

        // trim()
        System.out.println("isEmpty(), trim(): " + " ".trim().isEmpty()); // true
        System.out.println("trim(): " + "   Jon   ".trim()); // "Jon"

        // concat()
        String emri = "Jon ";
        System.out.println("concat(): " + "Jon ".concat("Mentor"));
        System.out.println("concat(): " + emri.concat("Mentor"));

        // replace()
        System.out.println("replace(): " + fjalia.replace("test", "provim"));

        // split() => ne ni array me disa elemente [0, 1, 2]
        System.out.println("split(' '): " + fjalia.split(" ")[0]); // ["Javen", "tjeter", "kemi"] => "Javen"
        System.out.println("1,2,3: " + "1,2,3".split(",")[1]); // ["1", "2", "3"] => "2"

        // indexOf(shkronja)
        System.out.println("indexOf(J): " + fjalia.indexOf("J"));
        System.out.println("indexIf(j, 5): " + fjalia.indexOf("j", 5));

        // toLowerCase(), toUpperCase()
        System.out.println("toLowerCase(): " + fjalia.toLowerCase());
        System.out.println("toUpperCase(): " + fjalia.toUpperCase());

        // valueOf() => parson vleren ne String
        System.out.println("valueOf(): " + String.valueOf(123)); // "123"

        // repeat()
        System.out.println("repeat(): " + "Msoni ma shume te shpija".repeat(5));

        // startsWith(), endsWith()
        System.out.println("startsWith(J): " + fjalia.startsWith("J")); // true ose false
        System.out.println("endsWith(im): " + fjalia.endsWith("im")); // true ose false
    }
}