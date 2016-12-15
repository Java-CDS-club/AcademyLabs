package java.oop.lab_2_12_5.testnest2;


public class MyTestClass {

    public void test() {
        class MyLocal {}
        MyLocal myLocal = new MyLocal();
        MyStaticNested myStaticNested = new MyStaticNested();
        MyTestClass myTestClass = new MyTestClass();
    }

    static class MyStaticNested {}

}
