import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

public class Deck {
    private ArrayList<Card> deck = new ArrayList<>();

    public Deck(ArrayList<Card> deck) {
        this.deck = deck;
    }

    //Creates a deck of card objects using a loop to run through the 52 cards.
    public static Deck createDeck() {
        ArrayList<Card> deck = new ArrayList<>();
        for (int i = 1; i <= 4; i++) {
            for (int k = 1; k <= 13; k++) {
                String value = Integer.toString(k);
                String suit = Integer.toString(i);
                Card c = new Card(value, suit);
                deck.add(c);
            }
        }
        //uses check methods to assign the names that needs to be changed.
        checkDeckValue(deck);
        checkDeckSuit(deck);

        Deck deck1 = new Deck(deck);
        System.out.println(deck1);
        return deck1;
    }

    //Draws the top card of the deck.
    public static void drawCard(Deck deck){
        ArrayList<Card> deck1 = deck.getDeck();
        System.out.println(deck1.get(1));
        deck.getDeck().remove(1);
    }

    //Shuffles the deck a number of times entered from the console.
    public static Deck shuffleDeck(Deck deck){
        Scanner console = new Scanner(System.in);
        System.out.println("How many times would you like the deck to get shuffled?");
        int times = console.nextInt();
        for (int i = 1; i < times; i++){
            Collections.shuffle(deck.getDeck());
        }
        return deck;
    }
    //prints how many cards are left in the deck
    public static void cardsLeft(Deck deck){
        System.out.println(deck.getDeck().size());
    }

    //Checks the value of each card in the deck and assigns it a name accordingly (ex. "1" is changed to "Ace")
    public static List checkDeckValue(List<Card> deck) {
        for (Card c : deck) {
            switch (c.getValue()) {
                case "1":
                    c.setValue("Ace");
                    break;
                case "11":
                    c.setValue("Jack");
                    break;
                case "12":
                    c.setValue("Queen");
                    break;
                case "13":
                    c.setValue("King");
                    break;
            }
        }
        return deck;
    }
    //Checks the suit of each card in the deck and assigns it a name accordingly (ex. "1" is changed to "Clubs")
    public static List checkDeckSuit(List<Card> deck) {
        for(Card c : deck) {
            switch (c.getSuit()) {
                case "1":
                    c.setSuit("Clubs");
                    break;
                case "2":
                    c.setSuit("Diamonds");
                    break;
                case "3":
                    c.setSuit("Hearts");
                    break;
                case "4":
                    c.setSuit("Spades");
                    break;
            }
        }
        return deck;
    }
    public String toString(){
        String list = deck.toString();
        return list;
    }

    public ArrayList<Card> getDeck() {
        return deck;
    }
}
