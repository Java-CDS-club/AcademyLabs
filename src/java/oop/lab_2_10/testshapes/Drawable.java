package java.oop.lab_2_10.testshapes;


public interface Drawable {

    void draw();

    /*default void draw() {
        System.out.println(this);
        System.out.println("Area=" + this.calcArea()); // interface have no idea that implementor will have calcArea() :(
    }*/

}
