/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bankaccountdemo;

/**
 *
 * @author hp
 */
//MATRIC NUMBER:U16/FNS/CSC/2087
//NAME:Abdullahi idris
import java.util.Scanner;
public class BankAccountDemo {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
         
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

    
   
