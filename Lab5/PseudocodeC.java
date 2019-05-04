
import java.util.Scanner;

public class PseudocodeC
{
  
  public static void main(String[] args){
     
   Scanner input =new Scanner(System.in);
     
   double total=0,exam,average;
      
  int passes=0,failures=0,counter=1;
      
  while(counter<=10)
     
   {
            
System.out.println("Enter exam result: ");
        
    exam=input.nextDouble();
        
    if(exam>=45){
            
    passes++;
       
     }
    
        else{
           
     failures++;
      
      }
     
       counter++;
   
     }
       
 System.out.println("\nThe number of passes is "+passes);
     
   System.out.println("The number of failures is "+failures);
    
    if(passes>8){
        
    System.out.println("\nExcellent to instructor");
 
       }
  
  }

}
