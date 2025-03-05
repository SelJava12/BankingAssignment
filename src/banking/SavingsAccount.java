package banking;

//public class SavingsAccount extends BankAccount Inheritance
public class SavingsAccount extends BankAccount implements InterestCalculator

{
    private static final double InterestRate = 0.08;

    //constructor
    public SavingsAccount(String accountNumber, String accountHolderName, double balance)
    {
        super(accountNumber, accountHolderName, balance);
    }
    @Override
    public void withdraw(double amount) throws InsufficientFundsException
    {
        if (amount > balance)
        {
            throw new InsufficientFundsException("Cannot withdraw more than the available balance in Savings Account.");
        }

        balance = balance - amount;
        System.out.println("Withdrawn " + amount + " New balance is " + balance);
    }
    //@Override
    public double calculateInterest()
    {
        return balance * InterestRate;
    }
}