
/**
 * Write a description of class Equation here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class Equation
{
   public static void main (String []args){
    double a,b,c,root1,root2;
    a=1;
    b=-5;
    c=6;
    root1=(-b+Math.sqrt(Math.pow(b,2)-4*a*c)/2*a);
    System.out.println(root1);
    root2=(-b-Math.sqrt(Math.pow(b,2)-4*a*c)/2*a);
    System.out.println(root2);
    }
}
