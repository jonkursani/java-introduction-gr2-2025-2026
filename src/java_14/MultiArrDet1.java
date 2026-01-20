void main() {
    Scanner sc = new Scanner(System.in);

    System.out.print("Shkruani numrin e rreshtave: ");
    int r = sc.nextInt();

    System.out.print("Shkruani numrin e kolonave: ");
    int k = sc.nextInt();

    int[][] numrat = new int[r][k];

    // Mbushja e matrices
    for (int i = 0; i < numrat.length; i++) {
        for (int j = 0; j < numrat[i].length; j++) {
            numrat[i][j] = (int) (Math.random() * 10001); // 10000.99999 => 0 - 10000
        }
    }

    // Printimin e elementeve te matrices
    System.out.println("For");
    for (int i = 0; i < numrat.length; i++) {
        for (int j = 0; j < numrat[i].length; j++) {
            System.out.print(numrat[i][j] + "   ");
        }
        System.out.println();
    }

    // Enhanced for
    System.out.println("Enhanced for");
    for (int[] rreshti : numrat) {
        for (int element : rreshti) {
            System.out.print(element + "   ");
        }
        System.out.println();
    }
}