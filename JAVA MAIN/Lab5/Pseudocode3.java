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
public class Pseudocode3 {
    public static void main(String [] args){
        int passes =0;
        int failures=0;
        int student=0;
        int result;
        
        Scanner input = new Scanner(System.in);
        
        while (student<=10){
             System.out.println("Enter result ( 1=pass,2=fail ): ");
             result = input.nextInt();  
             
             if (result==1){
                 passes=passes+1;
        
        }
             else{
                 failures=failures+1;
             }
     
                student=student+1;
        }
        System.out.println("Passed :"+passes);    
        System.out.println("Failed :"+failures);
        
        if(passes>8){
        System.out.println("Raise tuition");
        
        }
    
        return;
    }
    
}
