/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bankaccount;

/**
 *
 * @author hp
 */
//MATRIC NUMBER:U16/FNS/CSC/2087
//NAME:Abdullahi idris
public class BankAccount {
private int accountNumber;
private String customerName;
private double balance;
    public BankAccount (int acctNumber, String custName, double bal){
        accountNumber=acctNumber;
        customerName=custName;
        balance=bal;
    }
    public void deposit(double deposit){
        balance+=deposit;
    }
    public double withdraw(double withdraw){
        balance-=withdraw;
        return balance;
    }
    public double getBalance(){
        return balance;
    }
          
        
    }
    

