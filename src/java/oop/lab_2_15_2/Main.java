package java.oop.lab_2_15_2;

import java.util.Set;


public class Main {

    public static void main(String[] args) {

        MyNumGenerator generator = new MyNumGenerator();
        Set<Integer> set = generator.generateDistinct(10, 100);
        for (Integer i : set) {
            System.out.println(i);
        }

    }

}
