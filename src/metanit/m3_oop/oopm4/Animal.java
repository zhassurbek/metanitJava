package metanit.m3_oop.oopm4;

public class Animal {

    private int id;
    private String name;

    public void setName(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    static int counter = 1;

    Animal() {
        id = counter++;
    }

    public void displayId() {
        System.out.printf("Id: %d \n", id);
    }

    public void getInfo() {
        System.out.printf("Id: %d, Name: %s;", id, name);
    }

}
