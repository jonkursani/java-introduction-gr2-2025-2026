package java_05;

public class ConvertCastExample {
    public static void main(String[] args) {
        // Konvertimi implicit ose automatic
        // konvertimi eksplicit ose manual tu i perdor wrapper klasat

        byte a = 100; // a = 100 => byte
        int b = a; // b = 100 => int (konvertimi implicit) byte => int
        System.out.println("B = " + b); // "B = 100" int => String

        // Konvertimi eksplicit tu i perdor wrapper klasat
        byte c = 50;
        // String cText = c + ""; // "50"
        String cText = String.valueOf(c); // "50"
        int cInt = Integer.parseInt(cText); // 50
        double cDouble = Double.parseDouble(cText); // 50.0
        short cShort = Short.parseShort(cText); // 50

        // Kastimi - Casting
        // DataType emri = (DataType) emri;
        // int d = 2.765; // error
        int d = (int) 2.765; // 2 prej double ne int

        int e = 30;
        // int t = (int) e; // 30 int
        byte t = (byte) e; // -128 / 127 => 30 te tipit byte


    }
}