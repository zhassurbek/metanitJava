package metanit.m3_oop.oopm6;
// Внутренние и вложенные классы
// nested(inner class)

public class Program {
    public static void main(String[] args) {

        Person tom = new Person("Tom", "Tom2022");
        tom.displayPerson();
        tom.account.displayAccount();

    }
}
