package java_04;

public class ArithmeticOperators {
    // maina
    public static void main(String[] args) {
//        double a = 10.0;
//        double b = 4.0;

        double a = 10.0, b = 4.0;
        double shuma = a + b;
        double ndryshimi = a - b;
        double prodhimi = a * b;
        double heresi = a / b;
        double mbetja = a % b;

        System.out.println("Shuma: " + shuma); // 14.0   "Shuma: " + 14.0
        System.out.println("Ndryshimi: " + ndryshimi); // 6.0
        System.out.println("Prodhimi: " + prodhimi); // 40.0
        System.out.println("Heresi: " + heresi); // 2.5
        System.out.println("Mbetja (Modulusi): " + mbetja); // 2.0
    }
}