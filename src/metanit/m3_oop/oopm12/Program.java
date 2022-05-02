package metanit.m3_oop.oopm12;

public class Program {

    public static void main(String[] args) {

        // 1
        day();

        System.out.println();

        // 2
        book1();

        System.out.println();

        // 2 - 1 values
        valEnums();

        System.out.println();

        // 2 - 2
        System.out.println(Type.BELLETRE.ordinal());

        System.out.println();

        // 4 enum math operations
        enumMathOperations();

    }

    public static void day() {
        Day current = Day.MONDAY;
        System.out.println(current);
    }


    //2
    public static void book1() {

        Book b1 = new Book("War and Peace", Type.BELLETRE, "L. Tolstoy");
        System.out.printf("Book '%s' has a type '%s' %n", b1.name, b1.typeBook);

        String typeBook = switch (b1.typeBook) {
            case BELLETRE -> "Belletre";
            case SCIENCE -> "Science";
            case SCIENCE_FICTION -> "Science fiction";
            case PHANTASY -> "Fantasy";
        };

        System.out.println(typeBook);

    }

    public static void valEnums() {
        Type[] types = Type.values();
        for (Type s : types) {
            System.out.println(s);
        }
    }


    // 4
    public static void enumMathOperations() {

        Operation op = Operation.SUM;
        System.out.println(op.action(10, 4));

        op = Operation.MULTIPLY;
        System.out.println(op.action(6, 4));

    }

}
