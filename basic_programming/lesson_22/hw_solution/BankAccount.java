public class BankAccount {

    private int Id;
    private String owner;
    private String bankName;
    private double balance;

    public BankAccount(int id, String owner, String bankName, double balance) {
        Id = id;
        this.owner = owner;
        this.bankName = bankName;
        this.balance = balance;
    }

    public long getId() {
        return Id;
    }

    public void setId(int id) {
        Id = id;
    }

    public String getOwner() {
        return owner;
    }

    public void setOwner(String owner) {
        this.owner = owner;
    }

    public String getBankName() {
        return bankName;
    }

    public void setBankName(String bankName) {
        this.bankName = bankName;
    }

    public double getBalance() {
        return balance;
    }

    public void setBalance(double balance) {
        this.balance = balance;
    }

    @Override
    public String toString() {
        return "BankAccount{" +
                "Id=" + Id +
                ", owner='" + owner + '\'' +
                ", bankName='" + bankName + '\'' +
                ", balance=" + balance +
                '}';
    }

    public boolean Withdraw(double sum){
        if(sum<=balance) {
            balance = balance - sum;
            System.out.println("Снятие "+sum+ " успешно завершено. На вашем счету: "+ balance);
            return true;
        }
        System.out.println("Недостаточно средств. Доступная сумма для вывода: "+ balance);
        return false;
    }
    public boolean Deposit(double sum){
        balance=balance+sum;
        System.out.println("Внесено на счёт: "+sum+"."+" на вашем счету: "+ balance);
        return true;
    }
}
