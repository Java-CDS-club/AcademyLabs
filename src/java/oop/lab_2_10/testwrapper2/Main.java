package java.oop.lab_2_10.testwrapper2;

public class Main {

    public static void main(String[] args) {
        System.out.println(compute((byte) 1, 1000));
    }

    private static Long compute(Byte b, Integer i) {
        return Long.valueOf(b + i);
    }

}
