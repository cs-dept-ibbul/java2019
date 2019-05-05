/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
//MATRIC NUMBER:U16/FNS/CSC/2087;
//NAME:Abdullahi idris;
package PseudocodeB;

import java.util.Scanner;
public class PseudocodeB
{
  public static void main(String[]arg){
   int  total = 0;
   int counter = 0;
   int grade;
   float average;
    Scanner input = new Scanner(System.in);
      System.out.println("Enter the first grade,type 00 to indicate the end");
       grade=input.nextInt();
    while(grade!=00){
     total=total+grade;
      counter=counter+1;
       System.out.println("Enter the next grade,type 00 to indicate the end");
        grade=input.nextInt();
   if(grade==0){
    break;
    }
}
if(counter!=0){
 average=total/counter;
  System.out.println("The avarage: "+average);
}else
System.out.println("No grades were entered!");   
}
}
