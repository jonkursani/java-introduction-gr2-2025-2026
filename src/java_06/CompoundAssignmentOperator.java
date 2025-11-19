package java_06;

public class CompoundAssignmentOperator {
    public static void main(String[] args) {
        int a = 1, b = 2, c = 3;

        a += 5; // a = a + 5 => 6
        b *= 4; // b = b * 4 => 8
        c += a * b; // c = c + a * b => 51
        c %= 6; // c = c % 6 => 8 * 6 = 48 => 51 - 48 => 3

        System.out.println("a = " + a);
        System.out.println("b = " + b);
        System.out.println("c = " + c);

        // Increment a++ ose ++a => a += 1 ose => a = a + 1;
        System.out.println("a = " + a); // 6
        // Post increment a++
        // maspari e printon vleren mandej e rrit per 1
        // qekjo rritja e vleres dallohet ne rreshtin e ri
        System.out.println("a++ " + a++); // 6++ => 7
        System.out.println("a = " + a); // 7
        // Pre increment
        // e rrit vleren mandej e printon ne te njejtin rresht
        System.out.println("++a " + ++a); // 8
        System.out.println("a = " + a); // 8

        // Decrement c-- ose --c => c -= 1 => c = c - 1;
        System.out.println("c = " + c); // 3
        // Post decrement c--
        // maspari e printon vleren mandej e zvogelon per 1 ne rreshtin e ri
        System.out.println("c-- " + c--); // 3-- => 2
        System.out.println("c = " + c); // 2
        // Pre decrement --c
        // se pari e zvoglon vleren per 1 mandej e printon
        System.out.println("--c " + --c); // 1
        System.out.println("c = " + c); // 1

        // Assignment operator
        int x, y, z;

//        x = 100;
//        y = 100;
//        z = 100;

//        z = 100;
//        y = z;
//        x = y;

//        x = y = z = 100;

        // error kodi lexohet prej djathtas ne te majte
//        x = y;
//        y = z;
//        z = 100;
    }
}