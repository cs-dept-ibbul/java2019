/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package assignment;

/**
 *
 * @author UMAR HARUNA A ZAKARI
 */
public class BoxC {
    private double length, width, height; //Instance variable 
    
        public BoxC(double boxlength, double boxwidth, double boxheight){//Constructor
            length=boxlength;
            width=boxwidth;
            height=boxheight;
        }
            
        public double volume(){//Instant methods
            return length*width*height;
             
        }
        
        public double surfaceArea(){
            return 2*(length*width + length*height + width*height);
     
        }
        
        
}


