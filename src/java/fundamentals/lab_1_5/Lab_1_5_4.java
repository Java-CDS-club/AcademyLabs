package java.fundamentals.lab_1_5;


public class Lab_1_5_4 {

    public static void main(String[] args) {

        for (int i = 1, counter = 0; i < 300 /* || counter < 10 */; i++) {
            if (counter >= 10) { break; } // comment line in case uncommenting for-condition
            if (i % 3 == 0 || i % 4 == 0) {
                System.out.println(i);
                counter++;
            }
        }

    }

}
