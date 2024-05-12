package hwlesson21.Incapsulation.task1;

public class Main {
    public static void main(String[] args) {
        BankAccount myBankAccount = new BankAccount(5000);
        myBankAccount.deposit(10000);
        System.out.println(myBankAccount.getBalance());
        myBankAccount.withdraw(3000);
        System.out.println(myBankAccount.getBalance());
    }
}
