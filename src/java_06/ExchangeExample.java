package java_06;

import java.util.Scanner;

public class ExchangeExample {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Ky program ben nderrimin e vendeve te variablave");

        System.out.print("Shkruani numrin e pare: ");
        int x = Integer.parseInt(sc.nextLine());

        System.out.print("Shkruani numrin e dyte: ");
        int y = Integer.parseInt(sc.nextLine());

        // x = y;
        int temp = x; // 5
        x = y;
        y = temp;

        System.out.println("x = " + x);
        System.out.println("y = " + y);
    }
}