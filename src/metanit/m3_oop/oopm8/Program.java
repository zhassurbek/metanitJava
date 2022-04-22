package metanit.m3_oop.oopm8;

public class Program {
    public static void main(String[] args) {
//        Human h = new Human();    // Exception, because can't create object in abstract class

        Employee bob = new Employee("Bob", "Kaspi");
        bob.display();

        Person sam = new Client("Sam", "Kaspi");
        sam.display();


        Rectange rectange = new Rectange(22.2f, 2.1f, 3, 6);
        System.out.println(rectange.getPerimeter());
        System.out.println(rectange.getArea());
    }
}
