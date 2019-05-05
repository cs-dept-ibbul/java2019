/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
//MATRIC NUMBER:U16/FNS/CSC/2087;
//NAME:Abdullahi idris;
package PseudocodeC;

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
