/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package assignment;
import java.util.Scanner;
/**
 *2
 * @author Umar Jibrin Ndajiya
 */
public class ArithmeticProgression {
    
 

  public static void main(String[] args)
  {
    Scanner input = new Scanner(System.in);
 
    double firstTerm = 0;
    double numberOfTerms = 0;
    double nthTerm = 0;
    double commonDifference = 0;
    double  sum= 0;
    double term = 0;
 
    System.out.print("Enter the value of a (First Term) : ");
    firstTerm = input.nextDouble();
 
    System.out.print("Enter the value of d (Common Difference) : ");
    commonDifference = input.nextDouble();
 
    System.out.print("Enter the value of n (Number of terms) : ");
    numberOfTerms = input.nextDouble();
 
    nthTerm = firstTerm + (numberOfTerms - 1) * commonDifference;
 
    sum = numberOfTerms * (2 * firstTerm + (numberOfTerms - 1) * commonDifference)/2;
 
    System.out.println("");
    System.out.println("The Arithmetic Progression is as follows :");
 
    for(int i = 0; i < numberOfTerms; i++){
      term = firstTerm + i * commonDifference;
      System.out.print(term+" + ");
    }
 
    System.out.println("...");
    System.out.println("The nthTerm of the series : " + nthTerm);
    System.out.println("The Sum of n terms of series : " + sum);
  }
}

    

