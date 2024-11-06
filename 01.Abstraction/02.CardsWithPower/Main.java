package CardsWithPower;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        Ranks ranks = Ranks.valueOf(scanner.nextLine());
        Suits suit = Suits.valueOf(scanner.nextLine());

        Card card = new Card(ranks, suit);

        System.out.printf("Card name: %s of %s, Card power: %d", card.getRank(), card.getSuit(), card.totalPower());
    }
}
