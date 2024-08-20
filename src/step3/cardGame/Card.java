package step3.cardGame;

import java.util.*;

public class Card implements Comparable<Card> {
    private Integer number;
    private Suit suit;

    public Card(Integer number, Suit suit) {
        this.number = number;
        this.suit = suit;
    }

    public Integer getNumber() {
        return number;
    }

    public Suit getSuit() {
        return suit;
    }

    @Override
    public String toString() {
        return "[" +
                 + number +
                ", " + suit.getIcon() +
                ']';
    }

    @Override
    public boolean equals(Object object) {
        if (this == object) return true;
        if (object == null || getClass() != object.getClass()) return false;
        Card card = (Card) object;
        return Objects.equals(number, card.number) && suit == card.suit;
    }

    @Override
    public int hashCode() {
        return Objects.hash(number, suit);
    }

    @Override
    public int compareTo(Card anotherCard) {
        // 숫자를 먼저 비교하고, 숫자가 같으면 마크를 비교
        if (this.number != anotherCard.number) {
            return Integer.compare(this.number, anotherCard.number);
        } else {
            return this.suit.compareTo(anotherCard.suit);
        }
    }
}

