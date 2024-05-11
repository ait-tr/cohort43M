package Inkapsulation.ver1;

import Inkapsulation.ver1.BankAccount;

public class Main {
    public static void main(String[] args) {
        BankAccount bankAccount1 = new BankAccount("Alex", 001, 23.4);
        System.out.println(bankAccount1);
        bankAccount1.deposit(2.0);
        bankAccount1.withdraw(23.1);
        System.out.println(bankAccount1.getBalance());

    }
}
