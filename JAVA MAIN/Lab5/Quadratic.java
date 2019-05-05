/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package assignment;

/**
 *
 * @author  Umar Jibrin Ndajiya
 */
public class Quadratic
{
    public static void main(String[] args)
    {
        /*Suppose our Quadratic Equation to be solved
         * is 2x2 + 6x + 4 = 0 .
         * (Assuming that both roots are real valued)
         *
         * General form of a Quadratic Equation is
         * ax2 + bx + c = 0 where 'a' is not equal to 0
         *
         * Hence a = 2, b = 6 and c = 4.
         */
 
        int a = 3;
        int b = 7;
        int c = 9;
 
 
        //Finding out the roots
        
 
        double root1 = (-b + Math.sqrt(Math.pow(b, 2) - 4 * a * c)) / (2*a) ;
        double root2 = (-b - Math.sqrt(Math.pow(b, 2) - 4 * a * c)) / (2*a) ;
 
        System.out.println(root1);
 
  

    }}

