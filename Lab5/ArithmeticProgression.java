
/**
 * Write a description of class ArithmeticProgression here.
 
/*
 * @author (your name)
 * @version (a version number or a date)
 
*/

import java.util.Scanner;

public class ArithmeticProgression
{
  
  public static void main(String[] args){
      
  int a,d,n;
       
 double tn,sn;
       
 Scanner me = new Scanner(System.in);
     
   System.out.println("Enter first term \"a\" :");
      
  a=me.nextInt();
       
 System.out.println("Enter common difference \"d\" :");
       
 d=me.nextInt();
        
  
      do{
          
  System.out.println("Enter number of term \"n\" :");
        
    n=me.nextInt();
    
    }
while(n<1);
       
 tn=a+((n-1)*d);
     
   sn=(n/2)*(a+tn);
      
  System.out.println("Tn: "+tn);
     
   System.out.println("Sn: "+sn);
   
 }

}
