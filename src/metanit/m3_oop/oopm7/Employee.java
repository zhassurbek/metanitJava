package metanit.m3_oop.oopm7;

public class Employee extends Person {

    String company;

    // если базовый класс определяет конструктор
    // то производный класс должен его вызвать

    public Employee(String name, String company) {
        super(name);
        this.company = company;
    }

    public void work() {
        System.out.printf("%s works in %s \n", name, company);
    }

    // Переопределим метод void в базовом классе
    // С помощью @Override


    @Override
    public void display() {

//        super.display(); //-- Здесь мы скажем, что делай то, что делает эта функция в базовом классе.

        System.out.printf("Employee %s works in %s \n", super.getName(), company);

//        System.out.printf("Name: %s \n", getName());
//        System.out.printf("Works in %s \n", company);
    }

    @Override
    public void displayConstantAge() {
        super.displayConstantAge();
        System.out.println("Age is awesome");
    }
}
