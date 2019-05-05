/**
 * Write a description of BankAccount here.
 * 
 * @author (Ndaliman Abdullahi Muhammed) 
 * @U15/FNS/CSC/014
 */
public class BankAccount
{
    // instance variables - replace the example below with your own
    private int accountNumber;
    private String customerName;
    private double balance;

    /**
     * Constructor for objects of class BankAccount
     */
    public BankAccount(int acctNumber, String custName, double bal)
    {
        accountNumber=acctNumber;
        customerName=custName;
        balance=bal;
    }

    //method deposit
    public void deposit(double deposit)
    {
        balance+=deposit;
    }
    //method withdraw
    public double withdraw(double withdraw)
    {
        balance-=withdraw;
        return balance;
    }
    public double getBalance()
    {
        return balance;
    }
}
