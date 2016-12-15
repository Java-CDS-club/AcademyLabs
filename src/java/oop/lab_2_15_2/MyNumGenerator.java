package java.oop.lab_2_15_2;

import java.util.HashSet;
import java.util.Random;
import java.util.Set;


public class MyNumGenerator {

    public Set<Integer> generateDistinct(int numOfElem, int maxNumb) {
        Random random = new Random();
        Set<Integer> set = new HashSet<>(numOfElem);
        while (set.size() < numOfElem) {
            set.add(random.nextInt(maxNumb));
        }
        return set;
    }

}
