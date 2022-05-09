package metanit.m3_oop.oopm14.more;

public class Program {
    public static void main(String[] args) {

        Account<String, Double> acc1 = new Account<>("354", 5000.87);
        String id = acc1.getId();
        Double sum = acc1.getSum();
        System.out.printf("Id: %s;  Sum: %f; \n", id, sum);

    }
}
