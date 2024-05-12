package homework_bankAccaount;

public class BankAccount {

    private int id;
    private String name;
    private double balance;

    public BankAccount(int id, String name, double balance) {
        this.id = id;
        this.name = name;
        this.balance = balance;
    }

    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public double getBalance() {
        return balance;
    }

    public void deposit(int id, double amount){
        if (amount > 0){
            balance +=amount;
            System.out.println(amount + " Deposited success for client: " + id );
        } else{
            System.out.println("Invalid amount ");
        }
    }
    public void withdraw(int id, double amount){
        if(amount > 0 && balance >= amount){
            balance -= amount;
            System.out.println(amount + " Withdraw success for client: " + id);
        } else {
            System.out.println(" Invalid amount for withdraw");
        }
    }
}
