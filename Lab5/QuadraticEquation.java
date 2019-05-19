
import java.util.Scanner;
public class QuadraticEquation
{
    public static void main(String[] args){
        Scanner me=new Scanner(System.in);
        double a,b,c,root1,root2;
        int determinant;
        System.out.println("Enter value of a: ");
        a=me.nextDouble();
        System.out.println("Enter value of b: ");
        b=me.nextDouble();
        System.out.println("Enter value of c: ");
        c=me.nextDouble();
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
