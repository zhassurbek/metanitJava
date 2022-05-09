package metanit.m3_oop.oopm14.constructors;

public class Program {
    public static void main(String[] args) {

        Account acc1 = new Account("cid2373", 5000);
        Account acc2 = new Account(53757, 4000);
        System.out.println(acc1.getId());
        System.out.println(acc2.getId());

    }
}
