package java.oop.lab_2_15_4.testmygen;

import java.util.List;

public class Main {

    public static void main(String[] args) {

        MyNumGenerator myNumGenerator = new MyNumGenerator(10, 64);
        List<Integer> list = myNumGenerator.generate();
        for (Integer i : list) {
            System.out.println(i);
        }

    }

}
