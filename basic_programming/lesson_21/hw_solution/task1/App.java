package homework.encapsulation.task1;

public class App {
    public static void main(String[] args) {

        BankAccount bankAccount = new BankAccount(5000);
        System.out.println("Баланс: " + bankAccount.getBalance() + " евро");

        bankAccount.deposit(1000);
        System.out.println("Баланс: " + bankAccount.getBalance() + " евро");

        bankAccount.withdraw(2500);
        System.out.println("Баланс: " + bankAccount.getBalance() + " евро");

        bankAccount.withdraw(8000);
        System.out.println("Баланс: " + bankAccount.getBalance() + " евро");

    }
}
