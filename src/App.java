public class App {
    public static void main(String[] args) throws Exception {
        DeckOfCards deck = new DeckOfCards();
        deck.shuffle();

        while(deck.cardsRemain()) {
            for (int i = 0; i < 4 && deck.cardsRemain(); i++) {
                System.out.println(deck.dealOneCard());
            }
            System.out.println("----------------");
        }   
    }
}
