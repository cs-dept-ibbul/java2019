/**
 * Write a description of class BankAccountDemo here.
 * 
 * @author (Ndaliman Abdullahi Muhammed) 
 * @U15/FNS/CSC/014
 */
import java.util.Scanner;
public class BankAccountDemo
{
    public static void main(String[] args){
        Scanner bank= new Scanner(System.in);
        int accountNumber;
        double balance,withdraw,deposit;
        String accountName;
        
        System.out.print("\nEnter Account Number: ");
        accountNumber=bank.nextInt();
        bank.nextLine();
        System.out.print("Enter Customer name: ");
        accountName=bank.nextLine();
        System.out.print("Enter initial balance: ");
        balance=bank.nextDouble();
        bank.nextLine();
        BankAccount account= new BankAccount(accountNumber,accountName,balance);
       // BankAccount account= new BankAccount(accountNumber,accountName,balance);
       
       
        System.out.print("\nEnter amount to deposit: ");
        deposit=bank.nextDouble();
        account.deposit(deposit);
        System.out.print("New balance is: "+account.getBalance());
        System.out.print("\n\nEnter amount to withdraw: ");
        withdraw=bank.nextDouble();
        account.withdraw(withdraw);
        System.out.print("New balance is: "+account.getBalance());
    }
}
