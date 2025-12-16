package java_10;

public class ForLoop {
    public static void main(String[] args) {
        // infinite loop
//        for (int i = 1; true; i+=5) {
//            System.out.println("i: " + i);
//        }

//        System.out.println();
//        for (int i = 1; i >= 1; i++) {
//            System.out.println("i: " + i);
//        }

        // nested loop
        for (int i = 1; i <= 4; i++) {
            System.out.println("i= " + i);
            for (int j = 1; j <= 3; j++) {
                System.out.println("  j= " + j);
            }
        }
    }
}