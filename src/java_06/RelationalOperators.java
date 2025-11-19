package java_06;

public class RelationalOperators {
    public static void main(String[] args) {
        // Operatoret relacional
        // <, >, <=, >=, ==, !=
        // outupi eshte gjithmone nje shprehje boolean (true ose false)
        int a = 5;
        int b = 3;

        System.out.println("5 == 3: " + (a == b)); // false
        System.out.println("5 != 3: " + (a != b)); // true
        System.out.println("5 > 3: " + (a > b)); // true
        System.out.println("5 < 3: " + (a < b)); // false
        System.out.println("5 < 5: " + (5 < 5)); // false
        System.out.println("5 <= 5: " + (5 <= 5)); // true
        System.out.println("5 >= 3: " + (a >= b)); // true

//        while (true) {}
        int i = 1;
        boolean ndalo = i <= 10;
//        while (ndalo) {}
        while (i <= 10) {
            System.out.println("i: " + i);
            // i = i + 1;
            // i += 1;
            i++;
        }

        System.out.println("i: " + i);
    }
}