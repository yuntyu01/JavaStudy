package step3.cardGame;

public enum Suit {
    SPADE("♠"),
    HART("♥"),
    DIA("♦"),
    CLUB("♣");

    private final String icon;

    Suit(String icon) {
        this.icon = icon;
    }

    public String getIcon() {
        return icon;
    }
}
