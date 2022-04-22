package metanit.m3_oop.oopm9;

public class Person {

    private String name;

    public Person(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void display() {
        System.out.printf("Person %s \n", name);
    }
}
