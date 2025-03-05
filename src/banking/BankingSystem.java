package banking;

public class BankingSystem
{
    public static void main(String[] args)
{
    try
    {
        // Create instances of SavingsAccount and CurrentAccount
        BankAccount SavingsAccount = new SavingsAccount("A123456", "Dave", 5000);
        BankAccount currentAccount = new CurrentAccount("B234567", "Bob", 3500);
        System.out.println("********Savings account details********");
        SavingsAccount.displayBalance();

        System.out.println("**********Current account details*******");
        currentAccount.displayBalance();

        System.out.println("******************************************");

        // Savings account deposit
        SavingsAccount.deposit(2000);

        //Current Account deposit
        currentAccount.deposit(3000);

        // Calculate and display interest for SavingsAccount
            InterestCalculator interestCal = (InterestCalculator) SavingsAccount;
            double interest = interestCal.calculateInterest();
            System.out.println("Calculated interest for SavingsAccount: $" + interest);

        // successful withdrawal scenario
        SavingsAccount.withdraw(5000); // Withdraws from SavingsAccount
        currentAccount.withdraw(4000); // Withdraws from CurrentAccount

        // InsufficientFundsException in SavingsAccount
        SavingsAccount.withdraw(12000);
         }
    catch (InsufficientFundsException e2)// Will throw exception
    {
        System.out.println(e2.getMessage());
    }
    try
    {
        // Successful overdraft limit upto 25K
        BankAccount currentAccount = new CurrentAccount("123456", "John Dove", 5000);
        currentAccount.withdraw(20000); // Uses overdraft limit (25000)
        }
    catch (InsufficientFundsException e2)
    {
        System.out.println(e2.getMessage());
    }
}
 //displayBalance();

}