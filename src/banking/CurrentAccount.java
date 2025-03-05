package banking;

public class CurrentAccount extends BankAccount
{
    private final double OverDraftLimit = 25000;
    public CurrentAccount(String accountNumber, String accountHolderName, double balance)
    {
        super(accountNumber, accountHolderName, balance);
    }

    public void withdraw(double amount) throws InsufficientFundsException
    {
        if (balance + OverDraftLimit < amount) { throw new InsufficientFundsException("Withdrawal amount exceeds the overdraft limit in Current Account");
        }
        balance = balance - amount;
        System.out.println("Withdrawn " + amount + " New balance is " + balance);
    }
}