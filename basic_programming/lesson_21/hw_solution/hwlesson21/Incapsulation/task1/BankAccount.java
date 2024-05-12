package hwlesson21.Incapsulation.task1;

public class BankAccount {
    private long balance;

    public BankAccount(long balance) {
        this.balance = balance;
    }

    public long getBalance() {
        return balance;
    }

    @Override
    public String toString() {
        return "BankAccount{" +
                "Balance=" + balance +
                '}';
    }
    public String deposit(int depositAmount){
        balance += depositAmount;
        String messageDeposit = "You deposited "+ depositAmount + "to your bank account.";
        return messageDeposit;
    }
    public String withdraw (int withdrawAmount){
        balance -= withdrawAmount;
        String messageWithdraw = "You withdraw "+ withdrawAmount + "to your bank account.";
        return messageWithdraw;
    }


}
