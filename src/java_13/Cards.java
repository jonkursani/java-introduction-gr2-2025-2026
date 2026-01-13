void main() {
    String[] rank = {"2", "3", "4", "5", "6", "7", "8", "9", "10", "J", "Q", "K", "A"};
    String[] suit = {"♠️", "♥️", "♦️", "♣️"};
//    String[] deck = new String[52];
    String[] deck = new String[rank.length * suit.length];

    int x = 0;
    // Mbushja e vargut me elemente
    for (int i = 0; i < suit.length; i++) {
        for (int j = 0; j < rank.length; j++) {
            deck[x++] = rank[j] + suit[i]; // 2♣️
            // x++;
        }
    }

    // Printimi i vargut te letrave
    for (int i = 0; i < deck.length; i++) {
        System.out.println(deck[i]);
    }
}