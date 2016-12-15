package java.oop.lab_2_13_1.testenum1;


public class Main {

    public static void main(String[] args) {

        for (MyDayOfWeek day : MyDayOfWeek.values()) {
            System.out.println(day.ordinal() + " : " + day.name());
        }

    }

}
