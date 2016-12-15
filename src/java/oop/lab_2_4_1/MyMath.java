package java.oop.lab_2_4_1;

public class MyMath {

    // emptiness should be checked, min can be first element of sorted array
    public static int findMin(int[] values) {
        int min = Integer.MAX_VALUE;
        for (int value : values) {
            if (value < min) {
                min = value;
            }
        }
        return min;
    }

    // emptiness should be checked, max can be last element of sorted array
    public static int findMax(int[] values) {
        int max = Integer.MIN_VALUE;
        for (int value : values) {
            if (value > max) {
                max = value;
            }
        }
        return max;
    }

}
