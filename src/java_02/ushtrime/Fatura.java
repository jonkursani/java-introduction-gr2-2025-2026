package java_02.ushtrime;

public class Fatura {
    public static void main(String[] args) {
        System.out.println("|=====================================|");
        System.out.println("|============= Fatura ================|");
        System.out.println("|=====================================|");
        System.out.printf("| Emri dhe mbiemri: %s %S     |%n", "Filan", "Fisteku");
        System.out.printf("| Produkti: %S                    |%n", "Laptop");
        System.out.printf("| Sasia: %d                            |%n", 5);
        System.out.println("|-------------------------------------|");
        System.out.printf("| %25s: %c%.2f  |%n", "Total", '$', 500.50);
        System.out.println("|=====================================|");
    }
}