package metanit.m3_oop.oopm14;

public class Program {
    public static void main(String[] args) {

//        Account acc1 = new Account(2334, 5000); // id - cislo
//        int acc1Id = (int)acc1.getId();
//        System.out.println(acc1Id);
//
//        Account acc2 = new Account("sid5523", 5000); // id - Strings
//        System.out.println(acc2.getId());

        System.out.println();

//        Account<String> acc1 = new Account<>("2345", 5000);
//        String acc1Id = acc1.getId();
//        System.out.println(acc1Id);
//
//        Account<Integer> acc2 = new Account<>(2345, 5000);
//        Integer acc2Id = acc2.getId();
//        System.out.println(acc2Id);

        System.out.println();

        // Generic Interfaces
        Accountable<String> acc1 = new Account("1235rwr", 5000);
        Account acc2 = new Account("2373", 4300);
        System.out.println(acc1.getId());
        System.out.println(acc2.getId());

    }
}
