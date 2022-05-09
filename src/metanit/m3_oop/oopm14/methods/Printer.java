package metanit.m3_oop.oopm14.methods;

public class Printer {

    public <T> void print(T[] items) {
        for (T item: items){
            System.out.print(item + " ");
        }
    }

}
