
/**
 * Write a description of class StudentDemo here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */

import java.util.Scanner;

public class StudentDemo
{
    
public static void main(String[] args){
      
  String name;
     
   int idNumber;
     
   double quiz1,quiz2,quiz3;
   
     Scanner input=new Scanner(System.in);
     
   System.out.print("\n\nEnter Student name: ");
     
   name=input.nextLine();
    
    System.out.print("Enter Student ID: ");
       
 idNumber=input.nextInt();
      
  System.out.print("Enter Quiz1 score: ");
     
   quiz1=input.nextDouble();
     
   System.out.print("Enter Quiz2 score: ");
     
   quiz2=input.nextDouble();
     
   System.out.print("Enter Quiz3 score: ");
       
 quiz3=input.nextDouble();
        
  
      Student study=new Student(name,idNumber,quiz1,quiz2,quiz3);
        
study.printDetails();
     
   System.out.print("\nAverage: "+study.getAverage());
        
    
    System.out.print("\n\nEnter new score for quiz3: ");
      
  quiz3=input.nextDouble();
      
  study.setQuizThree(quiz3);
        
  
      study.printDetails();
       
 System.out.print("\nAverage: "+study.getAverage());
 
   }

}
