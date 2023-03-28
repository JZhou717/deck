package model.cards.enums;

public enum Suit {
    SPADE('S', 0, BLACK),
    HEART('H', 1, RED),
    CLUB('C', 2, BLACK),
    DIAMOND('D', 3, RED);

    public final char c;
    public final int order;
    public final boolean redSuit;

    public static final boolean BLACK = false;
    public static final boolean RED = true;

    Suit(char c, int order, boolean redSuit) {
        this.c = c;
        this.order = order;
        this.redSuit = redSuit;
    }

    public boolean matches(Suit s) {
        return this.name().equals(s.name());
    }

    boolean matches(char c) {
        return c == this.c;
    }

    boolean matches(String s) {
        return s.equalsIgnoreCase(this.name());
    }
}
