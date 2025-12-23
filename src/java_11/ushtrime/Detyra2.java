void main() {
    Scanner sc = new Scanner(System.in);

    int rreshtat;
    System.out.print("Shkruani numrin e rreshtave: ");
    while (!sc.hasNextInt()) {
        System.out.print("Shkruani numrin e rreshtave: ");
        sc.next();
    }
    rreshtat = sc.nextInt();

    for (int i = 1; i <= rreshtat; i++) {
        for (int j = 1; j <= i; j++) {
            System.out.print(j);
        }

//        for (int j = i; j >= 1; j--) {
        for (int j = i - 1; j >= 1; j--) {
            System.out.print(j);
        }

        System.out.println();
    }
}