package metanit.m3_oop.oopm14.methods;

public class Program {

    public static void main(String[] args) {

        Printer printer = new Printer();
        String[] people = {"Tom", "Alice", "Sam", "Kate", "Bob", "Helen"};
        Integer[] numbers = {23, 4, 5, 2, 13, 456, 4};
        System.out.println("People: ");
        printer.print(people);
        System.out.println("\nNumbers: ");
        printer.print(numbers);

    }


}



