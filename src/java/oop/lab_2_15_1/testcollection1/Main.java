package java.oop.lab_2_15_1.testcollection1;

import java.util.ArrayList;
import java.util.List;


public class Main {

    public static void main(String[] args) {

        List<String> list = new ArrayList<>();

        for (int i = 0; i <= 10; i++) {
            list.add("number_" + i);
        }

        for (String s : list) {
            System.out.println(s);
        }

    }

}
