package metanit.m3_oop.oopm4;

class Person3

 {

    private int id;
    private static int counter = 1;

    Person3

() {
        id = counter++;
        System.out.println("id = counter++");
    }

    public void displayId(){
        System.out.printf("Id: %d \n", id);
    }

    public static void displayCounter() {
        System.out.printf("Counter: %d \n", counter);
    }


}
