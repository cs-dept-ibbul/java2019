
/**
 * Write a description of class Printingformat here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class Printingformat
{
   public static void main(String[] args){
System.out.printf("%d",60);
System.out.println();
System.out.printf("%03d%n",9);
System.out.printf("PI %.3f",3.141527);
System.out.println();
System.out.printf("Total is: N%,.2f%n", 84785.8978);
System.out.printf("%-10S%n","Department of Computer Science");
System.out.printf("% .2f",-67.8917);
System.out.println();
System.out.printf("% .2f",67.8917);
System.out.println();
System.out.printf("%C",'a');
System.out.println();
}
}