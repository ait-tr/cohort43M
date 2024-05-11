package Inkapsulation.ver1;

public class BankAccount {
    private String name;
    private int Id;
    private double balance;

    public BankAccount(String name, int id, double balance) {
        this.name = name;
        Id = id;
        this.balance = balance;
    }
    public String getName() {
        return name;
    }
    public int getId() {
        return Id;
    }
    public double getBalance() {
        return balance;
    }
    public double deposit(double amount) {
        if (amount > 0) {
            balance = balance + amount;
        } else {
            System.out.println("Amount is 0");
        }
        return balance;
    }
    public double withdraw(double money) {
        if (money < balance ){
            balance -= money;
        }else{
            System.out.println("You have " + balance);
        }
        return balance;

    }

    @Override
    public String toString() {
        return "BankAccount{" +
                "name='" + name + '\'' +
                ", Id=" + Id +
                ", balance=" + balance +
                '}';
    }
}
