package metanit.m3_oop.oopm14;

public class Account implements Accountable<String> {

//    private T id;
//    private int sum;
//
//    // constructor
//    Account(T id, int sum) {
//        this.id = id;
//        this.sum = sum;
//    }
//
//    // getId
//    public T getId() { return id; }
//    public int getSum() {
//        return sum;
//    }
//    public void setSum(int sum) {
//        this.sum = sum;


//    }

    // Generics Interfaces
    private String id;
    private int sum;

    Account(String id, int sum) {
        this.id = id;
        this.sum = sum;
    }

    @Override
    public String getId() {
        return id;
    }

    @Override
    public int getSum() {
        return sum;
    }

    @Override
    public void setSum(int sum) {
        this.sum = sum;
    }

}
