package metanit.m3_oop.oopm5;

// Объекты как параметры методов
import java.util.Scanner;
public class Program {
    public static void main(String[] args){

        Person kate = new Person("Kate");
        System.out.println(kate.getName());

        changeName(kate);
        System.out.println(kate.getName());


    }

    static void changeName(Person p) {
        p.setName("Alice");
    }

}