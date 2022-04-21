package metanit.m3_oop.oopm4;
// статические методы и модификатор static


public class Main {
    public static void main(String[] args) {

        Person tom = new Person();
        Person bob = new Person();

        tom.displayId();
        bob.displayId();
        System.out.println(Person.counter);

        // Изменяем Person.counter
        Person.counter = 8;

        Person sam = new Person();
        sam.displayId();
        Person sam2 = new Person();
        sam2.displayId();

    }
}
