package java.oop.lab_2_13_4.testenum2;


public class Card {

    private Suit cardSuit;
    private Rank cardRank;

    public Card(Suit suit, Rank rank) {
        cardSuit = suit;
        cardRank = rank;
    }

    @Override
    public String toString() {
        return cardRank + "_" + cardSuit;
    }

}
