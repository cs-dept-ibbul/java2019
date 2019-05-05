
public class BankAccount
{
    
private String accountNumber;
    
private String accountName;
    
private int accountBalance;
    
   

public BankAccount(String number, String name, int balance)
{
     
        accountNumber = number;
        
      accountName = name;
       
    accountBalance = balance;
   
 }
    
    
public void deposit(int amountToDeposit)
   
 {
        
        
  accountBalance = accountBalance + amountToDeposit;
   
 }
    
  
  public void withdraw(int amountToWithdraw)
    {
        
accountBalance = accountBalance - amountToWithdraw;
    
}
    
    
public int getBalance()
    {
       
 return accountBalance;
    
}
}
