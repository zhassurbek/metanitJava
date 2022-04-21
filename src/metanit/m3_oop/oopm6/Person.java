package metanit.m3_oop.oopm6;

//внутри класса Person есть класс Account

public class Person {

    private String name;
    Account account;

    public Person(String name, String password) {
        this.name = name;
        account = new Account(password);
    }

    void displayPerson(){
        System.out.printf("Person\t Name: %s \t Password: %s \n", name, account.password);
    }

    public class Account {

        private String password;

        public Account(String password) {
            this.password = password;
        }

        void displayAccount() {
            System.out.printf("Account Login: %s \t Password: %s \n", Person.this.name, password);
        }
    }
}
