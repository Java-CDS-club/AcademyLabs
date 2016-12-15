package java.oop.lab_2_2_3;


public class Employee {

    public void calcSalary(String name, double... salary) {
        double total = 0;
        for (double s : salary) {
            total += s;
        }
        System.out.println(name + " : " + total);
    }

}
