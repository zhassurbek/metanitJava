package metanit.m3_oop.oopm4;

public class Person {

    private int id;
    static int counter = 1;


    Person() {
        id = counter++;
    }

    public void displayId() {
        System.out.printf("Id: %d \n", id);
    }

}
