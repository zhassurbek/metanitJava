package metanit.m3_oop.oopm7;
// это у нас отдельный класс, описывающий отдельного человека.

public class Person {

    String name;

    public Person(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void display() {
        System.out.println("Person %s \n" + name);
    }
    // key word "final" used for a block this method
    public void displayConstantAge() {
        System.out.println("Age: 21");
    }

}
