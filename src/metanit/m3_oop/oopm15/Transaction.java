package metanit.m3_oop.oopm15;

public class Transaction <T extends Account>{

    private T from;
    private T to;
    private int sum;

    public Transaction(T from, T to, int sum) {
        this.from = from;
        this.to = to;
        this.sum = sum;
    }

    public void execute() {

        if (from.getSum() > sum) {
            from.setSum(from.getSum() - sum);
            to.setSum(to.getSum() + sum);
            System.out.printf("Account %s: %d \nAccount %s: %d \n",
                from.getId(), from.getSum(), to.getId(), to.getSum());
        } else {
            System.out.printf("Operation is invalid");
        }

    }

}
