package model.cards;

import model.cards.enums.Suit;
import model.cards.enums.Val;

public class Deck {

    public static final int DEFAULT_SIZE = 52;

    int size = DEFAULT_SIZE;
    Card[] cards;

    // default deck will have 52 cards
    public Deck() {
        cards = generateAllCards();
    }

    public Deck(Card[] cards) {
        this.size = cards.length;
        this.cards = cards;
    }

    public Card[] generateAllCards() {
        int i = 0;
        Card[] cards = new Card[size];

        while(i < size) {
            for(Val v : Val.values()) {
                for(Suit s : Suit.values()) {
                    Card c = new Card(s, v);
                    cards[i] = c;
                    i++;
                }
            }
        }

        return cards;
    }

    public static void main(String[] args) {
        Deck d = new Deck();
        for(Card c : d.cards) {
            System.out.println(c);
        }
    }
}
