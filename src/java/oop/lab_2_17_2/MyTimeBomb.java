package java.oop.lab_2_17_2;

public class MyTimeBomb implements Runnable {

    @Override
    public void run() {
        for (int i = 10; i >= 0; i--) {
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            System.out.println(i);
        }
        System.out.println("Boom!!!");
    }

}
