package java.oop.lab_2_11.testexcp1;


public class MyException extends Exception {

    private String s;

    public MyException(String s) {
        this.s = s;
    }

    public void print() {
        System.out.println(s);
    }
}
