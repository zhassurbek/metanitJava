package metanit.m3_oop.oopm10;

public class Book implements Printable, Searchable {

    String name;
    String author;

    //constructor
    public Book(String name, String author) {
        this.name = name;
        this.author = author;
    }

    // implements
    @Override
    public void print() {
        System.out.printf("%s (%s) \n", name, author);
    }
}
