/**
 * Write a description of class Lab3 here.
 * 
 * @author (your name) 
 * @version (U16/FNS/CSC/2076) 
 (a version number or a date)
 */
import java.util.Scanner;
public class LabThree
{
    public static void main(String[]arg){
System.out.println("\nAssignment One\n\n Volume & Surface-area\n");
Scanner scann  = new Scanner(System.in);
System.out.println("Kindly Enter the length:");
double l = scann.nextDouble();
System.out.println("Kindly Enter the width:");
double w = scann.nextDouble();
System.out.println("Kindly Enter the heigth:");
double h = scann.nextDouble();
double volume = (h*w*l);
double surface = 2*(l*w+l*h+w*h);
System.out.println("The volume of the box: "+volume);
System.out.println("The surface area of the box: "+surface);
//END OF ASSIGNMENT ONE

System.out.println("\nAssignment Two\n\n Username & Domain\n");
    Scanner scan  = new Scanner(System.in);
     String domain,username;
      System.out.println("Kindly give me a valid email address");
       String email = scan.nextLine();   
        username = email.split("@")[0];
         domain = email.substring(email.indexOf("@")+1);
         //username = email.substring(email.indexOf("@")-1);         
          System.out.println("\nUsername:"+ username); 
           System.out.println("Domain:"+ domain);
 //END OF ASSIGNMENT TWO
           
System.out.println("\nAssignment Three\n\n Perimeter & Area\n");
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
    System.out.println("The Area of the triangle with the input sides is "+ area+"unit square");
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