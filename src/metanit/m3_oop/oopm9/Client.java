package metanit.m3_oop.oopm9;

public class Client extends Person {

    private String bank;
    private int sum;    // Переменная для хранения суммы на счете

    public Client(String name, String bank, int sum) {
        super(name);
        this.bank = bank;
        this.sum = sum;
    }

    @Override
    public void display() {
        System.out.printf("Client Name: %s \t Bank: %s \t Sum: %d \n", super.getName(), bank, sum);
    }


}
