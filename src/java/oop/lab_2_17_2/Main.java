package java.oop.lab_2_17_2;

public class Main {

    public static void main(String[] args) {
        MyTimeBomb bomb1 = new MyTimeBomb();
        new Thread(bomb1).start();
    }

}
