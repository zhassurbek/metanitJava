package metanit.m3_oop.oopm10;

interface Printable {
//    void print() {

    default void print() {
    // Методы по умолчанию
        System.out.println("Undefined printable");
    }

    // 4
    // static methods in interfaces
    static void read() {
        System.out.println("Read printable");
    }


}
