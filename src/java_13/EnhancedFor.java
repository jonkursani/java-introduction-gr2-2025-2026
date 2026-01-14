void main() {
//    int[] numrat = new int[3];
//    numrat[0] = 1; // [0, 0, 0]

    int[] numrat = {1, 2, 3}; // new int[3]

    for (int i = 0; i < numrat.length; i++) {
        // i indexi
        // numrat[i]
        System.out.print(numrat[i] + " ");
    }
    System.out.println();

    // Enhanced for
    for (int numri : numrat) {
//        numrat[numri]
        System.out.print(numri + " ");
    }

    System.out.println();

    int sum = 0;
    for (int nr : numrat) {
//        sum = sum + nr;
        sum += nr;
    }
    System.out.println("Shuma = " + sum);

    String[] emrat = {"Nush", "Mentor"};
    for (String emri : emrat) {
        System.out.print(emri + " ");
    }
}