void main() {
    Scanner sc = new Scanner(System.in);

    System.out.print("Shkruani numrin e elementeve: ");
    int nrElements = sc.nextInt();

    int[] numbers = new int[nrElements];

    // Mbushja e elementeve te vargut
    for (int i = 0; i < numbers.length; i++) {
        System.out.printf("Shkruani elementin %d: ", (i + 1));
        numbers[i] = sc.nextInt();
    }

    // Printimi i elementeve te vargut
    for (int nr : numbers) {
        System.out.print(nr + " ");
    }
}