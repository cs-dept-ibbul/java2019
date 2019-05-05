/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
//MATRIC NUMBER:U16/FNS/CSC/2087;
//NAME:Abdullahi idris;
package QuadraticEquation;

import java.util.Scanner;
public class QuadraticEquation
{
    public static void main(String[] args){
        Scanner scan=new Scanner(System.in);
        double a,b,c,root1,root2;
        int determinant;
        System.out.println("Enter value of a: ");
        a=scan.nextDouble();
        System.out.println("Enter value of b: ");
        b=scan.nextDouble();
        System.out.println("Enter value of c: ");
        c=scan.nextDouble();
        root1=(-b+(Math.sqrt(Math.pow(b,2)-(4*a*c))))/(2*a);
        root2=(-b-(Math.sqrt(Math.pow(b,2)-(4*a*c))))/(2*a);
        determinant= (int)(Math.pow(b,2)-(4*a*c));
        System.out.println("\nThe root of the equation is root1: "+root1+"  root2: "+root2);
        System.out.println("Determinant: "+determinant);
        if(determinant>0)
        {
            System.out.println("The root are real and distinct: "+root1+" ,"+root2);
        }
        else if(determinant==0)
        {
            System.out.println("The root are real and equal: "+root1);
        }
        else
        {
            System.out.println("The root are complex");
        }
    }
    
}
