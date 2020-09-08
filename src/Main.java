public class Main {
    public static void main(String[] args) {
        Card.createCard();
        Deck deck = Deck.createDeck();
        Deck.shuffleDeck(deck);
        System.out.println(deck);
        Deck.cardsLeft(deck);
        Deck.drawCard(deck);
        Deck.cardsLeft(deck);
    }
}
