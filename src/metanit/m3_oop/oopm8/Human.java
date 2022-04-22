package metanit.m3_oop.oopm8;

// Abstract classes in Java
// нельзя создать объект или экземпляр абстрактного класса

public abstract class Human {

    private String name;

    public String getName() {
        return name;
    }

    // abstract method
    public abstract void display();

}
