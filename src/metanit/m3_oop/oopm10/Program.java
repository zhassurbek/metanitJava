package metanit.m3_oop.oopm10;

public class Program {
    public static void main(String[] args) {

        // 1
        Book b1 = new Book("Java. Complete Referense.", "H. Shildt");
        b1.print();

        // 2
        Printable printable = new Book("Java. Complete Reference", "H. Shildt");
        printable.print();

        printable = new Journal("Foreign Policy");
        printable.print();


        // 3
        System.out.println("\\n????????? ?? ????? ??????? ?? ???????, ??? ??? ?? ???????????????? ????? ??????????");
        Journal p = new Journal("Foreign Affairs");
        p.print();
        // ????????? ?? ????? ?????? getName(), ?????????? ????? ??????????
        String name = p.getName();
        System.out.println(name);


        //4 static methods in interfaces
        System.out.println();
        Printable.read();

        // 5
        // Private methods in interfaces
        System.out.println();
        Calculatable c = new Calculation();
        System.out.println(c.sum(1, 2));
        System.out.println(c.sum(1, 2, 3));


        // 6 constants in interfaces
        WaterPipe pipe = new WaterPipe();
        pipe.printState(1);


        // 7 Множественная реализация интерфейсов
//        System.out.println();
//        Printer.Printable pp = (Printer.Printable) new Journal("Foreign Affairs");
//        pp.print();


        // 8 Интерфейсы как параметры и результаты методов
        Printable printable1 = createPrintable("Foreign Affairs", false);
        printable1.print();

        read(new Book("Java for impatients", "Cay Horstmann"));
        read(new Journal("Java Dayly News"));
    }

    static void read(Printable pp) {
        pp.print();
        ;
    }

    static Printable createPrintable(String name, boolean option) {

        if (option)
            return new Book(name, "Undefined");
        else
            return new Journal(name);

    }

}

