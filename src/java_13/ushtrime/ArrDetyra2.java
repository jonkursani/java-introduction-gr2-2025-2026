void main() {
    int[][] numbers = new int[2][2];

    // Mbushjen e matrices
    fillMatrix(numbers);

    // Printimi i matrices
    printMatrix(numbers);

    // Numri i elementeve
//    int nrElements = countElements(numbers);
//    System.out.println("Numri i elementeve: " + nrElements);
    System.out.println("Numri i elmenteve: " + countElements(numbers));

    // Shuma e elementeve
    System.out.println("Shuma e elementeve: " + sumElements(numbers));

    // Mesatarja
    System.out.println("Mesatarja: " + avgElements(numbers));

//    minElement()
//    maxElement()
//    printDiagonal()
}

public void fillMatrix(int[][] matrix) {
    Scanner sc = new Scanner(System.in);
    for (int i = 0; i < matrix.length; i++) {
        for (int j = 0; j < matrix[i].length; j++) {
            System.out.printf("Shkruaj elementin ne poziten [%d][%d]: ", (i + 1), (j + 1));
            matrix[i][j] = sc.nextInt();
        }
    }
}

public void printMatrix(int[][] matrix) {
    for (int[] rreshti : matrix) {
        for (int el : rreshti) {
            System.out.print(el + "  ");
        }
        System.out.println(); // dalim ne rreshtin e ri
    }
}

public int countElements(int[][] matrix) {
    int count = 0;

    // matrix.length => numrin e rreshtave
    for (int i = 0; i < matrix.length; i++) {
        count = count + matrix[i].length;
    }

    return count;
}

public int sumElements(int[][] matrix) {
    int sum = 0;

    for (int[] arr : matrix) {
        for (int el : arr) {
            sum += el;
        }
    }

    return sum;
}

public double avgElements(int[][] matrix) {
    int sum = sumElements(matrix);
    int count = countElements(matrix);
    double avg = (double) sum / count;
    return avg;
}