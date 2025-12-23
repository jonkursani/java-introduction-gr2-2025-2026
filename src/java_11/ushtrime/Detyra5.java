void main() {
    // rreshta ____
//    int num = 1;
//    Shfaq matricen e rendit 10x10 me numrat 1-100 dhe 100 - 1
    int num = 100;
    for (int i = 1; i <= 10; i++) {
        // kolona ||||
        for (int j = 1; j <= 10; j++) {
            System.out.printf("%5d", num);
//            num++;
            num--;
        }
        System.out.println();
    }
}