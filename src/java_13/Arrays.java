//package java_13;
//
//public class Arrays {
//    public static void main(String[] args) {
//
//    }
//}
void main() {
    int numri1 = 1;
    int numri2 = 2;
    int numri3 = 3;

    // Vargjet => arrays
    // Deklarimi i vargut
    int[] numrat;

    // inicialimi i vargut
    // rezervimi i hapesires memorike ne heap per 3 elemente te ketij vargu
    // vlerat fillestare (default values) per tipet primitive eshte 0 [0, 0, 0]
    // perveq boolean qe eshte false [false, false, false]
    // Tipet reference vleren default e kan null [null, null, null]
    numrat = new int[3]; // [0, 0, 0]
    byte[] byteArray = new byte[10]; // [0, 0, 0, 0, 0, 0, 0, 0, 0, 0]
    String[] stringArray = new String[20]; // [null, null, null, null, null, null, ... null]

//    Scanner sc = new Scanner(System.in);
//    System.out.println("Shkruani numrin e studenteve: ");
//    int nrStud = sc.nextInt();
//    int[] vargu = new int[nrStud];

    int a = 3;
    int b = 5;
    int[] c = new int[a + b]; // [0, 0, 0, 0, 0, 0, 0, 0]

    // Shkrimi dhe leximi ne array

    // Shkrimi array[index] = vlera
    numrat[0] = 1;
    numrat[1] = 2;
    numrat[2] = 3;

    // Leximi array[index]
    System.out.println("Numri i elementeve: " + numrat.length);
    System.out.println("Numri i dyte ne array: " + numrat[1]);
//    System.out.println(numrat[3]); // error index out of bounds

    // Inicializimi
//    int[] nr = new int[2];
//    nr[0] = 1;
//    nr[1] = 2;
//    String[] emrat = new String[]{"Mentor", "Nush"};
    String[] emrat = {"Mentor", "Nush"}; // new String[2]

    // Shfaqja e vlerave duke perdor loops
    for (int i = 0; i < emrat.length; i++) {
        // i => index
        // emrat[i] => vlera e elementit ne index i
        System.out.println(i + " - " + emrat[i]);
    }
}