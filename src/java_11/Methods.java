package java_11;

import java.util.Scanner;

public class Methods {
    public static void main(String[] args) {
//        Scanner sc = new Scanner(System.in);
//        sc.nextInt();

//        Methods obj = new Methods();
//        obj.printHello();
//        Methods.printHello();
        // void metoda boshe qe nuk kthejne vlera vetem printojne dicka
        printHello();
        Math.pow(1, 2);
        // Method overloading - metoda me emer te njejte por me numer te ndryshem te parametrave dhe data type te ndryshme
        printHello("Mentor");
        printHello("Gerta");
        printHello("Filan", "Fisteku");
        printHello("Filan", 20);
        System.out.println("Test");
        System.out.println('A');
        System.out.println(1);
        System.out.println(1.5);
        System.out.println(1.2f);

        // Metodat me tip te kthimit
        String text = getHelloText();
        System.out.println(text);
        System.out.println(getHelloText("Mentor"));
        System.out.println(getHelloText("Filan", 20));

        int shuma = sum(1, 2);
        System.out.println(shuma);
        System.out.println(sum(1, 2, 3));
        System.out.println(divide(7, 2));

        int mosha = 20;
//        if (mosha < 18) {
//            System.out.println("Nuk lejohet hyrja");
//        } else {
//            System.out.println("Lejohet hyrja");
//        }
        checkAge(mosha);
        checkAge(15);

        if (isAgeValid(mosha)) {
            System.out.println("Nuk lejohet hyrja");
        } else {
            System.out.println("Lejohet hyrja");
        }

        System.out.println("Our max: " + max(5, 2));
        System.out.println("Math max: " + Math.max(3, 9));
    }

//    public void printHello() {
//        System.out.println("Hello Leart");
//    }

    // static - metoda eshte ne nivel te njejte me klasen te ciles i takon
    public static void printHello() {
        System.out.println("Hello Leart");
    }

    public static void printHello(String name) {
        System.out.println("Hello " + name);
    }

    public static void printHello(String firstName, String lastName) {
        System.out.println("Hello " + firstName + " " + lastName);
    }

    public static void printHello(String name, int age) {
        System.out.println("Hello " + name + " " + age);
    }

    public static String getHelloText() {
//        return 1;
        return "Hello Leart";
    }

    public static String getHelloText(String name) {
        return "Hello " + name;
    }

    public static String getHelloText(String name, int age) {
        return "Hello " + name + " " + age;
    }

    public static int sum(int x, int y) {
//        int sum = x + y;
//        return sum;
        return x + y;
    }

    public static int sum(int x, int y, int z) {
        return x + y + z;
    }

    public static double divide(double numri1, double numri2) {
//        return (double) numri1 / numri2; // nese parametrat i japim si int
        return numri1 / numri2;
    }

    public static void checkAge(int age) {
        if (age < 18) {
            System.out.println("Nuk lejohet hyrja");
        } else {
            System.out.println("Lejohet hyrja");
        }
    }

    public static boolean isAgeValid(int age) {
//        if (age < 18 || age > 65) {
//            return true;
//        } else {
//            return false;
//        }

        // return (age < 18 || age > 65) ? true : false;

        return age < 18 || age > 65; // T || F => T  return true/false
    }

    public static int max(int x, int y) {
        if (x > y) {
            return x;
        } else {
            return y;
        }
//        return Math.max(x, y);
    }
}