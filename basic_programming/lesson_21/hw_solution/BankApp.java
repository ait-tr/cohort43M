package homework_bankAccaount;

public class BankApp {
    public static void main(String[] args) {
        BankAccount account = new BankAccount(1, "Smith", 1000.0 );
        System.out.println("Initial Balance: " + account.getName() + " " + " " + account.getId() + " " + account.getBalance());

        account.deposit(1, 500);
        System.out.println("new balance: " + account.getBalance());

        account.withdraw(1,1800);
        System.out.println("new balance: " + account.getBalance());

        account.withdraw(1,700);
        System.out.println("new balance : " + account.getBalance());

    }

}
