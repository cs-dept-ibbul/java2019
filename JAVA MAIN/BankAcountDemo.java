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
public class BankAcountDemo {
    
    public static void main (String[] args){
                //Create two box objects
                
                
               
                BankAccount Acc1 = new BankAccount(111111,"omar",500);
                BankAccount Acc2 = new BankAccount(222222,"Abubakar",700);
    
                double balance, deposit;
                
                balance=Acc2.getBalance();
                deposit=Acc1.deposit(500);
                
                System.out.println(deposit);
                
}}
