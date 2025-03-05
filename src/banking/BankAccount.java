package banking;
public abstract class BankAccount
{
    //Variable declaration
    String accountNumber;
    String accountHolderName;
    double balance;

    //Constructor
    public BankAccount(String accountNumber, String accountHolderName, double balance)

    {
        this.accountNumber=accountNumber;
        this.accountHolderName=accountHolderName;

        this.balance=balance;

    }

    //Method to withdraw money
    public abstract void withdraw(double amount) throws InsufficientFundsException;
//    public void withdraw(double amount)
//    {
//        balance = balance - amount;
//        System.out.println("Total Withdrawal: "+amount+ " New Balance amount: "+balance);
//    }

    //Method to deposit money
    public void deposit(double amount)
    {

        balance = balance + amount;
        System.out.println("Total Deposit: "+amount+ " New Balance amount: "+balance);
    }

    //method to display balance
    public void displayBalance()
    {
        System.out.println("Account Number: "+accountNumber);
        System.out.println("Account Holder Name: "+accountHolderName);
        System.out.println("Account balance: "+balance);

    }
}
