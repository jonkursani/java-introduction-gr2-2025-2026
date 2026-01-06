//package java_12;
//
//public class Ushtrime1 {
//}
void main() {
    printOk();
    printOk();
    print("Hello");
    print("Teksti tjeter");
    zbritja(5, 2);
    System.out.println(zbritja(5, 2));
    double zbritja = zbritja(6, 2);
    System.out.println(zbritja);
    deduction(3, 2);
    deduction(4, 2);
    shtypAlfabetin();
    shtypAlfabetin(true);
    shtypAlfabetin(false);
    int res = prodhimi(5, 5);
    System.out.println(res);
    System.out.println(prodhimi(10, 2));
}

public void printOk() {
    System.out.println("Okay");
}

public void print(String mesazhi) {
    System.out.println(mesazhi);
}

// Shkruaj metoden  zbritja() e cila ka dy
// parametra a dhe b te tipit double dhe kthen rezultatin?
public double zbritja(double a, double b) {
    double rezultati = a - b;
    return rezultati;

}

// Krijo metoden deduction() e cila ka dy
// parametra a dhe b te tipit double dhe shtyp rezultatin ne console?
public void deduction(double a, double b) {
    double rez = a - b;
    System.out.println(rez);

}

// Krijo metoden shtypAlfabetin() e cila shtyp alfabetin e gjuhes angleze?
public void shtypAlfabetin() {
    for (char i = 'A'; i <= 'Z'; i++) {
        System.out.print(i + " ");
    }
    System.out.println();
}

public void shtypAlfabetin(boolean printToLowerCase) {
//    if (printToLowerCase) { // true
//        for (char i = 'a'; i <= 'z'; i++) {
//            System.out.print(i + " ");
//        }
//        System.out.println();
//    } else {
//        shtypAlfabetin();
//    }

    for (char x = 'A'; x <= 'Z'; x++) {
        if (printToLowerCase) {
            // 'A' -> "A" -> "a"
            System.out.print(String.valueOf(x).toLowerCase() + " ");
        } else {
            System.out.print(x + " ");
        }
    }
    System.out.println();
}

public int prodhimi(int a, int b) {
    return a * b;
}