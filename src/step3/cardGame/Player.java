package step3.cardGame;

import java.util.ArrayList;
import java.util.List;

public class Player {
    String name;
    private List<Card> hand = new ArrayList<>();

    public Player(String name) {
        this.name = name;
    }

    public void drawCard(Deck deck){
            hand.add(deck.drawCard());
    }
    public int rankSum() {
        int value = 0;
        for (Card card : hand) {
            value += card.getNumber();
        }
        return value;
    }

    public void showHand() {
        hand.sort(null);
        System.out.println(name + "의 카드: " + hand + ", 합계: " + rankSum());
    }

    public String getName() {
        return name;
    }
}
