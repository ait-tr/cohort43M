package bank;

import bank.model.BankAccount;

public class BankAppl {
    public static void main(String[] args) {

        BankAccount acc0 = new BankAccount(100, "Peter", "Bank #1", 101, 100);
        System.out.println(acc0.getBalance());
        System.out.println(acc0.getOwner());
        acc0.display();
        acc0.deposit(500);
        System.out.println(acc0.getBalance());
        acc0.display();
        acc0.deposit(1000);
        acc0.display();
        acc0.withdraw(2000);
        acc0.display();
        acc0.withdraw(1500);
        acc0.display();

        BankAccount acc1 = new BankAccount(101, "Bill", "Bank #1", 101);
        acc1.display();

        BankAccount acc2 = new BankAccount(102, "Banl #1", 101);
        acc2.display();

        acc2.setOwner("Smith");
        acc2.display("Hei, Mr.");

    }
}
