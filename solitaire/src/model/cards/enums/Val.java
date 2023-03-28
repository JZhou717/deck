package model.cards.enums;

public enum Val {
    Ace(1, "A"),
    Two(2, "2"),
    Three(3, "3"),
    Four(4, "4"),
    Five(5, "5"),
    Six(6, "6"),
    Seven(7, "7"),
    Eight(8, "8"),
    Nine(9, "9"),
    Ten(10, "10"),
    Jack(11, "J"),
    Queen(12, "Q"),
    King(13, "K")
    ;

    public final int val;
    public final String c;


    Val(int val, String c) {
        this.val = val;
        this.c = c;
    }

    public boolean matches(Val v) {
        return v.name().equals(this.name());
    }

    public boolean matches(int v) {
        return v == this.val;
    }

    public boolean matches(String c) {
        return c.equals(this.c);
    }
}
