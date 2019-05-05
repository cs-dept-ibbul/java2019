
/**
 * Write a description of class ArithmeticProgression here.
 * 
 * @author (Ndaliman Abdullahi Muhammed) 
 * @U15/FNS/CSC/014)
 */
import java.util.Scanner;
public class ArithmeticProgression
{ 
   public static void main(String [] args){
       int a,d,n;
       System.out.println("Assignment1\n");
       Scanner input = new Scanner(System.in);
       System.out.println("enter the first term of an arithmetic progression (AP)\n");
       a = input.nextInt();

       System.out.println("enter the common difference of an arithmetic progression (AP)\n");
       d = input.nextInt();

       System.out.println("enter the number of terms of an arithmetic progression (AP)\n");
       n = input.nextInt();
     do{
       System.out.println(" invalid input, n cannot be less than 1,Please enter a valid input");
       n = input.nextInt();
    }
         while(n<1) ;
       double Tn= a+(n-1)*d;
        double Sn = (n/2)*(a+Tn);
        System.out.println("The nth term of the series is: "+Tn);
        System.out.println(" The sum of the first n terms is: "+Sn);

}
}
