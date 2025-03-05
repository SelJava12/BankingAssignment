package banking;
public abstract class BankAccount
{
    //Variable declaration
    String accountNumber;
    String accountHolderName;
    double balance;

    //
    public BankAccount(String accountNumber, String accountHolderName, double balance)

    {
        this.accountNumber=accountNumber;
        this.accountHolderName=accountHolderName;

        this.balance=balance;

    }
    public abstract void withdraw(double amount) throws InsufficientFundsException;
//    public void withdraw(double amount)
//    {
//        balance = balance - amount;
//        System.out.println("Total Withdrawal: "+amount+ " New Balance amount: "+balance);
//    }

    public void deposit(double amount)
    {

        balance = balance + amount;
        System.out.println("Total Deposit: "+amount+ " New Balance amount: "+balance);
    }

    public void displayBalance()
    {
        System.out.println("Account Number: "+accountNumber);
        System.out.println("Account Holder Name: "+accountHolderName);
        System.out.println("Account balance: "+balance);

    }
}
