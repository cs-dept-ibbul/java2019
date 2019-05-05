/**
 * Write a description of class QuadraticEquation here.
 * 
 * @author (NDALIMAN ABDULLAHI MUHAMMED) 
 * @U15/FNS/CSC/014
 */
import java.util.Scanner;
public class QuadraticEquation
{
    public static void main(String[] args){
        Scanner scan=new Scanner(System.in);
        double a,b,c,root1,root2;
        int determinant;
        System.out.println("Enter value of a: ");
        a=scan.nextDouble();
        System.out.println("Enter value of b: ");
        b=scan.nextDouble();
        System.out.println("Enter value of c: ");
        c=scan.nextDouble();
        root1=(-b+(Math.sqrt(Math.pow(b,2)-(4*a*c))))/(2*a);
        root2=(-b-(Math.sqrt(Math.pow(b,2)-(4*a*c))))/(2*a);
        determinant= (int)(Math.pow(b,2)-(4*a*c));
        System.out.println("\nThe root of the equation is root1: "+root1+"  root2: "+root2);
        System.out.println("Determinant: "+determinant);
        if(determinant>0)
        {
            System.out.println("The root are real and distinct: "+root1+" ,"+root2);
        }
        else if(determinant==0)
        {
            System.out.println("The root are real and equal: "+root1);
        }
        else
        {
            System.out.println("The root are complex");
        }
    }
    
}
