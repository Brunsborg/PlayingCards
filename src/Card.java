
public class Card{
    private String value;
    private String suit;

    public Card( String value, String suit) {
        this.value = value;
        this.suit = suit;
    }

    //Creates a card
    public static Card createCard(){
        String s1 = "1";
        String s2 = "4";
        Card card = new Card(s1, s2);
        checkCardValue(card);
        checkCardSuit(card);
        System.out.println(card);
        return card;
    }

    public static String checkName(){
    return "";
    }

    //checks the value of the card and makes certain changes accordingly (ex. "1" is changed to "ace"
    public static Card checkCardValue(Card c) {
            switch (c.value) {
                case "1":
                    c.value = "Ace";
                    break;
                case "11":
                    c.value = "Jack";
                    break;
                case "12":
                    c.value = "Queen";
                    break;
                case "13":
                    c.value = "King";
                    break;
            }
            return c;
    }

    //Checks the suit of the card and assigns it a name accordingly (ex. "1" is changed to "clubs")
    public static Card checkCardSuit(Card c) {
            switch (c.suit) {
                case "1":
                    c.suit = "Clubs";
                    break;
                case "2":
                    c.suit = "Diamonds";
                    break;
                case "3":
                    c.suit = "Hearts";
                    break;
                case "4":
                    c.suit = "Spades";
                    break;
            }
            return c;
    }

    public String toString(){
        return value + " of " + suit;
    }

    public String getValue() {
        return value;
    }

    public String getSuit() {
        return suit;
    }

    public void setValue(String value) {
        this.value = value;
    }

    public void setSuit(String suit) {
        this.suit = suit;
    }

}