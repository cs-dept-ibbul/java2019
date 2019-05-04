
/**
 * Write a description of class PseudocodeC here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
import java.util.Scanner;
public class PseudocodeC
{
public static void main(String[]arg){
int passes=0;
int failure=0;
int student=1;
int result;
Scanner input = new Scanner(System.in);
while(student<=10){
System.out.println("Enter result,1=pass,0=fail:");
result=input.nextInt();
if(result==1)
passes=passes+1;
else
failure=failure+1;
student=student+1;
}
System.out.println("Passed: "+passes);
System.out.println("Failed: "+failure);
if(passes>8)
System.out.println("Execellent to instructor");
}   
}
