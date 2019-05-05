/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package assignment;

import java.util.Scanner;

/**
 *
 * @author UMAR HARUNA A ZAKARI
 */
public class triangle {
    public static void main(String[] args) {
       Scanner input=new Scanner(System.in);
 
        System.out.println("Enter the of a: ");
        double A=input.nextDouble();
        
        
        System.out.println("Enter the of b: ");
        double B=input.nextDouble();
        
        
        System.out.println("Enter the of c ");
        double C=input.nextDouble();
        
        double P=A+B+C;
        double R=C%A;
        
        
        System.out.println("The Perimeter of a triangle is: "+P);
        System.out.println( "The area of triangle with sides a="+A+"b="+B+"c="+C);
        System.out.println("The the longest side is: "+C);
        System.out.println("The the smallest side is: "+A);
        System.out.println("The the longest side is: "+R);
        

    }}
        

