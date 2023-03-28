package model.cards;

import model.cards.enums.*;

import java.util.Objects;

public class Card implements Comparable<Card> {

    private Suit suit;
    private Val val;

    public Card(Suit s, Val v) {
        this.suit = s;
        this.val = v;
    }

    public Suit getSuit() {
        return suit;
    }

    public void setSuit(Suit suit) {
        this.suit = suit;
    }

    public Val getVal() {
        return val;
    }

    public void setVal(Val val) {
        this.val = val;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Card card = (Card) o;
        return suit.matches(card.suit) && val.matches(card.val);
    }

    @Override
    public int hashCode() {
        return Objects.hash(suit, val);
    }

    @Override
    public String toString() {
        return this.val.c + this.suit.c + " ";
    }

    @Override
    public int compareTo(Card c) {
        // sort from Ace of Spades being smallest to King of Diamonds being the greatest based on vals first

        Val cVal = c.getVal();
        if(cVal.matches(val)) {
            // same val, compare by suit
            return suit.order - c.getSuit().order;
        }

        // different val, compare by val
        return val.val - c.getVal().val;
    }
}
