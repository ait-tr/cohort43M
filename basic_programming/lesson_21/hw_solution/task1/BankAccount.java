package homework.encapsulation.task1;

public class BankAccount {

    private double balance;

    public BankAccount(double initialBalance) {
        if (initialBalance >= 0) {
            this.balance = initialBalance;
        } else {
            System.out.println("=========");
        }

    }

    public void deposit(double amount){
        if (amount > 0){
            this.balance += amount;
            System.out.println("Внесено " +amount + " евро");
        }
        else {
            System.out.println("Неверная сумма для внесения");
        }
    }

    public void withdraw(double amount){
        if (amount > 0 && amount <= balance){
            this.balance -= amount;
            System.out.println("Снято " + amount + " евро");
        }
        else {
            System.out.println("Недостаточно средств");
        }
    }

    public double getBalance() {
        return balance;
    }


    @Override
    public String toString() {
        return "BankAccount{" +
                "balance=" + balance +
                '}';
    }
}
