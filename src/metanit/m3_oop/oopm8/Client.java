package metanit.m3_oop.oopm8;

public class Client extends Person {

    private String bank;

    public Client(String name, String company) {
        super(name);
        this.bank = company;
    }

    @Override
    public void display() {
        System.out.printf("Client Name: %s \t Bank: %s \n", super.getName(), bank);
    }
}
