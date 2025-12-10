package java_09;

public class ForLoop {
    public static void main(String[] args) {
        // 1 - 10
        for (int i = 1; i <= 10; i++) {
            System.out.println("i: " + i);
        }

        // 10 - 1
        for (int i = 10; i >= 1; i--) { // i = i - 1
            System.out.print(i + " ");
        }

        System.out.println();

        // A - Z
        for (char a = 'A'; a <= 'Z'; a++) {
            System.out.print(a + " ");
        }

        System.out.println();

        // Z - A
        for (char z = 'Z'; z >= 'A'; z--) {
            System.out.print(z + " ");
        }

        System.out.println();

        for (int i = 10; i >= 1; i -= 2) { // i = i - 2
            System.out.print(i + " ");
        }

        System.out.println();

        String emri = "Leart";
        System.out.println(emri);

//        for (int i = 0; i <= emri.length() - 1)
        for (int i = 0; i < emri.length(); i++) {
            // System.out.print(i + " ");
            System.out.print(emri.charAt(i) + " ");
        }

        System.out.println();

        for (int i = emri.length() - 1; i >= 0; i--) {
            System.out.print(emri.charAt(i) + " ");
        }
    }
}