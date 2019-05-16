/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package assignment;

import java.util.Scanner;

/**
 *
 * @author  Umar Jibrin Ndajiya
 */
public class Pseudocode2 {
    public static void main(String [] args){

    int counter,grade,total;
    float average;
    
    Scanner input = new Scanner(System.in);;
    
    total=0;
    counter=0;
    
    System.out.println("Enter grade, -1 to end: ");
    grade = input.nextInt();   
    
    while(grade != -1){
            
            System.out.println("Enter grade, -1 to end: ");
             grade = input.nextInt();                   
             
             total=total+grade;
             counter=counter+1;  
             
             System.out.println("Enter grade, -1 to end: ");
             grade = input.nextInt(); 
        }
    
    
    
        if (counter !=0){
             average = (float)total/counter;
             
             System.out.println("Class average is : "+average);            
        }
        else{
        System.out.println("No grades were entered: ");
        }
        
    }}