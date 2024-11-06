package CardSuit;

public class Main {
    public static void main(String[] args) {
        for (CardSuits card: CardSuits.values()){
            System.out.printf("Ordinal value: %d Name value: %s",card.ordinal(), card);
            System.out.println();
        }
    }
}
