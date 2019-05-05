import java.util.Scanner;
public class BankAccountDemo
{
   public static void main(String[] args)
   {
       Scanner input = new Scanner(System.in);
       
       System.out.println("Enter Account Number: ");
       String accNo = input.nextLine();
       
       System.out.println("Enter Customer Name: ");
       String name = input.nextLine();
       
       System.out.println("Enter Initial Balance: ");
       int bal = input.nextInt();
       
       BankAccount bankAccount = new BankAccount(accNo, name, bal);
       
       System.out.println("Enter amount to deposit: ");
       bankAccount.deposit(input.nextInt());
       
       System.out.println("New balance is: " + bankAccount.getBalance());
       
       System.out.println("Enter amount to withdraw: ");
       bankAccount.withdraw(input.nextInt());
       
       System.out.println("New balance is: " + bankAccount.getBalance() + "\n\n");
       
       
   }
}
