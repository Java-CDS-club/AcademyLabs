package java.oop.lab_2_13_4.testenum2;


public class Main {

    public static void main(String[] args) {

        Card[] deck = new Card[52];

        int index = 0;
        for (Suit suit : Suit.values()) {
            for (Rank rank : Rank.values()) {
                deck[index++] = new Card(suit, rank);
            }
        }

        for (Card card : deck) {
            System.out.println(card);
        }

    }

}
