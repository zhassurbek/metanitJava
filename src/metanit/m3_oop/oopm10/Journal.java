package metanit.m3_oop.oopm10;

public class Journal implements Printable{

    private String name;

    // Constructor
    public Journal(String name) {
        this.name = name;
    }

    // Implementing
    // After default methods we can не реализовать
//    @Override
//    public void print() {
//        System.out.println(name);
//    }

    public void print() {
        System.out.println(name);
    }


    public String getName() {
        return name;
    }
}
