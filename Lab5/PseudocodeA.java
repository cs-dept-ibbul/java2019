import java.util.Scanner;

public class PseudocodeA
{
  
  public static void main(String[] args){
     
   Scanner input =new Scanner(System.in);
       
 double total=0,grade,average;
       
 int gradeCounter=1;
      
  while(gradeCounter<=10)
        {
         
   System.out.println("Enter new grade: ");
       
     grade=input.nextDouble();
            
total+=grade;
          
  gradeCounter++;
      
  }
       
 average=total/10;
       
 System.out.println("The class average is  "+average);
  
  }

}
