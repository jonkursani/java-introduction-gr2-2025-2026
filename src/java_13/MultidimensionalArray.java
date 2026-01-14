void main() {
    // int[] n1 = new int[2];
    // int[] n1 = {1, 2, 3}; // new int[3]

    int[][] m1 = new int[2][3];
    /*
     * 0  0  0
     * 0  0  0
     * */
    int[][] m2 = {
            {1, 2},
            {3, 4},
            {5, 6}
    }; // new int[3][2]

    // Shkrimi ne matrice
    m2[1][0] = 7;

    // Leximi
    System.out.println("Elementi [1][0]: " + m2[1][0]);

    // Jagged Array
    int[][] ja1 = new int[3][];
    ja1[0] = new int[3];
    ja1[1] = new int[2];
    ja1[2] = new int[4];
    /*
    * 0  0  0
    * 0  0
    * 0  0  0  0
    * */

    int[][] ja2 = {
            {1, 2, 3, 4},
            {5, 6},
            {7, 8, 9}
    };

    // Printimi i elementeve
    for (int i = 0; i < m2.length; i++) { // rreshta
//        for (int j = 0; j < m2[0].length; j++) {
        for (int j = 0; j < m2[i].length; j++) {
            System.out.printf("[%d][%d]: %d ", i, j, m2[i][j]);
        }
        System.out.println();
    }

    // enhanced for
    for (int[] arr : ja2) {
        for (int element : arr) {
            System.out.print(element + "  ");
        }
        System.out.println();
    }
}