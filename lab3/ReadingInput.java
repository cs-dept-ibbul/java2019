   import java.util.Scanner;
   import java.io.IOException;
   public class ReadingInput
   { 
       public static void main(String[] args)throws IOException { 
       Scanner input = new Scanner(System.in);   
       System.out.print("Please enter your name: ");  
       String name = input.nextLine();        
       System.out.print("Now enter your age: ");  
       int age = input.nextInt();   
       System.out.print("Enter amount to donate: ");  
       double amount = input.nextDouble();        
       System.out.printf("Mr. %s after one year you will be %d years\n",name, (age+1));
    }
}
       
       
       