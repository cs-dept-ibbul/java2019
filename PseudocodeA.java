/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
//MATRIC NUMBER:U16/FNS/CSC/2087;
//NAME:Abdullahi idris;
package PsedocodeA;

import java.util.Scanner;
public class PseudocodeA
{
 public static void main(String[]arg){
     int grade;
     double average;
     int total=0;
     int counter=1;
    Scanner input = new Scanner(System.in);
    while(counter<=10){
    System.out.println("Enter enter next grade");
    grade=input.nextInt();
    total=total+grade;
    counter=counter+1;
}
    average = total/10;
    System.out.println("The class avarage: "+average);
}
}
