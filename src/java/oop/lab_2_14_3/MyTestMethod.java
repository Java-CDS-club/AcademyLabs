package java.oop.lab_2_14_3;


public class MyTestMethod {

    public static <T extends Number & Comparable<T>> double calcSum(T[] arr, T elem) {
        // weird solution, but no way
        double sum = 0.0;
        for (T item : arr) {
            if (item.compareTo(elem) > 0) {
                sum += item.doubleValue();
            }
        }
        return sum;
    }

}
