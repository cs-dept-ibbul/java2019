
/**
 * Write a description of class PseudocodeB here.
 
/*
 * @author (your name)
 * @version (a version number or a date)
 
*/

import java.util.Scanner;

public class PseudocodeB
{
   
 public static void main(String[] args){
       
 Scanner input =new Scanner(System.in);
     
   double total=0,grade,average;
      
  int gradeCounter=0;
      
  System.out.println("Enter grade or 0 to exist: ");
      
  grade=input.nextDouble();
       
 while(grade!=0)
        {
            
          
  total+=grade;
         
   gradeCounter++;
         
   System.out.println("Enter next grade: ");
           
 grade=input.nextDouble();
          
  if(grade==0){
              
  break;
          
  }
            
     
   }
     
   if(gradeCounter!=0){
          
      average=total/gradeCounter;
       
         System.out.println("The class average is  "+average);
    
    }
    
    else{
          
  System.out.println("No grades were entered!");

        }
  
  }

}
