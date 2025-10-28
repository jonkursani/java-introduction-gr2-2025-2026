package java_03;

public class DataTypes {
    public static void main(String[] args) {
        // byte
        // range: -128 -> 127
        // size: 8 bit -> 1 byte

        // Hapi 1 -> data tipi (tipi i te dhenave)
        // Hapi 2 -> emri i variables
        // Hapi 3 -> vlera e variables
        byte myByte = 100; // deklarimi dhe inicializimi
        byte b; // deklarimi
        b = 50; // inicializimi
        byte ditetEJaves = 7;
        System.out.println("Byte: " + myByte);
        System.out.println("Ditet e javes: " + ditetEJaves);
//        byte vleraGabim = 200; // vlera jashte rangut te byte

        // short
        // range: -32768 -> 32767
        // size: 16 bit -> 2 byte
        short myShort = 10000;
        short currentYear = 2025;
        System.out.println("Short: " + myShort);
        System.out.println("Viti aktual: " + currentYear);

        // int
        // range: -2^31 -> 2^31 - 1
        // size: 32 bit -> 4 byte
        int myInt = 123456;
        int numriIPopullsise = 1700000;
        System.out.println("Int: " + myInt);
        System.out.println("Numri i popullsise: " + numriIPopullsise);

        // long
        // range: -2^63 -> 2^63 - 1
        // size: 64 bit -> 8 byte
        // prefix L => long
        long myLong = 1234567890123456789L;
        long distanceToSun = 149600000000L;
        System.out.println("Long: " + myLong);
        System.out.println("Distanca deri te dielli: " + distanceToSun);

        // float
        // range: -3.4028235E+38 -> 3.4028235E+38
        // size: 32 bit -> 4 byte
        // prefix F => float
        float myFloat = 1234.123F;
        float highTemp = 18.5F;
        System.out.println("Float: " + myFloat);
        System.out.println("High temp: " + highTemp);

        // double
        // range: -1.7976931348623157E+308 -> 1.7976931348623157E+308
        // size: 64 bit -> 8 byte
        double myDouble = 1234567.12345;
        double pi = 3.141592653589793;
        System.out.println("Double: " + myDouble);
        System.out.println("Pi: " + pi);

        // char
        // range: 0 -> 65535
        // size: 16 bit -> 2 byte
        char letterA = 'A';
        char dollarSymbol = '$';
        char letterAAscii = 65;
        int letterNumber = letterA; // na kthen numer, numrin e shkronjes A ne tablen ASCII
//        char smiley = '\u263A'; // unicode per emoji smiley -> alt + enter
        char smiley = '☺';
        System.out.println("Shkronja A: " + letterA);
        System.out.println("Shkronja A ne tablen ASCII: " + letterNumber);
        System.out.println("Smiley: " + smiley);

        // boolean
        // range: true -> false
        boolean myBoolean = false;
        boolean isStudent = true;
        short piket = 80;
        boolean kaKaluarProvimin = (piket > 50);
        System.out.println("Boolean: " + myBoolean);
        System.out.println("A eshte student: " + isStudent);
        System.out.println("Ka kaluar provimin: " + kaKaluarProvimin);

        // String literals
        System.out.println("\'Apostrof'");
        System.out.println("\"Thojzat\"");
        System.out.println("\\Backslash\\");
        System.out.println("Rreshti \ni ri");
        System.out.println("\tTab");
        System.out.println("Backspace \btest");
    }
}