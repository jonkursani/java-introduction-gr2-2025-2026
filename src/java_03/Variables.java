package java_03;

public class Variables {
    public static void main(String[] args) {
        // type => data type ose tipi i te dhenave (byte, short, double, char, boolean)
        // identifier => emri i variables
        // inicializimi (opcional) tu e perdor assignment operator "="

        // manual declaration
        int x = 10; // deklarimi dhe inicializimi
        int y; // deklarimi
        y = 20; // inicializimi (mi dhon vlere)

//        int z;
//        int c;
//        int v;
        short z, c = 40, v = 50; // deklarimi i variablave te tipit te njejte
        z = 30;

        // dynamic declaration
        int n = c + v; // 40 + 50 = 90

        // Scope => trupi i ni metode apo klase apo variables
        // kllapa {
        //      Scope i klases apo metodes
        // }

        System.out.println("X jasht if-it eshte: " + x);
        int m = 0;
        if (n > 10) { // a eshte n me e madhe se 10 => true ose false
//            int m = 20;
            m = 20;
            x = 30;
            System.out.println("X brenda if-it eshte: " + x);
            System.out.println("M eshte: " + m);
            m = 21;
        }
        System.out.println("X jasht if-it eshte: " + x);
        // System.out.println("Nuk mundemi me ju qas m jasht scope-it te saj: " + m);
        System.out.println("M jasht if-it eshte: " + m);

        // Konstante => final
        final short WEEK_DAYS = 7;
        final float MIN_HEIGHT = 20.5F;
        final double PI;
        PI = 3.141592653589793;
        System.out.println("WEEK_DAYS: " + WEEK_DAYS);
        System.out.println("MIN_HEIGHT: " + MIN_HEIGHT);
        System.out.println("PI: " + PI);
    }

    // x = 10
}
