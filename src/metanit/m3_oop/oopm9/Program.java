package metanit.m3_oop.oopm9;

public class Program {

    public static void main(String[] args) {

        Employee sam = new Employee("Sam", "Jusan");
        sam.display();

        Client zarr = new Client("Zarr", "Jusan", 20_000);
        zarr.display();


        Object tom = new Person("Tom");
        Object sam2 = new Employee("Sam2", "Oracle");
        Object kate = new Client("Kate", "Jusan", 2000);
        Person bob = new Client("Bob", "Jusan", 30000);
        Person alice = new Employee("Alice", "Jusan");


        Object kello = new Employee("Kello", "Jusan");
        Employee emp = (Employee) kello;
//        kello.display();
        ((Employee) kello).display();




        Object zhassurbek = new Client("Zhassurbek", "JusanBank", 100_000);
        if (zhassurbek instanceof Employee) {

            Employee employeeZhassurbek = (Employee) zhassurbek;
            employeeZhassurbek.display();
        }
        else {
            System.out.println("Conversion is invalid");
        }



    }

}
