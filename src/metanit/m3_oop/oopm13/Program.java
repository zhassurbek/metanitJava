package metanit.m3_oop.oopm13;

public class Program {

    public static void main(String[] args) {

        // 1
        Person tom = new Person("Tom");
        System.out.println(tom.toString());
        // 2 переопределяем метод toString в Person классе

        // 3 - HASHCODE
        System.out.println("hashCode: " + (int) tom.hashCode());


        // 4 - получаем тип объекта
        System.out.println(tom.getClass());


    }

}
