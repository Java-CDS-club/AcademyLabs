package java.fundamentals.lab_1_4;

public class Lab_1_4_5 {

    public static void main(String[] args) {

        int positiveOperand = 12;
        int negativeOperand = -12;
        int shift = 2;
        String binaryPositiveOperand = Integer.toBinaryString(positiveOperand);
        String binaryNegativeOperand = Integer.toBinaryString(negativeOperand);

        System.out.println(binaryPositiveOperand + " >> " + shift + " = " + Integer.toBinaryString(positiveOperand >> shift));
        System.out.println(binaryNegativeOperand + " >> " + shift + " = " + Integer.toBinaryString(negativeOperand >> shift) + "\n");

        System.out.println(binaryPositiveOperand + " << " + shift + " = " + Integer.toBinaryString(positiveOperand << shift));
        System.out.println(binaryNegativeOperand + " << " + shift + " = " + Integer.toBinaryString(negativeOperand << shift) + "\n");

        System.out.println(binaryPositiveOperand + " >>> " + shift + " = " + Integer.toBinaryString(positiveOperand >>> shift));
        System.out.println(binaryNegativeOperand + " >>> " + shift + " = " + Integer.toBinaryString(negativeOperand >>> shift));

    }

}
