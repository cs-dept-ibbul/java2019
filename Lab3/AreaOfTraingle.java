
/**
 * Write a description of class areaOfTraingle here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
import java.util.Scanner;
public class AreaOfTraingle
{
    public static void main(String[] args){
        Scanner input=new Scanner(System.in);
        double a,b,c,p,longest,smallest,remainder,area;
        System.out.println("Enter the value of side a");
        a=input.nextDouble();
        System.out.println("Enter the value of side b");
        b=input.nextDouble();
        System.out.println("Enter the value of side c");
        c=input.nextDouble();
        p=a+b+c;
        area=Math.sqrt(p*(p-a)*(p-b)*(p-c));
        if( a >= b && a >= c){
            longest=a;
        }
        else if (b >= a && b >= c){
            longest=b;
        }
        else{
            longest=c;
            }
        if( a <= b && a <= c){
            smallest=a;
        }
        else if (b <= a && b <= c){
            smallest=b;
        }
        else{
            smallest=c;
        }
        remainder=longest%smallest;
        System.out.println("\nThe Perimeter of triangle is: "+p);
        System.out.println("\nThe area of triangle with sides a= "+a+" b= "+b+" c= "+c+" is "+String.format("%.2f",area)+"units");
        System.out.println("\nThe longest side is: "+longest);
        System.out.println("\nThe smallest side is: "+smallest);
        System.out.println("\nThe remainder is: "+remainder);
    }
}
