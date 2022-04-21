package metanit.m3_oop.oopm7;

public class Program {

    public static void main(String[] args) {

//        Person tom = new Person("Tom");
//        tom.display();

        Employee sam = new Employee("Sam", "Microsoft");
        sam.display();
//        sam.work();
        sam.displayConstantAge();
    }

    // Динамическая диспетчеризация методов
    Person sam2 = new Employee("Kayli", "Oracle");
//    sam2.display();


}
