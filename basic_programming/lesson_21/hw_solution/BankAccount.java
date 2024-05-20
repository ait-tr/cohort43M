package Task1;

public class BankAccount {
    private double balance;

    public BankAccount(double initialBalance) {
        if (initialBalance >= 0){
            this.balance = initialBalance;}
    }
    public void deposit(double amount) {
        if (amount > 0) {
        this.balance += amount;}
    }
    public void withdraw(double amount) {
        if (amount<balance) {
        this.balance -= amount;}
        else {
            System.out.println("На вашем счету недостаточно средств");
        }
    }

    public double getBalance() {
        return this.balance;
    }

    public static void main(String[] args) {

        BankAccount account = new BankAccount(100);
        System.out.println("Текущий баланс: " + account.getBalance());
        account.deposit(500);
        System.out.println("Текущий баланс после внесения: " + account.getBalance());
        account.withdraw(700);
        System.out.println("Текущий баланс после снятия: " + account.getBalance());
    }
}