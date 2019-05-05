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
public class Box {
    public static void main(String[] args) {
       Scanner input=new Scanner(System.in);
 
        System.out.println("Enter the Length: ");
        double L=input.nextDouble();
        
        
        System.out.println("Enter the Width: ");
        double W=input.nextDouble();
        
        
        System.out.println("Enter the Height: ");
        double H=input.nextDouble();
        
        double Volume=L*W*H;
        double Surface_AREA=2*(L*W + L*H + W*H);
        
        System.out.println("The Volume of the Box: "+Volume);
        System.out.println("The Surface_AREA of the Box: "+Surface_AREA);
        
        
        
        
        
        
        
        
        
                
        
    
        
        
        
        
       
     
        
    
    
    
    }
}
