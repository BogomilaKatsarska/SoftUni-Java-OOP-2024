package CardsWithPower;

public enum Ranks {
    ACE(14),
    TWO(2),
    THREE(3),
    FOUR(4),
    FIVE(5),
    SIX(6),
    SEVEN(7),
    EIGHT(8),
    NINE(9),
    TEN(10),
    JACK(11),
    QUEEN(12),
    KING(13);

    public int power;

    public int getPower() {
        return power;
    }

    Ranks(int power){
        this.power = power;
    }
}
