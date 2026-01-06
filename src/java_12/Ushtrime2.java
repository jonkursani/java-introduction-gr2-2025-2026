void main() {
    printNumbers(5);
    printNumbers(10);
    printNumbers(50);
    printNumbers(100);
    printListOfNumbers("123654");
    printListOfNumbers("42137651");
    int shuma = sumNumbers("123654");
    System.out.println("Shuma = " + shuma);
    System.out.println("Shuma = " + sumNumbers("4213765"));
    System.out.println("Shuma = " + sumNumbers("123"));
    System.out.println("Faktorieli 5 = " + faktorieli(5));
    System.out.println("Faktorieli 6 = " + faktorieli(6));
    printMatrix(5, 5, "*");
    printMatrix(6, 10, "#");
    printMatrix(6, 15, "❤️");
    printMatrix(10, 20, "✔️");
}

public void printNumbers(int n) {
    for (int i = 1; i <= n; i++) {
        System.out.print(i + " ");
    }
    System.out.println();
}

// "123654"
public void printListOfNumbers(String numbers) {
    for (int i = 0; i < numbers.length(); i++) {
        System.out.print(numbers.charAt(i) + " ");
    }
    System.out.println();
}

// "1 + 2 + 3 + 6 + 5 + 4 = 21"
public int sumNumbers(String numbers) {
    int sum = 0;

    for (int i = 0; i < numbers.length(); i++) {
        char numberChar = numbers.charAt(i); // '1'
        String numberString = String.valueOf(numberChar); // "1"
//        int number = Integer.parseInt(numberChar + "");
        int number = Integer.parseInt(numberString); // 1
//        sum += number;

        sum = sum + number;
    }

    return sum;
}

// 5! = 5 * 4 * 3 * 2 * 1
public int faktorieli(int numri) {
    int fact = 1;
    for (int i = 1; i <= numri; i++) {
        fact *= i;
    }
    return fact;
}

public void printMatrix(int r, int k, String simboli) {
    for (int i = 1; i <= r; i++) {
        for (int j = 1; j <= k; j++) {
            System.out.print(simboli);
        }
        System.out.println(); // reshtin e ri
    }
}