/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package assignment;

/**
 *
 * @author UMAR HARUNA A ZAKARI
 */
public class BankAccount {
    private int accountNumber;private String customerName;private double balance;//instance variables
    
        public BankAccount(int myAccountNumber, String myCustomerName, double myBalance){//Constructor
            accountNumber=myAccountNumber;
            customerName=myCustomerName;
            balance=myBalance;
        }
            public double deposit(double initialDeposit){
                
            return balance=initialDeposit + balance;
            }
            public double withdrawal(double newWithdrawal){
             return balance= balance - newWithdrawal;
                    }
           
            
            public double getBalance(){
            return balance;
            }
    
    
}
