package java_11;

public class JumpStatements {
    public static void main(String[] args) {
        // break - terminon ekzekutimin e loop
        for (int i = 1; i <= 10; i++) {
            if (i == 4) {
                break;
            }

            System.out.print(i + " ");
        }

        System.out.println();

        int i = 1;
        while (i <= 10) {
            if (i == 6) {
                break;
            }

            System.out.print(i + " ");
            i++;
        }

        System.out.println();

        if (i > 10) {
            System.out.println("i eshte me madhe se 10");
        } else {
            System.out.println("i nuk eshte me e madhe se 10");
        }

        // continue
        for (int j = 1; j <= 10; j++) {
            if (j == 4 || j == 6) {
                continue;
            }

            System.out.print(j + " ");
        }

        System.out.println();

        int j = 1;
//        while (j++ <= 10) {
//            if (j == 3 || j == 8)
//                continue;
//
//            System.out.print(j + " ");
//            //j++;
//        }
        do {
            if (j == 6) {
                continue;
            }
            System.out.print(j + " ");
//        } while (j++ <= 10); // 10 <= 10
        } while (++j <= 10); // 11 <= 10
    }
}