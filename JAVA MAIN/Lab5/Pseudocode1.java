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
public class Pseudocode1 {
    
    public static void main(String [] args){
        
        int counter,total,num,average;
                Scanner input = new Scanner(System.in);;
        
                counter=1;
                total=0;
        
        
        
        while(counter<=10){
            
            System.out.println("Enter Number");
             num = input.nextInt();                   
             
             total=total+num;
             counter=counter+1;     
        }
        
        average=total/10;
        
        
        
        System.out.println("total :"+average);
         
}
    }
