package CardsWithPower;

public class Card {
    private Ranks rank;
    private Suits suit;

    public Card(Ranks rank, Suits suit) {
        this.rank = rank;
        this.suit = suit;
    }

    public Ranks getRank() {
        return this.rank;
    }

    public Suits getSuit() {
        return this.suit;
    }

    public int totalPower(){
        return this.rank.getPower() + this.suit.getPower();
    }
}
