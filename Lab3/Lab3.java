
/**
 * Write a description of class Lab3 here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
import java.util.Scanner;
public class Lab3
{
    public static void main(String[]arg){
System.out.println("\nEXERCISES 01 Volume&Surface-area");
Scanner scann  = new Scanner(System.in);
System.out.println("Enter the length:");
double l = scann.nextDouble();
System.out.println("Enter the width:");
double w = scann.nextDouble();
System.out.println("Enter the heigth:");
double h = scann.nextDouble();
double volume = (h*w*l);
double surface = 2*(l*w+l*h+w*h);
System.out.println("The volume of the box: "+volume);
System.out.println("The surface area of the box: "+surface);
System.out.println("\nEXERCISES 02 USERNAME&DOMAIN");
    Scanner scan  = new Scanner(System.in);
     String domain,username;
      System.out.println("Please enter a valid email address");
       String email = scan.nextLine();   
        username = email.split("@")[0];
         domain = email.substring(email.indexOf("@")+1);
         //username = email.substring(email.indexOf("@")-1);         
          System.out.println("\nUsername:"+ username); 
           System.out.println("Domain:"+ domain);
           
System.out.println("\nEXERCISES 03 Perimeter&Area");
    Scanner scan1  = new Scanner(System.in);
    System.out.println("Enter the 1st sides:");
    int a = scan1.nextInt();
    System.out.println("Enter the 2nd sides:");
    int b = scan1.nextInt();
    System.out.println("Enter the 3rd sides:");
    int c = scan1.nextInt();
    double s =(a+b+c)/2;
    double area = Math.sqrt(s*(s-a)*(s-b)*(s-c)); 
    System.out.println("The Perimeter of triangle is: "+s);
    System.out.println("The area of the triangle with the input sides is "+ area+"unit square");
    if(a>b && a>c){
    System.out.println("The longest side is: "+a);
    }else if(b>c){
    System.out.println("The longest side is: "+b);
    }else{
    System.out.println("The longest side is: "+c);
    }
    
    if(a<b && a<c){
    System.out.println("The smallest side is: "+a);
    }else if(b<c){
    System.out.println("The smallest side is: "+b);
    }else{
    System.out.println("The smallest side is: "+c);
    }

}
}
