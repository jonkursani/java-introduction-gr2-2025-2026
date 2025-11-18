package java_06;

public class MathExample {
    public static void main(String[] args) {
        int a = 5;
        int b = 2;

        System.out.println("abs = " + Math.abs(-5)); // |-5| => 5
        System.out.println("max = " + Math.max(a, b)); // 5
        System.out.println("min = " + Math.min(a, b)); // 2
        System.out.println("pow = " + Math.pow(a, b)); // 5^2 => 25
        System.out.println("sqrt = " + Math.sqrt(Math.pow(a, b))); // sqrt(25) => 5
        System.out.println("ceil = " + Math.ceil(6.2)); // 6.2 => 7
        System.out.println("floor = " + Math.floor(6.8)); // 6.8 => 6
        System.out.println("round = " + Math.round(3.4)); // 3.4 => 3
        System.out.println("round = " + Math.round(3.6)); // 3.6 => 4
        System.out.println("random = " + Math.random()); // 0.0 <= random < 1.0
        System.out.println("PI = " + Math.PI);
        System.out.println("E = " + Math.E);




    }
}