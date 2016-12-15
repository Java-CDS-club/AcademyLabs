package java.oop.lab_2_17_5.testthread5;

import static java.lang.Thread.sleep;

public class Counter implements Runnable {

    private Storage storage;

    public Counter(Storage storage) {
        this.storage = storage;
    }

    @Override
    public void run() {
        for (int i = 0; i <= 10; i++) {
            try {
                sleep(1000);
            } catch (InterruptedException e) {}
            synchronized (storage) {
                storage.setI(i);
                storage.setReady(true);
                storage.notifyAll();
            }
        }
    }

}
