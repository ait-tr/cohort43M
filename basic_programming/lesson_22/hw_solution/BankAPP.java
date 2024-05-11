public class BankAPP {
    public static void main(String[] args) {
        BankAccount bankAccount1= new BankAccount(111111111,"Petr Petrov","PrivatBank",0);
        BankAccount bankAccount2= new BankAccount(222222222,"Sergey Sergeev","PrivatBank",1400);
        BankAccount bankAccount3= new BankAccount(333333333,"Ivan Ivanov","PrivatBank",230);

        System.out.println(bankAccount2.toString());
        bankAccount2.Withdraw(1400);
        bankAccount2.Deposit(2000);

    }
}
