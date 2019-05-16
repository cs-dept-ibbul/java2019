/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package assignment;

public class BoxDemo{
            public static void main (String[] args){
                //Create two box objects
                BoxC box1 = new BoxC(20.0,12.0,15.0);
                BoxC box2 = new BoxC(9.0,5.0,12.0);
                double volume ,area;
                
                volume=box1.volume();
                area=box1.surfaceArea();
                
                //volume and surface area of box1
                System.out.println("the volume of box1 is: "+volume+" cubic cm" );
                System.out.println("the area of box1 is: "+area+" square cm\n" );
                
                //volume and surface area of box2
                System.out.println("the volume of box2 is: "+box2.volume()+" cubic cm" );
                System.out.println("the area of box2 is: "+box2.surfaceArea()+" square cm\n" );
 
              
            }
}