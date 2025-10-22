package java_02;

public class Main {
    public static void main(String[] args) {
        // Single line koment
        /*
            Multi
            line
            komenti
         */

//        System.out.println("Hello from Java");System.out.println("Teksti tjeter");System.out.println("Teksti tjeter");

        System.out.println("Hello from Java");
//        System.out.println("Teksti tjeter");

        // ctrl + alt + l => shkurtesa per formatim te kodit
        // ctrl + / => komentoni komplet rreshtin
        // sout => Shkurtesa per System.out.println()

        // println()
        System.out.println("Shkurtesa sout");
        System.out.println("Kursori ne rreshtin tjeter");

        // print()
        System.out.print("Metoda print()");
        System.out.print("Kursori ne rreshtin e njejte");
        System.out.print("Rreshti i njejte");
        System.out.println("Rreshti tjeter");
        System.out.println("Rreshti tjeter ne rreshtin e ri");

        // printf()
        String emri = "Filane";
        int mosha = 18;

        System.out.println("Une quhem Jon dhe jam 20 vjecar");
        System.out.println("Une quhem " + emri + " dhe jam " + mosha + " vjecare");
        // souf => Shkurtesa per printf()
        // kursorin e len ne rreshtin e njejte si print()
        System.out.printf("Une quhem %s dhe jam %d vjecare%n", emri, mosha);

        // Formatimi i numrave te plote %d
        System.out.printf("Numri eshte: %d%n", 45);
        System.out.printf("Numri eshte: %5d%n", 50); // miminum 5 numra 5 digits => ___50
        System.out.printf("Numri eshte: %05d%n", 50); // => 00050
        System.out.printf("Numri eshte: %5d%n", 512345);

        // Formatimi i numrave me presje dhjetore floating point
        System.out.printf("Numri eshte: %f%n", 3.141592653589793);
        System.out.printf("Numri eshte: %.2f%n", 3.141592653589793);

        // Formatimi i tekstit
        System.out.printf("Hello, %s%n", "Alice");
        System.out.printf("Hello, %S%n", "JOhn");

        // Formatimi i karaktereve
        System.out.printf("Laptop price is 250%s%n", "$USD"); // tu perdor string
        System.out.printf("Laptop price is 250%c%n", '$'); // tu perdor char

        // Vendosja e tekstit
        System.out.printf("|%8s|%n", "Java");
        System.out.printf("|%-8s|%n", "C#");

        // Kombinimi i formatimit
        System.out.printf("%s price is %.2f%c.%n", "Phone", 550.30, '$');

        // Vlerat true false, e vertete e pavervete boolean values
        System.out.printf("A jam student: %b%n", true);
        System.out.printf("A jam student: %B%n", false); // FALSE
    }
}