package java_06;

import java.util.Scanner;

public class RandomExample {
    public static void main(String[] args) {
        Scanner skaneri = new Scanner(System.in);

        System.out.print("Shkruani rangun deri ku deshironi ta gjeneroni nje numer random: ");
        // int rangu = skaneri.nextInt();
//        String ranguText = skaneri.nextLine(); // "5"
//        int rangu = Integer.parseInt(ranguText); // "5" => 5
        int rangu = Integer.parseInt(skaneri.nextLine());
        System.out.println("Rangu = " + rangu);
        double vleraRandom = Math.random();
        System.out.println("random = " + vleraRandom);
        System.out.println("Vlera random e kalkuluar = " + (vleraRandom * rangu));
        int rezultati = (int) (vleraRandom * rangu);
        System.out.println("Rezultati = " + rezultati);
    }
}