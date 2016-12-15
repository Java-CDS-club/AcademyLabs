package java.oop.lab_2_2;


import java.oop.lab_2_2_4.Person;

public class Lab_2_2_4 {

    public static void main(String[] args) {

        Person person = new Person();

        person.setField("Vasya");
        System.out.println(person);

        person.setField("Petr", "Petrov");
        System.out.println(person);

        person.setField("Ivan", "Ivanov", 20);
        System.out.println(person);

        person.setField("Sidor", "Sidorov", 25, "male");
        System.out.println(person);

        person.setField("Katerina", "Mitina", 15, "female", "777-77-77");
        System.out.println(person);

    }

}
