package java.oop.lab_2_5_5;


public class InitTest {

    private static int nextId;

    private int id;

    static {
        nextId = (int) (1000 * Math.random());
    }

    {
        id = nextId;
        nextId++;
    }

    public int getId() {
        return id;
    }
}
