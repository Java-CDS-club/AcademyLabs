package java.oop.lab_2_10.testshapes;

import java.util.Scanner;

import static java.oop.lab_2_10.testshapes.Shape.parseShape;


public class Main {

    public static void main(String[] args) {

        Shape[] shapes = new Shape[] { parseShape("rectangle:RED:10,20"),
                                       parseShape("triangle:GREEN:9,7,12"),
                                       parseShape("circle:BLACK:10") };
        for (Shape shape : shapes) {
            shape.draw();
        }

        System.out.println("Input amount of shapes:");
        Scanner scanner = new Scanner(System.in);
        int amount = scanner.nextInt();
        Shape[] shapes1 = new Shape[amount];

        for (int i = 0; i < amount; i++) {
            System.out.println("Input " + (i + 1) + " shape template:");
            Scanner scanner1 = new Scanner(System.in);
            String shapeTemplate = scanner1.nextLine();
            shapes1[i] = parseShape(shapeTemplate);
        }

        for (Shape shape : shapes1) {
            shape.draw();
        }

    }

}
