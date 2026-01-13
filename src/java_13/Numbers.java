void main() {
    Scanner sc = new Scanner(System.in);

    System.out.print("Jepni gjatesine e vargut: ");
    int gjatesia = sc.nextInt();

    int[] vargu = new int[gjatesia];
    System.out.println("Numri i elementeve te vargut: " + vargu.length);

    // 1) Mbushja e vargut me numra random
    for (int i = 0; i < vargu.length; i++) {
        vargu[i] = (int) (Math.random() * 101); // 0 - 0.999 => 0 - (int) 100.9999 => 0 - 100
    }

    // 2) Printimi i elementeve prej fillimit ne fund
    for (int i = 0; i < vargu.length; i++) {
        System.out.print(vargu[i] + " ");
    }

    System.out.println();

    // 3) Printimi i elementeve prej fundit ne fillim
    for (int i = vargu.length - 1; i >= 0; i--) {
        System.out.print(vargu[i] + " ");
    }

    System.out.println();

    // 4) Shuma e elementeve te vargut
    int sum = 0;
    for (int i = 0; i < vargu.length; i++) {
//        sum = sum + vargu[i];
        sum += vargu[i];
    }
    System.out.println("Shuma e elementeve te vargut: " + sum);
}