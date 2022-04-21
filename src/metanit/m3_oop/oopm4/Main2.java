package metanit.m3_oop.oopm4;

public class Main2 {
    public static void main(String[] args) {
        Animal dog = new Animal();
        Animal cat = new Animal();

        dog.displayId();
        cat.displayId();
        dog.setName("Bobby");
        System.out.println(dog.getName());
        dog.getInfo();

        System.out.println();


        Animal crocodile = new Animal();
        crocodile.displayId();
        System.out.println("Counter: " + Animal.counter);
    }
}
