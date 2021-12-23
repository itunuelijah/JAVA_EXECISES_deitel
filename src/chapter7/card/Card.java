package chapterSeven.card;

public class Card {
    private final String face; // face of card ("Ace", "Deuce", ...)
    private final String suit; // suit of card ("Hearts", "Diamonds", ...)
    public Card(String cardFace, String cardSuit){
        this.face = cardFace; // initialize face of card
        this.suit = cardSuit; // initialize suit of card
    }
    public String toString()
    {
        return face + " of " + suit;
    }
}
