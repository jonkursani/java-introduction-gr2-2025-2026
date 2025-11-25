package java_07;

public class CoinFlip {
    public static void main(String[] args) {
        double random = Math.random(); // 0.0 - 0.9999999
        System.out.println("random: " + random);

        // Menyra 1
//        if (random < 0.5) {
//            System.out.println("Head");
//        } else {
//            System.out.println("Tail");
//        }

        // Menyra 2
        // kjo vlene vetem nese e keni nga 1 rresht
//        if (random < 0.5) {
//            System.out.println("Head");
//            System.out.println("Rreshti tjeter");
//        }
//        else
//            System.out.println("Tail");

        // Menyra 3
        String rezultati = (random < 0.5) ? "Head" : "Tail";
        System.out.println(rezultati);
    }
}